package DAO;

import config.koneksi;
import model.modelTransaksiSmt;
import service.serviceTransaksiSmt; 
import model.ModelMenu;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.modelTransaksiDetail;



public class TransaksiSmtDAO implements serviceTransaksiSmt {
    private Connection conn;

    public TransaksiSmtDAO() {
        conn = koneksi.getConnection();
    }

   @Override
public void tambahData(modelTransaksiSmt model) {
    PreparedStatement st = null;
    try {
        String sql = "INSERT INTO transaksi_smt (Id_Menu, Barcode, Nama_Menu, Harga, Jumlah, Subtotal) VALUES (?, ?, ?, ?, ?, ?)";
        st = conn.prepareStatement(sql);

        // Set parameter dengan penomoran yang benar
        st.setString(1, model.getModelMenu().getIdMenu());      // Id_Menu
        st.setString(2, model.getModelMenu().getBarcode());     // Barcode
        st.setString(3, model.getModelMenu().getNamaMenu());    // Nama_Menu
        st.setDouble(4, model.getModelMenu().getHarga());       // Harga
        st.setDouble(5, model.getModelTranDet().getJumlah());   // Jumlah
        st.setDouble(6, model.getModelTranDet().getSubtotal()); // Subtotal

        st.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        // Tutup PreparedStatement untuk menghindari kebocoran sumber daya
        if (st != null) {
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

    @Override
    public void perbaruiData(modelTransaksiSmt model) {
        PreparedStatement st = null;
        try {
            String sql = "UPDATE transaksi_smt SET Barcode=?, Nama_Menu=?, Harga=?, Jumlah=?, Subtotal=? WHERE  Id_Menu=?";
            
            st = conn.prepareStatement(sql);
            
            st.setString    (1, model.getModelMenu().getBarcode());
            st.setString    (2, model.getModelMenu().getNamaMenu());
            st.setDouble    (3, model.getModelMenu().getHarga());
            st.setDouble    (4, model.getModelTranDet().getJumlah());
            st.setDouble    (5, model.getModelTranDet().getSubtotal());
            st.setString    (6, model.getModelMenu().getIdMenu());
           
            
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void hapusData(modelTransaksiSmt model) {
        PreparedStatement st = null;
        String sql = "DELETE FROM transaksi_smt WHERE Id_Menu=? AND Barcode=? AND Nama_Menu=? AND Harga=? AND Jumlah=? AND Subtotal=?";
        try {
            st = conn.prepareStatement(sql);
            
            st.setString    (1, model.getModelMenu().getIdMenu());
            st.setString    (2, model.getModelMenu().getBarcode());
            st.setString    (3, model.getModelMenu().getNamaMenu());
            st.setDouble    (4, model.getModelMenu().getHarga());
            st.setDouble    (5, model.getModelTranDet().getJumlah());
            st.setDouble    (6, model.getModelTranDet().getSubtotal());
            
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<modelTransaksiSmt> tampilData() {
        PreparedStatement st = null;
        ResultSet rs = null;
        List list = new ArrayList();
        String sql = "SELECT * FROM transaksi_smt";
        
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                modelTransaksiSmt smt = new modelTransaksiSmt();
                ModelMenu MN = new ModelMenu();
                modelTransaksiDetail det = new modelTransaksiDetail();
                
                MN.setIdMenu(rs.getString("Id_Menu"));
                MN.setBarcode(rs.getString("Barcode"));
                MN.setNamaMenu(rs.getString("Nama_Menu"));
                MN.setHarga(rs.getLong("Harga"));
                
                det.setJumlah(rs.getInt("Jumlah"));
                det.setSubtotal(rs.getLong("Subtotal"));
                
                smt.setModelMenu(MN);
                smt.setModelTranDet(det);
                
                list.add(smt);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    

}