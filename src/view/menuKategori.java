/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import DAO.kategoriDAO;
import config.koneksi;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.modelKategori;
import service.serviceKategori;
import tableModel.tableModelKategori;
import javax.swing.*;



public class menuKategori extends javax.swing.JPanel {

    private final tableModelKategori tblModel = new tableModelKategori();
    private final serviceKategori servis = new kategoriDAO();
    
    
    public menuKategori() {
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
        btn_update = new Palette.Custom_ButtonRounded();
        btn_delete = new Palette.Custom_ButtonRounded();
        btn_tambah = new Palette.Custom_ButtonRounded();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_data = new Palette.JTable_Custom();
        txt_pencarian = new Palette.JTextfieldRounded();
        pn_add = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        custom_ButtonRounded4 = new Palette.Custom_ButtonRounded();
        custom_ButtonRounded6 = new Palette.Custom_ButtonRounded();
        jSeparator3 = new javax.swing.JSeparator();
        txtNama = new Palette.JTextfieldRounded();
        jLabel1 = new javax.swing.JLabel();
        txtJenis = new Palette.JTextfieldRounded();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.CardLayout());

        pn_main.setBackground(new java.awt.Color(35, 12, 20));
        pn_main.setLayout(new java.awt.CardLayout());

        pn_view.setBackground(new java.awt.Color(35, 12, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ktegory.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Kategori");

        btn_update.setText("Update");
        btn_update.setFillOriginal(new java.awt.Color(105, 33, 58));
        btn_update.setFillOver(new java.awt.Color(105, 33, 58));
        btn_update.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_update.setPreferredSize(new java.awt.Dimension(120, 19));
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete.setBackground(new java.awt.Color(105, 33, 58));
        btn_delete.setText("Delete");
        btn_delete.setFillOriginal(new java.awt.Color(105, 33, 58));
        btn_delete.setFillOver(new java.awt.Color(105, 33, 58));
        btn_delete.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_delete.setPreferredSize(new java.awt.Dimension(120, 19));

        btn_tambah.setBackground(new java.awt.Color(102, 153, 255));
        btn_tambah.setText("Tambah");
        btn_tambah.setFillOriginal(new java.awt.Color(105, 33, 58));
        btn_tambah.setFillOver(new java.awt.Color(105, 33, 58));
        btn_tambah.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_tambah.setPreferredSize(new java.awt.Dimension(120, 19));
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        tbl_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nama Kategori", "Kategori"
            }
        ));
        jScrollPane1.setViewportView(tbl_data);

        txt_pencarian.setForeground(new java.awt.Color(255, 255, 255));

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
                        .addComponent(jScrollPane1)
                        .addGap(70, 70, 70))
                    .addGroup(pn_viewLayout.createSequentialGroup()
                        .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 667, Short.MAX_VALUE)
                        .addComponent(txt_pencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pn_viewLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(txt_pencarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(220, Short.MAX_VALUE))
        );

        pn_main.add(pn_view, "card2");

        pn_add.setBackground(new java.awt.Color(35, 12, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home-removebg-preview 1 (1).png"))); // NOI18N
        jLabel6.setText("jLabel5");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tambah Kategori");

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

        custom_ButtonRounded6.setBackground(new java.awt.Color(102, 153, 255));
        custom_ButtonRounded6.setText("Simpan");
        custom_ButtonRounded6.setFillOriginal(new java.awt.Color(105, 33, 58));
        custom_ButtonRounded6.setFillOver(new java.awt.Color(105, 33, 58));
        custom_ButtonRounded6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        custom_ButtonRounded6.setPreferredSize(new java.awt.Dimension(120, 19));
        custom_ButtonRounded6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custom_ButtonRounded6ActionPerformed(evt);
            }
        });

        txtNama.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nama Kategori");

        txtJenis.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Jenis");

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));

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
                                .addComponent(custom_ButtonRounded6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(custom_ButtonRounded4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addComponent(txtJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 1095, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
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
                    .addComponent(custom_ButtonRounded6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(custom_ButtonRounded4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addContainerGap(588, Short.MAX_VALUE))
        );

        pn_main.add(pn_add, "card2");

        add(pn_main, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
    pn_main.removeAll();
    pn_main.add(pn_add);
    pn_main.repaint();
    pn_main.revalidate();
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void custom_ButtonRounded4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custom_ButtonRounded4ActionPerformed
    pn_main.removeAll();
    pn_main.add(pn_view);
    pn_main.repaint();
    pn_main.revalidate();
    }//GEN-LAST:event_custom_ButtonRounded4ActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_updateActionPerformed

    private void custom_ButtonRounded6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custom_ButtonRounded6ActionPerformed
     try {    
        // Ambil data dari form
        String nama = txtNama.getText().trim();
        String jenisStr = txtJenis.getText().trim();
        
        //validasi Input
       if (nama.isEmpty() || jenisStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Data tidak boleh kosong!");
            return;
        }  
       
       // Buat objek ModelMenu (id = 0 karena biasanya auto increment)
        modelKategori kategori = new modelKategori(0, nama, jenisStr);
        
         // Simpan ke database lewat service/DAO
        servis.tambahData(kategori);
        
     // Refresh data dan kembali ke panel utama
        loadData();

        pn_main.removeAll();
        pn_main.add(pn_view);
        pn_main.repaint();
        pn_main.revalidate();

        // Kosongkan form
        txtNama.setText("");
        txtJenis.setText("");

        JOptionPane.showMessageDialog(this, "Data berhasil disimpan!");
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Harga harus berupa angka!");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage());
     }

    }//GEN-LAST:event_custom_ButtonRounded6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Palette.Custom_ButtonRounded btn_delete;
    private Palette.Custom_ButtonRounded btn_tambah;
    private Palette.Custom_ButtonRounded btn_update;
    private Palette.Custom_ButtonRounded custom_ButtonRounded4;
    private Palette.Custom_ButtonRounded custom_ButtonRounded6;
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
    private Palette.JTextfieldRounded txtJenis;
    private Palette.JTextfieldRounded txtNama;
    private Palette.JTextfieldRounded txt_pencarian;
    // End of variables declaration//GEN-END:variables

   private void loadData() { 
      List<modelKategori> list = servis.tampilData();
       tblModel.setData(list);
    }

    private void pencarianData(){
        List<modelKategori> list = servis.pencarianData(txt_pencarian.getText());
        tblModel.setData(list);
    }
}
