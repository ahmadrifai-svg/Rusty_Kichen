/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;


import DAO.menuDAO;
import config.koneksi;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ModelMenu;
import service.serviceMenu;
import tableModel.tableModelMenu;
import javax.swing.*;
/**
 *
 * @author MyBook Hype AMD
 */
public class menuMenu extends javax.swing.JPanel {

    /**
     * Creates new form menuMenu
     */
    private final tableModelMenu tblModel = new tableModelMenu();
    private final serviceMenu servis = new menuDAO();
    
    public menuMenu() {
        initComponents();
        tbl_data.setModel(tblModel);
        loadData();
        
      
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_main = new javax.swing.JPanel();
        pn_view = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        custom_ButtonRounded1 = new Palette.Custom_ButtonRounded();
        custom_ButtonRounded2 = new Palette.Custom_ButtonRounded();
        btnTambah = new Palette.Custom_ButtonRounded();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_data = new Palette.JTable_Custom();
        txtPencaarian = new Palette.JTextfieldRounded();
        pn_add = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        custom_ButtonRounded4 = new Palette.Custom_ButtonRounded();
        btnSimpan = new Palette.Custom_ButtonRounded();
        jSeparator3 = new javax.swing.JSeparator();
        txtNama = new Palette.JTextfieldRounded();
        jLabel1 = new javax.swing.JLabel();
        txtHarga = new Palette.JTextfieldRounded();
        jLabel4 = new javax.swing.JLabel();
        txtKategori = new Palette.JTextfieldRounded();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.CardLayout());

        pn_main.setBackground(new java.awt.Color(35, 12, 20));
        pn_main.setLayout(new java.awt.CardLayout());

        pn_view.setBackground(new java.awt.Color(35, 12, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home-removebg-preview 1 (1).png"))); // NOI18N
        jLabel5.setText("jLabel5");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Menu");

        custom_ButtonRounded1.setText("Update");
        custom_ButtonRounded1.setFillOriginal(new java.awt.Color(105, 33, 58));
        custom_ButtonRounded1.setFillOver(new java.awt.Color(105, 33, 58));
        custom_ButtonRounded1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        custom_ButtonRounded1.setPreferredSize(new java.awt.Dimension(120, 19));

        custom_ButtonRounded2.setBackground(new java.awt.Color(105, 33, 58));
        custom_ButtonRounded2.setText("Delete");
        custom_ButtonRounded2.setFillOriginal(new java.awt.Color(105, 33, 58));
        custom_ButtonRounded2.setFillOver(new java.awt.Color(105, 33, 58));
        custom_ButtonRounded2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        custom_ButtonRounded2.setPreferredSize(new java.awt.Dimension(120, 19));

        btnTambah.setBackground(new java.awt.Color(102, 153, 255));
        btnTambah.setText("Tambah");
        btnTambah.setFillOriginal(new java.awt.Color(105, 33, 58));
        btnTambah.setFillOver(new java.awt.Color(105, 33, 58));
        btnTambah.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnTambah.setPreferredSize(new java.awt.Dimension(120, 19));
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        tbl_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(tbl_data);

        txtPencaarian.setForeground(new java.awt.Color(255, 255, 255));
        txtPencaarian.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPencaarianKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pn_viewLayout = new javax.swing.GroupLayout(pn_view);
        pn_view.setLayout(pn_viewLayout);
        pn_viewLayout.setHorizontalGroup(
            pn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_viewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pn_viewLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_viewLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(pn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pn_viewLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1394, Short.MAX_VALUE)
                        .addGap(70, 70, 70))
                    .addGroup(pn_viewLayout.createSequentialGroup()
                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(custom_ButtonRounded1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(custom_ButtonRounded2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 667, Short.MAX_VALUE)
                        .addComponent(txtPencaarian, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))))
        );
        pn_viewLayout.setVerticalGroup(
            pn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_viewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_viewLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(pn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(custom_ButtonRounded1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(custom_ButtonRounded2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pn_viewLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(txtPencaarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        pn_main.add(pn_view, "card2");

        pn_add.setBackground(new java.awt.Color(35, 12, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home-removebg-preview 1 (1).png"))); // NOI18N
        jLabel6.setText("jLabel5");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tambah Menu");

        custom_ButtonRounded4.setText("Batal");
        custom_ButtonRounded4.setFillOriginal(new java.awt.Color(105, 33, 58));
        custom_ButtonRounded4.setFillOver(new java.awt.Color(105, 33, 58));
        custom_ButtonRounded4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        custom_ButtonRounded4.setPreferredSize(new java.awt.Dimension(120, 19));
        custom_ButtonRounded4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custom_ButtonRounded4ActionPerformed(evt);
            }
        });

        btnSimpan.setBackground(new java.awt.Color(102, 153, 255));
        btnSimpan.setText("Simpan");
        btnSimpan.setFillOriginal(new java.awt.Color(105, 33, 58));
        btnSimpan.setFillOver(new java.awt.Color(105, 33, 58));
        btnSimpan.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnSimpan.setPreferredSize(new java.awt.Dimension(120, 19));
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        txtNama.setForeground(new java.awt.Color(255, 255, 255));
        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nama Menu");

        txtHarga.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Harga");

        txtKategori.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Kategori");

        javax.swing.GroupLayout pn_addLayout = new javax.swing.GroupLayout(pn_add);
        pn_add.setLayout(pn_addLayout);
        pn_addLayout.setHorizontalGroup(
            pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_addLayout.createSequentialGroup()
                .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_addLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pn_addLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))))
                    .addGroup(pn_addLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 1095, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pn_addLayout.createSequentialGroup()
                                .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(custom_ButtonRounded4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 1095, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 1095, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addGap(80, 369, Short.MAX_VALUE))
        );
        pn_addLayout.setVerticalGroup(
            pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_addLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(custom_ButtonRounded4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(516, Short.MAX_VALUE))
        );

        pn_main.add(pn_add, "card2");

        add(pn_main, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void custom_ButtonRounded4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custom_ButtonRounded4ActionPerformed
    pn_main.removeAll();
    pn_main.add(pn_view);
    pn_main.repaint();
    pn_main.revalidate();
    }//GEN-LAST:event_custom_ButtonRounded4ActionPerformed

    private void txtPencaarianKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPencaarianKeyReleased
       pencarianData();
    }//GEN-LAST:event_txtPencaarianKeyReleased

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        pn_main.removeAll();
        pn_main.add(pn_add);
        pn_main.repaint();
        pn_main.revalidate();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
    try {
        // Ambil data dari form
        String nama = txtNama.getText().trim();
        String hargaStr = txtHarga.getText().trim();
        String kategoriStr = txtKategori.getText().trim();

        // Validasi input
        if (nama.isEmpty() || hargaStr.isEmpty() || kategoriStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Data tidak boleh kosong!");
            return;
        }

        double harga = Double.parseDouble(hargaStr);

        // Buat objek ModelMenu (id = 0 karena biasanya auto increment)
        ModelMenu menu = new ModelMenu(0,nama, harga, kategoriStr);

        // Simpan ke database lewat service/DAO
        servis.tambahData(menu);

        // Refresh data dan kembali ke panel utama
        loadData();

        pn_main.removeAll();
        pn_main.add(pn_view);
        pn_main.repaint();
        pn_main.revalidate();

        // Kosongkan form
        txtNama.setText("");
        txtHarga.setText("");
        txtKategori.setText("");

        JOptionPane.showMessageDialog(this, "Data berhasil disimpan!");
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Harga harus berupa angka!");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage());
    }

    }//GEN-LAST:event_btnSimpanActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Palette.Custom_ButtonRounded btnSimpan;
    private Palette.Custom_ButtonRounded btnTambah;
    private Palette.Custom_ButtonRounded custom_ButtonRounded1;
    private Palette.Custom_ButtonRounded custom_ButtonRounded2;
    private Palette.Custom_ButtonRounded custom_ButtonRounded4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel pn_add;
    private javax.swing.JPanel pn_main;
    private javax.swing.JPanel pn_view;
    private Palette.JTable_Custom tbl_data;
    private Palette.JTextfieldRounded txtHarga;
    private Palette.JTextfieldRounded txtKategori;
    private Palette.JTextfieldRounded txtNama;
    private Palette.JTextfieldRounded txtPencaarian;
    // End of variables declaration//GEN-END:variables

    private void loadData() { 
      List<ModelMenu> list = servis.tampilData();
       tblModel.setData(list);
    }

    private void pencarianData(){
        List<ModelMenu> list = servis.pencarianData(txtPencaarian.getText());
        tblModel.setData(list);
    }
    
                                          



    
    
}  
    
