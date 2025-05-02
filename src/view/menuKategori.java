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
     private int selectedIndex = -1;
       private int selectedId = -1;
    
    
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
        btn_tambah = new Palette.Custom_ButtonRounded();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_data = new Palette.JTable_Custom();
        txt_pencarian = new Palette.JTextfieldRounded();
        pn_add = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_batal = new Palette.Custom_ButtonRounded();
        btn_simpan = new Palette.Custom_ButtonRounded();
        jSeparator3 = new javax.swing.JSeparator();
        txtNama = new Palette.JTextfieldRounded();
        jLabel1 = new javax.swing.JLabel();
        txtJenis = new Palette.JTextfieldRounded();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pn_update = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn_update = new Palette.Custom_ButtonRounded();
        btn_batalU = new Palette.Custom_ButtonRounded();
        jSeparator4 = new javax.swing.JSeparator();
        txtNama1 = new Palette.JTextfieldRounded();
        jLabel10 = new javax.swing.JLabel();
        txtJenis1 = new Palette.JTextfieldRounded();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

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
        tbl_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_dataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_data);

        txt_pencarian.setForeground(new java.awt.Color(255, 255, 255));
        txt_pencarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pencarianActionPerformed(evt);
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
                        .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        btn_batal.setText("Batal");
        btn_batal.setFillOriginal(new java.awt.Color(105, 33, 58));
        btn_batal.setFillOver(new java.awt.Color(105, 33, 58));
        btn_batal.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_batal.setPreferredSize(new java.awt.Dimension(120, 19));
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });

        btn_simpan.setBackground(new java.awt.Color(102, 153, 255));
        btn_simpan.setText("Simpan");
        btn_simpan.setFillOriginal(new java.awt.Color(105, 33, 58));
        btn_simpan.setFillOver(new java.awt.Color(105, 33, 58));
        btn_simpan.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_simpan.setPreferredSize(new java.awt.Dimension(120, 19));
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
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
                                .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        pn_update.setBackground(new java.awt.Color(35, 12, 20));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home-removebg-preview 1 (1).png"))); // NOI18N
        jLabel8.setText("jLabel5");

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Update Kategori");

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

        btn_batalU.setBackground(new java.awt.Color(102, 153, 255));
        btn_batalU.setText("Batal");
        btn_batalU.setFillOriginal(new java.awt.Color(105, 33, 58));
        btn_batalU.setFillOver(new java.awt.Color(105, 33, 58));
        btn_batalU.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_batalU.setPreferredSize(new java.awt.Dimension(120, 19));
        btn_batalU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalUActionPerformed(evt);
            }
        });

        txtNama1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nama Kategori");

        txtJenis1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Jenis");

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_updateLayout = new javax.swing.GroupLayout(pn_update);
        pn_update.setLayout(pn_updateLayout);
        pn_updateLayout.setHorizontalGroup(
            pn_updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_updateLayout.createSequentialGroup()
                .addGroup(pn_updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_updateLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pn_updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pn_updateLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9))))
                    .addGroup(pn_updateLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(pn_updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNama1, javax.swing.GroupLayout.PREFERRED_SIZE, 1095, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(txtJenis1, javax.swing.GroupLayout.PREFERRED_SIZE, 1095, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)))
                    .addGroup(pn_updateLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_batalU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(80, 369, Short.MAX_VALUE))
        );
        pn_updateLayout.setVerticalGroup(
            pn_updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_updateLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(pn_updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_batalU, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNama1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtJenis1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addContainerGap(588, Short.MAX_VALUE))
        );

        pn_main.add(pn_update, "card2");

        add(pn_main, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
    pn_main.removeAll();
    pn_main.add(pn_add);
    pn_main.repaint();
    pn_main.revalidate();
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
    pn_main.removeAll();
    pn_main.add(pn_view);
    pn_main.repaint();
    pn_main.revalidate();
    }//GEN-LAST:event_btn_batalActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
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
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage());
     }

    }//GEN-LAST:event_btn_simpanActionPerformed

    
    private void tbl_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_dataMouseClicked
    int row = tbl_data.rowAtPoint(evt.getPoint());
    if (row < 0) return;

    // Ambil data
    int id = Integer.parseInt(tbl_data.getValueAt(row, 0).toString());
    String nama = tbl_data.getValueAt(row, 1).toString();
    String jenis = tbl_data.getValueAt(row, 2).toString();
    selectedId = id;
    selectedIndex = row;

    // Tampilkan opsi Update atau Delete
    Object[] options = {"Update", "Delete", "Batal"};
    int choice = JOptionPane.showOptionDialog(
        this,
        "Pilih aksi untuk:\n" + nama + " (" + jenis + ")",
        "Pilih Aksi",
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        options,
        options[2]
    );

    if (choice == JOptionPane.YES_OPTION) {
        // ===== UPDATE =====
        // Simpan context
        selectedIndex = row;
        selectedId = id;

        // Isi form
        txtNama1.setText(nama);
        txtJenis1.setText(jenis);
        System.out.println(id);
        // Tampilkan panel edit
        pn_main.removeAll();
        pn_main.add(pn_update);
        pn_main.repaint();
        pn_main.revalidate();


    } else if (choice == JOptionPane.NO_OPTION) {
        // ===== DELETE =====
        int confirm = JOptionPane.showConfirmDialog(
            this,
            "Yakin ingin menghapus kategori:\n" + nama + "?",
            "Konfirmasi Hapus",
            JOptionPane.YES_NO_OPTION
        );
        if (confirm == JOptionPane.YES_OPTION) {
            servis.hapusData(id);
            loadData();
            JOptionPane.showMessageDialog(this, "Data berhasil dihapus.");
        }
        // tidak perlu ubah panel (tetap di view)
    }
    // choice == CANCEL atau ditutup dialog: tidak ada aksi
    }//GEN-LAST:event_tbl_dataMouseClicked

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
         try {    
        // Ambil data dari form
        String nama = txtNama1.getText().trim();
        String jenisStr = txtJenis1.getText().trim();
        
        //validasi Input
       if (nama.isEmpty() || jenisStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Data tidak boleh kosong!");
            return;
        }  
       
        modelKategori kategori = new modelKategori(selectedId, nama, jenisStr);
        
         // Simpan ke database lewat service/DAO
        servis.updateData(kategori);
        
     // Refresh data dan kembali ke panel utama
        loadData();

        pn_main.removeAll();
        pn_main.add(pn_view);
        pn_main.repaint();
        pn_main.revalidate();

        JOptionPane.showMessageDialog(this, "Data berhasil diupdate!");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage());
     }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_batalUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalUActionPerformed
        pn_main.removeAll();
        pn_main.add(pn_view);
        pn_main.repaint();
        pn_main.revalidate();
    }//GEN-LAST:event_btn_batalUActionPerformed

    private void txt_pencarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pencarianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pencarianActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Palette.Custom_ButtonRounded btn_batal;
    private Palette.Custom_ButtonRounded btn_batalU;
    private Palette.Custom_ButtonRounded btn_simpan;
    private Palette.Custom_ButtonRounded btn_tambah;
    private Palette.Custom_ButtonRounded btn_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPanel pn_add;
    private javax.swing.JPanel pn_main;
    private javax.swing.JPanel pn_update;
    private javax.swing.JPanel pn_view;
    private Palette.JTable_Custom tbl_data;
    private Palette.JTextfieldRounded txtJenis;
    private Palette.JTextfieldRounded txtJenis1;
    private Palette.JTextfieldRounded txtNama;
    private Palette.JTextfieldRounded txtNama1;
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
