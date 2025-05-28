/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import config.koneksi;
import java.io.InputStream;
import java.sql.Connection;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import service.serviceStruk;

/**
 *
 * @author MyBook Hype AMD
 */
public class StrukDAO implements serviceStruk{
    private Connection conn;

    public StrukDAO() {
        conn = koneksi.getConnection();
    }

    @Override
    public void printStruk(String id) {
        try {
        String reportPath = "/Struk/Struk.jasper";
        InputStream reportStream = getClass().getResourceAsStream(reportPath);

        if (reportStream == null) {
            throw new JRException("File laporan Struk.jasper tidak ditemukan di path: " + reportPath);
        }

        HashMap<String, Object> parameters = new HashMap<>();
        parameters.put("Id_Transaksi", id);
        System.out.println("Mencetak struk untuk Id_Transaksi: " + id);

        JasperPrint print = JasperFillManager.fillReport(reportStream, parameters, conn);
        if (print.getPages().isEmpty()) {
            System.out.println("Laporan kosong: Tidak ada data untuk Id_Transaksi " + id);
        } else {
            System.out.println("Laporan berhasil diisi dengan " + print.getPages().size() + " halaman");
        }

        JasperViewer viewer = new JasperViewer(print, false);
        viewer.setExtendedState(JasperViewer.MAXIMIZED_BOTH);
        viewer.setVisible(true);
    } catch (JRException e) {
        JOptionPane.showMessageDialog(null, "Error mencetak struk: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
    }
    
}
