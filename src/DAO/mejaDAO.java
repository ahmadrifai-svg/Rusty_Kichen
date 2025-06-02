package DAO;

import config.koneksi;
import model.ModelMeja;
import service.serviceMeja; 
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class mejaDAO implements serviceMeja {
    private Connection conn;

    public mejaDAO() {
        conn = koneksi.getConnection();
    }

    @Override
    public void tambahData(ModelMeja model) {
        PreparedStatement st = null;
        try {
            String sql = "INSERT INTO meja(Id_Meja, Nomor) VALUES ( ?, ?)";
            st = conn.prepareStatement(sql);
            
            st.setString    (1, model.getIdMeja());
            st.setString       (2, model.getNomor());
            
            st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void updateData(ModelMeja model) {
        PreparedStatement st = null;
        try {
            String sql = "UPDATE meja SET Nomor = ? WHERE Id_Meja = ?";
            st = conn.prepareStatement(sql);
            
            st.setString    (1, model.getNomor());
            st.setString    (2, model.getIdMeja());
            
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

   
    @Override
    public void hapusData(ModelMeja model) {
        PreparedStatement st = null;
        String sql = "DELETE FROM meja WHERE Id_Meja = ?";
        try {
            st = conn.prepareStatement(sql);
            st.setString (1, model.getIdMeja());
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
 @Override
public List<ModelMeja> tampilData() {
    PreparedStatement st = null;
    ResultSet rs = null;
    List list = new ArrayList();
     String sql = "SELECT * FROM  meja";
    try {
        st = conn.prepareStatement(sql);
        rs = st.executeQuery();
        
        while (rs.next()) {
            ModelMeja meja = new ModelMeja();
            meja.setIdMeja(rs.getString("Id_Meja"));
            meja.setNomor(rs.getString("Nomor"));
            
            list.add(meja);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return list;
}



   @Override
    public List<ModelMeja> pencarianData(String Id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        List list = new ArrayList();
         String sql = "SELECT * FROM meja WHERE Nomor LIKE '%"+Id+"%' ";
    try {
       
        st = conn.prepareStatement(sql);
        rs = st.executeQuery();
        
        while (rs.next()) {
            ModelMeja meja = new ModelMeja();
            meja.setIdMeja(rs.getString("Id_Meja"));
            meja.setNomor(rs.getString("Nomor"));
            
            list.add(meja);
        }
        rs.close();
        st.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return list;
}

    @Override
    public List<ModelMeja> ambilMeja() {
        PreparedStatement st = null;
        ResultSet rs = null;
        List list = new ArrayList();
         String sql = "SELECT Id_Meja, Nomor FROM meja" ;
         
         try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            
            while (rs.next()) {
            ModelMeja meja = new ModelMeja();
            meja.setIdMeja(rs.getString("Id_Meja"));
            meja.setNomor(rs.getString("Nomor"));
            
            list.add(meja);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
         return list;
    }

  

}