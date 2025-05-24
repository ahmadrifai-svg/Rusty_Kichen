package DAO;

import config.koneksi;
import model.ModelMenu;
import service.serviceMenu; 
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class menuDAO implements serviceMenu {
    private Connection conn;

    public menuDAO() {
        conn = koneksi.getConnection();
    }

    @Override
    public void tambahData(ModelMenu model) {
        PreparedStatement st = null;
        try {
            String sql = "INSERT INTO menu(Nama_Menu, Harga, Id_Kategori) VALUES (?, ?, ?)";
            st = conn.prepareStatement(sql);
            
            st.setString    (1, model.getNamaMenu());
            st.setLong      (2, model.getHarga());
            st.setString       (3, model.getIdKategori());
            
            st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void updateData(ModelMenu model) {
        PreparedStatement st = null;
        try {
            String sql = "UPDATE menu SET Nama_Menu = ?, Harga = ?, Id_Kategori = ? WHERE Id_Menu = ?";
            st = conn.prepareStatement(sql);
            
            st.setString    (1, model.getNamaMenu());
            st.setLong      (2, model.getHarga());
            st.setString    (3, model.getIdKategori());
            st.setString    (4, model.getIdMenu());
            
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

   
    @Override
    public void hapusData(ModelMenu model) {
        PreparedStatement st = null;
        String sql = "DELETE FROM menu WHERE id_menu = ?";
        try {
            st = conn.prepareStatement(sql);
            st.setString (1, model.getIdMenu());
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
 @Override
public List<ModelMenu> tampilData() {
    PreparedStatement st = null;
    ResultSet rs = null;
    List list = new ArrayList();
     String sql = "SELECT * FROM  menu";
    try {
        st = conn.prepareStatement(sql);
        rs = st.executeQuery();
        
        while (rs.next()) {
            ModelMenu menu = new ModelMenu();
            menu.setIdMenu(rs.getString("Id_Menu"));
            menu.setNamaMenu(rs.getString("Nama_Menu"));
            menu.setHarga(rs.getLong("Harga"));
            menu.setBarcode(rs.getString("Barcode"));
            menu.setIdKategori(rs.getString("Id_Kategori"));
            
            list.add(menu);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return list;
}



   @Override
    public List<ModelMenu> pencarianData(String Id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        List list = new ArrayList();
         String sql = "SELECT * FROM menu WHERE Nama_Menu LIKE '%"+Id+"%' "
                 + "OR Harga LIKE '%"+Id+"%'"
                 + "OR Id_Kategori LIKE '%"+Id+"%'" ;
    try {
       
        st = conn.prepareStatement(sql);
        rs = st.executeQuery();
        
        while (rs.next()) {
            ModelMenu menu = new ModelMenu();
            menu.setIdMenu(rs.getString("Id_Menu"));
            menu.setNamaMenu(rs.getString("Nama_Menu"));
            menu.setHarga(rs.getLong("Harga"));
            menu.setIdKategori(rs.getString("Id_Kategori"));
            
            list.add(menu);
        }
        rs.close();
        st.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return list;
}

    @Override
    public List<ModelMenu> pencarianDataByBarcode(String Id) {
       PreparedStatement st = null;
        ResultSet rs = null;
        List<ModelMenu> list = new ArrayList<>();
        String sql = "SELECT * FROM menu WHERE Barcode = ?" ;
        
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, Id);
            rs = st.executeQuery();
            
            if(rs.next()){
                ModelMenu menu = new ModelMenu();
                menu.setIdMenu(rs.getString("Id_Menu"));
                menu.setNamaMenu(rs.getString("Nama_Menu"));
                menu.setHarga(rs.getLong("Harga"));
                menu.setIdKategori(rs.getString("Id_Kategori"));
                menu.setBarcode(rs.getString("Barcode"));
                
                list.add(menu);
            }
            rs.close();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

}