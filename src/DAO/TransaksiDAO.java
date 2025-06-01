package DAO;

import config.koneksi;
import model.modelTransaksi;
import service.serviceTransaksi; 
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import javax.swing.JOptionPane;
import model.modelPelanggan;
import model.modelUser;
import model.ModelMeja;


public class TransaksiDAO implements serviceTransaksi {
    private Connection conn;

    public TransaksiDAO() {
        conn = koneksi.getConnection();
    }

   @Override
    public void tambahData(modelTransaksi model) {
        PreparedStatement st = null;
        try {
            String sql = "INSERT INTO transaksi(Id_Transaksi, Id_User, Id_Pelanggan, Id_Meja, Tanggal, Total_Harga, Bayar, Kembali, Diskon) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            st = conn.prepareStatement(sql);

            st.setString(1, model.getIdTransaksi());
            st.setString(2, model.getModelUser().getIdUser());
            st.setString(3, model.getModelPelanggan().getIdPelanggan());
            st.setString(4, model.getModelMeja().getIdMeja());

            // Perbaikan di sini: gunakan Timestamp bukan Date
            st.setTimestamp(5, java.sql.Timestamp.valueOf(model.getTanggal()));  // Pastikan model.getTanggal() formatnya "yyyy-MM-dd HH:mm:ss"

            st.setDouble(6, model.getTotalHarga());
            st.setDouble(7, model.getBayar());
            st.setDouble(8, model.getKembali());
            st.setDouble(9, model.getDiskon());

            st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
}



    
    
 @Override
public List<modelTransaksi> tampilData() {
    PreparedStatement st = null;
    ResultSet rs = null;
    List list = new ArrayList();
     String sql = "SELECT TR.Id_Transaksi, US.Id_User, US.Username, PG.Id_Pelanggan, PG.Nama_Pelanggan, MJ.Id_Meja, MJ.Nomor, " +
             "TR.Tanggal, TR.Total_Harga, TR.Bayar, TR.Kembali, TR.Diskon " +
             "FROM transaksi TR " +
             "INNER JOIN user US ON US.Id_User = TR.Id_User " +
             "INNER JOIN pelanggan PG ON PG.Id_Pelanggan = TR.Id_Pelanggan "
             + "INNER JOIN meja MJ ON MJ.Id_Meja = TR.Id_Meja";

    try {
        st = conn.prepareStatement(sql);
        rs = st.executeQuery();
        
        while (rs.next()) {
            modelTransaksi TR = new modelTransaksi();
            modelUser      US = new modelUser();
            modelPelanggan PG = new modelPelanggan();
            ModelMeja MJ = new ModelMeja();
            
            TR.setIdTransaksi(rs.getString("Id_Transaksi"));
            US.setIdUser                (rs.getString("Id_User"));
            US.setUsername              (rs.getString("Username"));
            PG.setIdPelanggan           (rs.getString("Id_Pelanggan"));
            PG.setNamaPelanggan         (rs.getString("Nama_Pelanggan"));
            MJ.setIdMeja                  (rs.getString("Id_Meja"));
            MJ.setNomor                 (rs.getString("Nomor"));
            TR.setTanggal               (rs.getString("Tanggal"));
            TR.setTotalHarga            (rs.getDouble("Total_Harga"));
            TR.setBayar                 (rs.getDouble("Bayar"));
            TR.setKembali               (rs.getDouble("Kembali"));
            TR.setDiskon                (rs.getDouble("Diskon"));
            
            TR.setModelUser(US);
            TR.setModelPelanggan(PG);
            TR.setModelMeja(MJ);
            
            
            list.add(TR);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return list;
}



   @Override
public List<modelTransaksi> pencarianData(String Id) {
    PreparedStatement st = null;
    ResultSet rs = null;
    List<modelTransaksi> list = new ArrayList<>();

    String sql = "SELECT TR.Id_Transaksi, US.Id_User, US.Username, PG.Id_Pelanggan, PG.Nama_Pelanggan, MJ.Id_Meja, MJ.Nomor, " +
                 "TR.Tanggal, TR.Total_Harga, TR.Bayar, TR.Kembali, TR.Diskon " +
                 "FROM transaksi TR " +
                 "INNER JOIN user US ON US.Id_User = TR.Id_User " +
                 "INNER JOIN pelanggan PG ON PG.Id_Pelanggan = TR.Id_Pelanggan " + // Tambahkan spasi di sini
                 "INNER JOIN meja MJ ON MJ.Id_Meja = TR.Id_Meja " +
                 "WHERE TR.Id_Transaksi LIKE ? " +
                 "OR US.Id_User LIKE ? " +
                 "OR US.Username LIKE ? " +
                 "OR PG.Nama_Pelanggan LIKE ? " +
                 "OR MJ.Nomor LIKE ? " +
                 "OR DATE_FORMAT(TR.Tanggal, '%Y-%m-%d') LIKE ?"; // Tambahkan DATE_FORMAT untuk Tanggal

    try {
        st = conn.prepareStatement(sql);

        // Set semua parameter ? dengan nilai yang sama (mengandung Id)
        for (int i = 1; i <= 6; i++) {
            st.setString(i, "%" + Id + "%");
        }

        rs = st.executeQuery();

        while (rs.next()) {
            modelTransaksi TR = new modelTransaksi();
            modelUser US = new modelUser();
            modelPelanggan PG = new modelPelanggan();
            ModelMeja MJ = new ModelMeja();
            
            TR.setIdTransaksi(rs.getString("Id_Transaksi"));
            US.setIdUser(rs.getString("Id_User"));
            US.setUsername(rs.getString("Username"));
            PG.setIdPelanggan(rs.getString("Id_Pelanggan"));
            PG.setNamaPelanggan(rs.getString("Nama_Pelanggan"));
            MJ.setIdMeja(rs.getString("Id_Meja"));
            MJ.setNomor(rs.getString("Nomor"));
            TR.setTanggal(rs.getString("Tanggal")); // Pastikan tipe data sesuai
            TR.setTotalHarga(rs.getDouble("Total_Harga"));
            TR.setBayar(rs.getDouble("Bayar"));
            TR.setKembali(rs.getDouble("Kembali"));
            TR.setDiskon(rs.getDouble("Diskon"));

            TR.setModelUser(US);
            TR.setModelPelanggan(PG);
            TR.setModelMeja(MJ);

            list.add(TR);
        }

        rs.close();
        st.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return list;
}


 @Override
public String noTransaksi() {
    // Validasi koneksi database
    if (conn == null) {
        JOptionPane.showMessageDialog(null, "Koneksi database tidak tersedia!", "Error", JOptionPane.ERROR_MESSAGE);
        return "TR" + System.currentTimeMillis(); // Fallback
    }

    // Ambil tanggal saat ini
    Date now = new Date();
    SimpleDateFormat noFormat = new SimpleDateFormat("yyMMdd");
    String datePart = noFormat.format(now); // Misalnya, 250523 untuk 23 Mei 2025
    String prefix = "TR" + datePart;

    String sql = "SELECT Id_Transaksi FROM transaksi WHERE Id_Transaksi LIKE ? ORDER BY Id_Transaksi DESC LIMIT 1";
    try (PreparedStatement st = conn.prepareStatement(sql)) {
        // Set parameter untuk query
        st.setString(1, prefix + "%");

        // Eksekusi query
        try (ResultSet rs = st.executeQuery()) {
            String urutan;
            if (rs.next()) {
                String lastId = rs.getString("Id_Transaksi");
                // Ekstrak nomor urut dari Id_Transaksi terakhir (misalnya, "001" dari "TR250523001")
                int lastNumber = Integer.parseInt(lastId.substring(8)); // Ambil 3 digit terakhir
                int newNumber = lastNumber + 1;
                urutan = prefix + String.format("%03d", newNumber); // Contoh: TR250523002
            } else {
                urutan = prefix + "001"; // Mulai dari TR250523001 jika tidak ada data
            }
            return urutan;
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error menghasilkan nomor transaksi: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
        return "TR" + System.currentTimeMillis(); // Fallback dengan timestamp
    }
}

}