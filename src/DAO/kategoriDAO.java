/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import config.koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.modelKategori;
import service.serviceKategori;

/**
 *
 * @author MyBook Hype AMD
 */
public class kategoriDAO implements serviceKategori {
    private Connection conn;
     public kategoriDAO() {
        conn = koneksi.getConnection();
    }

    @Override
    public void tambahData(modelKategori kategori) {
           if (kategori == null || kategori.getnamaKategori() == null || kategori.getjenis() == null) {
            throw new IllegalArgumentException("Data kategori tidak valid");
        }

        String sql = "INSERT INTO kategori (Nama_Kategori, Jenis) VALUES (?, ?)";
        try (PreparedStatement st = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            st.setString(1, kategori.getnamaKategori());
            st.setString(2, kategori.getjenis());
            st.executeUpdate();
            ResultSet rs = st.getGeneratedKeys();
            if (rs.next()) {
                kategori.setIdKategori(rs.getInt(1)); // Set ID ke model
            }
        } catch (SQLException e) {
            throw new RuntimeException("Gagal menambahkan data kategori: " + e.getMessage(), e);
        }
    }

    @Override
    public void updateData(modelKategori kategori) {
            String sql = "UPDATE kategori "
               + "SET Nama_Kategori = ?, Jenis = ? "
               + "WHERE Id_Kategori = ?";
    try (PreparedStatement st = conn.prepareStatement(sql)) {
        st.setString(1, kategori.getnamaKategori());
        st.setString(2, kategori.getjenis());
        st.setInt(3, kategori.getIdKategori());
        st.executeUpdate();   
    } catch (SQLException e) {
        e.printStackTrace();
    }

    }

    @Override
    public void hapusData(int id) {
        PreparedStatement st = null;
        String sql = "DELETE FROM kategori WHERE Id_Kategori=?";
        try {
            st = conn.prepareStatement(sql);
            st.setInt(1, id); // langsung pakai parameter dari method
            st.executeUpdate(); // ✅ Ganti ini
            System.out.println("Data berhasil dihapus");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<modelKategori> tampilData() {
        PreparedStatement st = null;
        ResultSet rs = null;
        
        List list = new ArrayList();
        String sql = "SELECT * FROM kategori";
        
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()) {
               modelKategori kategori = new modelKategori();
               kategori.setIdKategori(rs.getInt("Id_Kategori"));
               kategori.setnamaKategori(rs.getString("Nama_Kategori"));
               kategori.setjenis(rs.getString("jenis"));
               
               list.add(kategori);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;

    }

    @Override
    public List<modelKategori> pencarianData(String keyword) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
