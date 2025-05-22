package DAO;

import config.koneksi;
import service.serviceTransaksiDetail; 
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import model.ModelMenu;
import model.modelPelanggan;
import model.modelTransaksi;
import model.modelTransaksiDetail;
import model.modelUser;


public class TransaksiDetailDAO implements serviceTransaksiDetail {
    private Connection conn;

    public TransaksiDetailDAO() {
        conn = koneksi.getConnection();
    }

    @Override
    public void tambahData(modelTransaksiDetail model) {
        PreparedStatement st = null;
        try {
            String sql = "INSERT INTO detail_transaksi(Id_Transaksi, Id_Menu, Jumlah, Subtotal)"
                    + " SELECT '"+model.getModelTransaksi().getidTransaksi()+"',"
                    + "Id_Menu, Jumlah, Subtotal from transaksi_smt";
            
            st = conn.prepareStatement(sql);
            st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void sumTotal(modelTransaksiDetail model) {
        PreparedStatement st = null;
        ResultSet rs = null;
        String sql = "SELECT SUM(Subtotal) FROM transaksi_smt";
        
        try {
            st = conn.prepareCall(sql);
            rs = st.executeQuery();
            if(rs.next()){
                model.setSubtotal(rs.getLong(1));
            }
        } catch (SQLException ex) {
                ex.printStackTrace();
            }finally {
                if (st!=null){
                    try {
                        st.close();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
            }
        }
    }

    @Override
    public void hapusDataSementara() {
        PreparedStatement st = null;
        String sql = "DELETE FROM transaksi_smt ";
        
        try {
            st = conn.prepareStatement(sql);
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(); 
        }
    }
    
    
 @Override
public List<modelTransaksiDetail> tampilData(String id) {
    PreparedStatement st = null;
    ResultSet rs = null;
    List list = new ArrayList();
     String sql = "SELECT TR.Id_Transaksi, MN.Id_Menu, MN.Nama_Menu, det.Jumlah, det.Subtotal " +
                 "FROM detail_transaksi det " +
                 "INNER JOIN transaksi TR ON TR.Id_Transaksi = det.Id_Transaksi " +
                 "INNER JOIN menu MN ON MN.Id_Menu = det.Id_Menu " +
                 "WHERE TR.Id_Transaksi = ?";
    try {
        st = conn.prepareStatement(sql);
        st.setString(1, id); 
        rs = st.executeQuery();
        
        while (rs.next()) {
            modelTransaksiDetail    det = new modelTransaksiDetail();
            modelTransaksi          TR = new modelTransaksi();
            ModelMenu               MN = new ModelMenu();
            
            TR.setidTransaksi           (rs.getString("Id_Transaksi"));
            MN.setIdMenu                (rs.getString("Id_Menu"));
            MN.setNamaMenu              (rs.getString("Nama_Menu"));
            det.setJumlah               (rs.getInt("Jumlah"));
            det.setSubtotal              (rs.getLong("Subtotal"));
            
            det.setModelTransaksi(TR);
            det.setModelMenu(MN);
            
            
            list.add(det);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return list;
}



   @Override
    public List<modelTransaksiDetail> pencarianData(String Id, String kataKunci) {
        PreparedStatement st = null;
        ResultSet rs = null;
        List list = new ArrayList();
        String sql = "SELECT TR.Id_Transaksi, MN.Id_Menu, MN.Nama_Menu, det.Jumlah, det.Subtotal"
             + "FROM detail_Transaksi det"
             + "INNER JOIN transaksi TR ON TR.Id_Transaksi = det.Id_Transaksi"
             + "INNER JOIN menu MN ON MN.Id_Menu = det.Id_Menu"
             + "WHERE TR.Id_Transaksi='"+Id+"' "
             + "AND TR.Id_Transaksi LIKE '%"+kataKunci+"%'"
             + " OR MN.Id_Menu LIKE '%"+kataKunci+"%'"
                + "OR MN.Nama_Menu LIKE '%"+kataKunci+"%'";
        
    try {
       
        st = conn.prepareStatement(sql);
        rs = st.executeQuery();
        
        while (rs.next()) {
            modelTransaksiDetail    det = new modelTransaksiDetail();
            modelTransaksi          TR = new modelTransaksi();
            ModelMenu               MN = new ModelMenu();
            
            TR.setidTransaksi           (rs.getString("Id_Transaksi"));
            MN.setIdMenu                (rs.getString("Id_Menu"));
            MN.setNamaMenu              (rs.getString("Nama_Menu"));
            det.setJumlah               (rs.getInt("Jumlah"));
            det.setSubtotal                (rs.getLong("Subtotal"));
            
            det.setModelTransaksi(TR);
            det.setModelMenu(MN);
            
            
            list.add(det);
        }
        rs.close();
        st.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return list;
}

    
}