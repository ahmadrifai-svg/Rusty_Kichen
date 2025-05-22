package DAO;

import config.koneksi;
import model.modelPelanggan;
import service.servicePelanggan; 
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class pelangganDAO implements servicePelanggan {
    private Connection conn;

    public pelangganDAO() {
        conn = koneksi.getConnection();
    }

    @Override
    public void tambahData(modelPelanggan model) {
        PreparedStatement st = null;
        try {
            String sql = "INSERT INTO pelanggan(Nama_Pelanggan, Alamat, No_Telp) VALUES (?, ?, ?)";
            st = conn.prepareStatement(sql);
            
            st.setString    (1, model.getNamaPelanggan());
            st.setString    (2, model.getAlamat());
            st.setString    (3, model.getTelepon());
            
            st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void updateData(modelPelanggan model) {
        PreparedStatement st = null;
        try {
            String sql = "UPDATE pelanggan SET Nama_Pelanggan = ?, Alamat = ?, No_Telp=? WHERE Id_Pelanggan = ?";
            st = conn.prepareStatement(sql);
            
            st.setString    (1, model.getNamaPelanggan());
            st.setString    (2, model.getAlamat());
            st.setString    (3, model.getTelepon());
            st.setString    (4, model.getIdPelanggan());
            
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

   
    @Override
    public void hapusData(modelPelanggan model) {
        PreparedStatement st = null;
        String sql = "DELETE FROM pelanggan WHERE Id_Pelanggan = ?";
        try {
            st = conn.prepareStatement(sql);
            st.setString (1, model.getIdPelanggan());
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
 @Override
public List<modelPelanggan> tampilData() {
    PreparedStatement st = null;
    ResultSet rs = null;
    List list = new ArrayList();
     String sql = "SELECT * FROM  menu";
    try {
        st = conn.prepareStatement(sql);
        rs = st.executeQuery();
        
        while (rs.next()) {
            modelPelanggan pelanggan = new modelPelanggan();
            pelanggan.setIdPelanggan(rs.getString("Id_Pelanggan"));
            pelanggan.setNamaPelanggan(rs.getString("Nama_Pelanggan"));
            pelanggan.setAlamat(rs.getString("Alamat"));
            pelanggan.setTelepon(rs.getString("No_Telp"));
            
            list.add(pelanggan);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return list;
}



   @Override
    public List<modelPelanggan> pencarianData(String Id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        List list = new ArrayList();
         String sql = "SELECT * FROM pelanggan WHERE Nama_Pelanggan LIKE '%"+Id+"%' "
                 + "OR Alamat LIKE '%"+Id+"%'"
                 + "OR No_Telp LIKE '%"+Id+"%'" ;
    try {
       
        st = conn.prepareStatement(sql);
        rs = st.executeQuery();
        
        while (rs.next()) {
            modelPelanggan pelanggan = new modelPelanggan();
            pelanggan.setIdPelanggan(rs.getString("Id_Pelanggan"));
            pelanggan.setNamaPelanggan(rs.getString("Nama_Pelanggan"));
            pelanggan.setAlamat(rs.getString("Alamat"));
            pelanggan.setTelepon(rs.getString("No_Telp"));
            
            list.add(pelanggan);
        }
        rs.close();
        st.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return list;
}

    @Override
    public List<modelPelanggan> ambilPelanggan() {
        PreparedStatement st = null;
        ResultSet rs = null;
        List list = new ArrayList();
         String sql = "SELECT Id_Pelanggan, Nama_Pelanggan FROM pelanggan" ;
         
         try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            
            while (rs.next()) {
            modelPelanggan pelanggan = new modelPelanggan();
            pelanggan.setIdPelanggan(rs.getString("Id_Pelanggan"));
            pelanggan.setNamaPelanggan(rs.getString("Nama_Pelanggan"));
            
            list.add(pelanggan);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
         return list;
    }
    
    

}