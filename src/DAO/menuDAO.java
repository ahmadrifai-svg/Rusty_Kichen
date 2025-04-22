package DAO;

import config.koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.ModelMenu;
import service.serviceMenu;

public class menuDAO implements serviceMenu {
    private Connection conn;

    public menuDAO() {
        conn = koneksi.getConnection();
    }

    @Override
    public void tambahData(ModelMenu menu) {
    try {
        // Dapatkan ID kategori berdasarkan nama kategori
        String sqlGetIdKategori = "SELECT Id_Kategori FROM kategori WHERE Nama_Kategori = ?";
        PreparedStatement stmtGetId = conn.prepareStatement(sqlGetIdKategori);
        stmtGetId.setString(1, menu.getNamaKategori()); // Menggunakan nama kategori
        ResultSet rs = stmtGetId.executeQuery();

        if (rs.next()) {
            int kategoriId = rs.getInt("Id_Kategori");

            // Kemudian lakukan INSERT dengan ID kategori
            String sql = "INSERT INTO menu (nama_menu, harga, Id_Kategori) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, menu.getNamaMenu());
            stmt.setDouble(2, menu.getHarga());
            stmt.setInt(3, kategoriId); // Menggunakan ID kategori
            stmt.executeUpdate();
        } else {
            System.out.println("Kategori dengan nama '" + menu.getNamaKategori() + "' tidak ditemukan.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

@Override
public void updateData(ModelMenu menu) {
    try {
        // Query untuk mengupdate data menu berdasarkan idMenu
        String sql = "UPDATE menu SET nama_menu = ?, harga = ?, Id_Kategori = ? WHERE Id_Menu = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        
        // Menetapkan nilai untuk parameter query
        stmt.setString(1, menu.getNamaMenu());  // Set nama menu
        stmt.setDouble(2, menu.getHarga());     // Set harga menu
        stmt.setString(3, menu.getNamaKategori()); // Set kategori menu (nama kategori)
        stmt.setInt(4, menu.getIdMenu());       // Set idMenu untuk mencari data yang akan diupdate

        // Menjalankan perintah update
        stmt.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

   
    public void hapusData(int id) {
        try {
            String sql = "DELETE FROM menu WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
public List<ModelMenu> tampilData() {
    List<ModelMenu> list = new ArrayList<>();
    try {
        // Menggunakan JOIN untuk menampilkan nama kategori dari tabel kategori
        String sql = "SELECT menu.Id_Menu, menu.Nama_Menu, menu.Harga, kategori.Nama_Kategori " +
                     "FROM menu " +
                     "JOIN kategori ON menu.Id_Kategori = kategori.Id_Kategori";

        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            // Perhatikan pengambilan nama kategori sebagai String
            ModelMenu menu = new ModelMenu(
                rs.getInt("Id_Menu"),          // id_menu sebagai integer
                rs.getString("Nama_Menu"),     // nama_menu sebagai string
                rs.getDouble("Harga"),         // harga sebagai double
                rs.getString("Nama_Kategori")  // nama_kategori sebagai string
            );
            list.add(menu);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return list;
}


    @Override
    public List<ModelMenu> pencarianData(String keyword) {
        List<ModelMenu> list = new ArrayList<>();
    try {
        String sql = "SELECT m.id, m.nama_menu, m.harga, k.namaKategori " +
                     "FROM menu m " +
                     "JOIN kategori k ON m.kategori_id = k.id " +
                     "WHERE m.nama_menu LIKE ? OR k.namaKategori LIKE ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, "%" + keyword + "%");
        stmt.setString(2, "%" + keyword + "%");
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            ModelMenu menu = new ModelMenu(
                rs.getInt("id"),
                rs.getString("nama_menu"),
                rs.getDouble("harga"),
                rs.getString("namaKategori") // Menampilkan nama kategori
            );
            list.add(menu);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return list;
    }

    public void perbaruiData(ModelMenu model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void hapusData(ModelMenu model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}