/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import DAO.StrukDAO;
import DAO.TransaksiDAO;
import DAO.TransaksiDetailDAO;
import DAO.TransaksiSmtDAO;
import DAO.mejaDAO;
import DAO.menuDAO;
import DAO.pelangganDAO;
import config.koneksi;
import jDialog.dataDetailTransaksi;
import jDialog.dataMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import model.ModelMeja;
import model.ModelMenu;
import model.modelPelanggan;
import model.modelTransaksi;
import model.modelTransaksiDetail;
import model.modelTransaksiSmt;
import model.modelUser;
import service.serviceMeja;
import service.serviceMenu;
import service.servicePelanggan;
import service.serviceStruk;
import service.serviceTransaksi;
import service.serviceTransaksiDetail;
import service.serviceTransaksiSmt;
import tableModel.tableModelMenu;
import tableModel.tableModelTransaksi;
import tableModel.tableModelTransaksiSmt;

/**
 *
 * @author MyBook Hype AMD
 */
public class menuPemesanan extends javax.swing.JPanel {

    private tableModelTransaksi tblModelTran = new tableModelTransaksi();
    private tableModelTransaksiSmt tblModelSmt = new tableModelTransaksiSmt();
    
    private serviceTransaksi service = new TransaksiDAO();
    private serviceTransaksiDetail serviceDet = new TransaksiDetailDAO();
    private serviceTransaksiSmt serviceSmt = new TransaksiSmtDAO();
    private serviceMenu serviceMenu = new menuDAO();
    private serviceStruk serviceStruk = new StrukDAO();
    private servicePelanggan servisPel = new pelangganDAO();
    private serviceMeja servisMeja = new mejaDAO();
    
    private String idMenu;
    private String idPelanggan;
    private String idMeja;
    private String idUser;
    
    private final Map<String, String> hasMap;
    private Timer timer;
    
     private Connection conn;
    

    public menuPemesanan(String idUser) {
    initComponents();
    
    this.conn = koneksi.getConnection(); // Inisialisasi koneksi di sini
    
    this.idUser = idUser;
    tblData.setModel(tblModelTran);
    tblDataSmt.setModel(tblModelSmt);
    txtUser.setText(getNamaUser(idUser));
    
    hasMap = new HashMap<>();
    loadData();
    loadDataSementara();
    setTanggal();
}
    
    private String getNamaUser(String idUser) {
    String nama = "";
    String sql = "SELECT `Username` FROM `user` WHERE `Id_User` = ?";
    
    try (PreparedStatement st = conn.prepareStatement(sql)) {
        st.setString(1, idUser);
        ResultSet rs = st.executeQuery();
        if (rs.next()) {
            nama = rs.getString("Username");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    
    return nama;  
}


   private void setTanggal() {
    timer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                Calendar calendar = Calendar.getInstance();
                SimpleDateFormat formatHari = new SimpleDateFormat("EEEE", new Locale("in", "ID"));
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");

                String hari = formatHari.format(calendar.getTime());
                String date = dateFormat.format(calendar.getTime());
                String time = timeFormat.format(calendar.getTime());

                if (lbHari != null) {
                    lbHari.setText(hari + ",");
                } else {
                    System.out.println("lbHari belum diinisialisasi!");
                }
                if (lbTanggal != null) {
                    lbTanggal.setText(date); // Hanya tanggal
                } else {
                    System.out.println("lbTanggal belum diinisialisasi!");
                }
                if (lbJam != null) {
                    lbJam.setText(time); // Hanya jam
                } else {
                    System.out.println("lbJam belum diinisialisasi!");
                }
            } catch (Exception ex) {
                System.out.println("Error mengatur tanggal: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    });
    timer.start();
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_main = new javax.swing.JPanel();
        pn_view = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnTambah = new Palette.Custom_ButtonRounded();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new Palette.JTable_Custom();
        txtPencarian = new Palette.JTextfieldRounded();
        btn_detail = new Palette.Custom_ButtonRounded();
        pn_add = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Judul = new javax.swing.JLabel();
        btn_batal = new Palette.Custom_ButtonRounded();
        btnSave = new Palette.Custom_ButtonRounded();
        jSeparator3 = new javax.swing.JSeparator();
        lbHari = new javax.swing.JLabel();
        lbTanggal = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtNoTransaksi = new Palette.JTextfieldRounded();
        jPanel6 = new javax.swing.JPanel();
        txtUser = new Palette.JTextfieldRounded();
        jPanel7 = new javax.swing.JPanel();
        lbTotalHarga = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        cbxPelanggan = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        txtBarcode = new Palette.JTextfieldRounded();
        btnMenu = new javax.swing.JButton();
        txtHarga = new Palette.JTextfieldRounded();
        txtJumlah = new Palette.JTextfieldRounded();
        txtMenu = new Palette.JTextfieldRounded();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDataSmt = new Palette.JTable_Custom();
        btnHapusSmt = new Palette.Custom_ButtonRounded();
        btnBatalSmt = new Palette.Custom_ButtonRounded();
        btnPerbaruiSmt = new Palette.Custom_ButtonRounded();
        jLabel3 = new javax.swing.JLabel();
        txtSubtotal = new Palette.JTextfieldRounded();
        jLabel10 = new javax.swing.JLabel();
        txtDiskon = new Palette.JTextfieldRounded();
        jLabel11 = new javax.swing.JLabel();
        txtTotal = new Palette.JTextfieldRounded();
        txtBayar = new Palette.JTextfieldRounded();
        jLabel12 = new javax.swing.JLabel();
        txtKembali = new Palette.JTextfieldRounded();
        jLabel13 = new javax.swing.JLabel();
        txtPersen = new Palette.JTextfieldRounded();
        jLabel14 = new javax.swing.JLabel();
        lbJam = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        cbxMeja = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.CardLayout());

        pn_main.setBackground(new java.awt.Color(35, 12, 20));
        pn_main.setLayout(new java.awt.CardLayout());

        pn_view.setBackground(new java.awt.Color(35, 12, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Meat.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pemesanan");

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

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblData);

        txtPencarian.setForeground(new java.awt.Color(255, 255, 255));
        txtPencarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPencarianActionPerformed(evt);
            }
        });
        txtPencarian.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPencarianKeyReleased(evt);
            }
        });

        btn_detail.setBackground(new java.awt.Color(105, 33, 58));
        btn_detail.setText("Detail");
        btn_detail.setFillOriginal(new java.awt.Color(105, 33, 58));
        btn_detail.setFillOver(new java.awt.Color(105, 33, 58));
        btn_detail.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_detail.setPreferredSize(new java.awt.Dimension(120, 19));
        btn_detail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_detailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_viewLayout = new javax.swing.GroupLayout(pn_view);
        pn_view.setLayout(pn_viewLayout);
        pn_viewLayout.setHorizontalGroup(
            pn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_viewLayout.createSequentialGroup()
                .addGroup(pn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pn_viewLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator2)
                            .addGroup(pn_viewLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pn_viewLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(pn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(pn_viewLayout.createSequentialGroup()
                                .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_detail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 582, Short.MAX_VALUE)
                                .addComponent(txtPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(80, 80, 80))
        );
        pn_viewLayout.setVerticalGroup(
            pn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_viewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGroup(pn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_viewLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addGroup(pn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_detail, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pn_viewLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(txtPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        pn_main.add(pn_view, "card2");

        pn_add.setBackground(new java.awt.Color(35, 12, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Meat.png"))); // NOI18N
        jLabel6.setText("jLabel5");

        Judul.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        Judul.setForeground(new java.awt.Color(255, 255, 255));
        Judul.setText("Tambah Data Stok");

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

        btnSave.setBackground(new java.awt.Color(102, 153, 255));
        btnSave.setText("Simpan");
        btnSave.setFillOriginal(new java.awt.Color(105, 33, 58));
        btnSave.setFillOver(new java.awt.Color(105, 33, 58));
        btnSave.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnSave.setPreferredSize(new java.awt.Dimension(120, 19));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lbHari.setForeground(new java.awt.Color(255, 255, 255));
        lbHari.setText("Hari");

        lbTanggal.setForeground(new java.awt.Color(255, 255, 255));
        lbTanggal.setText("Tanggal");

        jPanel1.setBackground(new java.awt.Color(105, 33, 58));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Transaksi ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(52, 152, 219));
        jPanel1.setPreferredSize(new java.awt.Dimension(258, 90));

        txtNoTransaksi.setForeground(new java.awt.Color(255, 255, 255));
        txtNoTransaksi.setText("No Transaksi");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNoTransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNoTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(105, 33, 58));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "User", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel6.setForeground(new java.awt.Color(52, 152, 219));
        jPanel6.setPreferredSize(new java.awt.Dimension(258, 90));

        txtUser.setForeground(new java.awt.Color(255, 255, 255));
        txtUser.setText("Nama User");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(105, 33, 58));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel7.setForeground(new java.awt.Color(52, 152, 219));

        lbTotalHarga.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbTotalHarga.setForeground(new java.awt.Color(255, 255, 255));
        lbTotalHarga.setText("0");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTotalHarga)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTotalHarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(105, 33, 58));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pelanggan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel8.setForeground(new java.awt.Color(52, 152, 219));

        cbxPelanggan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nama Pelanggan", " " }));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbxPelanggan, 0, 214, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbxPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(35, 12, 20));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Transaksi ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(52, 152, 219));
        jPanel2.setPreferredSize(new java.awt.Dimension(258, 90));

        txtBarcode.setForeground(new java.awt.Color(255, 255, 255));
        txtBarcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBarcodeKeyReleased(evt);
            }
        });

        btnMenu.setText("...");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        txtHarga.setForeground(new java.awt.Color(255, 255, 255));

        txtJumlah.setForeground(new java.awt.Color(255, 255, 255));
        txtJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumlahActionPerformed(evt);
            }
        });

        txtMenu.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nama Menu");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Barcode");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Harga");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Jumlah");

        tblDataSmt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblDataSmt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataSmtMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDataSmt);

        btnHapusSmt.setText("Hapus");
        btnHapusSmt.setFillOriginal(new java.awt.Color(105, 33, 58));
        btnHapusSmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusSmtActionPerformed(evt);
            }
        });

        btnBatalSmt.setText("Batal");
        btnBatalSmt.setFillOriginal(new java.awt.Color(105, 33, 58));
        btnBatalSmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalSmtActionPerformed(evt);
            }
        });

        btnPerbaruiSmt.setBackground(new java.awt.Color(105, 33, 58));
        btnPerbaruiSmt.setText("Update");
        btnPerbaruiSmt.setFillOriginal(new java.awt.Color(105, 33, 58));
        btnPerbaruiSmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerbaruiSmtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMenu))
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnPerbaruiSmt, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHapusSmt, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBatalSmt, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 59, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPerbaruiSmt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapusSmt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBatalSmt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sub Total");

        txtSubtotal.setForeground(new java.awt.Color(255, 255, 255));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Diskon");

        txtDiskon.setForeground(new java.awt.Color(255, 255, 255));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Total Harga");

        txtTotal.setForeground(new java.awt.Color(255, 255, 255));

        txtBayar.setForeground(new java.awt.Color(255, 255, 255));
        txtBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBayarActionPerformed(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Bayar");

        txtKembali.setForeground(new java.awt.Color(255, 255, 255));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Kemabali");

        txtPersen.setForeground(new java.awt.Color(255, 255, 255));
        txtPersen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPersenActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("%");

        lbJam.setForeground(new java.awt.Color(255, 255, 255));
        lbJam.setText("Jam");

        jPanel9.setBackground(new java.awt.Color(105, 33, 58));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Meja\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel9.setForeground(new java.awt.Color(52, 152, 219));

        cbxMeja.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nomor Meja", " " }));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbxMeja, 0, 214, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbxMeja, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pn_addLayout = new javax.swing.GroupLayout(pn_add);
        pn_add.setLayout(pn_addLayout);
        pn_addLayout.setHorizontalGroup(
            pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_addLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pn_addLayout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pn_addLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_addLayout.createSequentialGroup()
                                .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1272, Short.MAX_VALUE)
                                    .addGroup(pn_addLayout.createSequentialGroup()
                                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(pn_addLayout.createSequentialGroup()
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(25, 25, 25))
                            .addGroup(pn_addLayout.createSequentialGroup()
                                .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pn_addLayout.createSequentialGroup()
                                        .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtPersen, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel14)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtBayar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(pn_addLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Judul)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbHari)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTanggal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbJam)
                        .addGap(70, 70, 70))))
        );
        pn_addLayout.setVerticalGroup(
            pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_addLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Judul)
                        .addComponent(lbHari)
                        .addComponent(lbTanggal)
                        .addComponent(lbJam))
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPersen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pn_main.add(pn_add, "card2");

        add(pn_main, "card2");
    }// </editor-fold>//GEN-END:initComponents
//form Penjualan
    private void btn_detailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_detailActionPerformed
        detailPenjualan();
    }//GEN-LAST:event_btn_detailActionPerformed

    private void txtPencarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPencarianActionPerformed
        
    }//GEN-LAST:event_txtPencarianActionPerformed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        btn_detail.setEnabled(true);
    }//GEN-LAST:event_tblDataMouseClicked

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        tambahData();
    }//GEN-LAST:event_btnTambahActionPerformed
//form Penjualan
    
//form tambah Penjualan    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        simpanData();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
       showPanel();
       loadData();
    }//GEN-LAST:event_btn_batalActionPerformed

    private void txtBarcodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBarcodeKeyReleased
        pencarianMenu();
    }//GEN-LAST:event_txtBarcodeKeyReleased

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        pencarianMenuFormDialog();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void tblDataSmtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataSmtMouseClicked
        dataTblSementara();
    }//GEN-LAST:event_tblDataSmtMouseClicked

    private void btnPerbaruiSmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerbaruiSmtActionPerformed
        perbaruiDataSementara();
    }//GEN-LAST:event_btnPerbaruiSmtActionPerformed

    private void btnHapusSmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusSmtActionPerformed
        hapusDataSementara();
    }//GEN-LAST:event_btnHapusSmtActionPerformed

    private void btnBatalSmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalSmtActionPerformed
        loadDataSementara();
        resetMenu();
    }//GEN-LAST:event_btnBatalSmtActionPerformed

    private void txtPersenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPersenActionPerformed
        hitungPotongan();
    }//GEN-LAST:event_txtPersenActionPerformed

    private void txtBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBayarActionPerformed
        pembayaran();
    }//GEN-LAST:event_txtBayarActionPerformed

    private void txtJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahActionPerformed
        perbaruiDataSementara();
    }//GEN-LAST:event_txtJumlahActionPerformed

    private void txtPencarianKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPencarianKeyReleased
        searchData();
    }//GEN-LAST:event_txtPencarianKeyReleased

//form tambah Penjualan 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Judul;
    private Palette.Custom_ButtonRounded btnBatalSmt;
    private Palette.Custom_ButtonRounded btnHapusSmt;
    private javax.swing.JButton btnMenu;
    private Palette.Custom_ButtonRounded btnPerbaruiSmt;
    private Palette.Custom_ButtonRounded btnSave;
    private Palette.Custom_ButtonRounded btnTambah;
    private Palette.Custom_ButtonRounded btn_batal;
    private Palette.Custom_ButtonRounded btn_detail;
    private javax.swing.JComboBox<String> cbxMeja;
    private javax.swing.JComboBox<String> cbxPelanggan;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbHari;
    private javax.swing.JLabel lbJam;
    private javax.swing.JLabel lbTanggal;
    private javax.swing.JLabel lbTotalHarga;
    private javax.swing.JPanel pn_add;
    private javax.swing.JPanel pn_main;
    private javax.swing.JPanel pn_view;
    private Palette.JTable_Custom tblData;
    private Palette.JTable_Custom tblDataSmt;
    private Palette.JTextfieldRounded txtBarcode;
    private Palette.JTextfieldRounded txtBayar;
    private Palette.JTextfieldRounded txtDiskon;
    private Palette.JTextfieldRounded txtHarga;
    private Palette.JTextfieldRounded txtJumlah;
    private Palette.JTextfieldRounded txtKembali;
    private Palette.JTextfieldRounded txtMenu;
    private Palette.JTextfieldRounded txtNoTransaksi;
    private Palette.JTextfieldRounded txtPencarian;
    private Palette.JTextfieldRounded txtPersen;
    private Palette.JTextfieldRounded txtSubtotal;
    private Palette.JTextfieldRounded txtTotal;
    private Palette.JTextfieldRounded txtUser;
    // End of variables declaration//GEN-END:variables

    
    private void loadData() {
       txtNoTransaksi.setText(service.noTransaksi());
       getPelanggan();
       getMeja();
       btn_detail.setEnabled(false);
       List<modelTransaksi> list = service.tampilData();
       tblModelTran.setData(list);
    }
    private void loadDataSementara() {
       
       List<modelTransaksiSmt> list = serviceSmt.tampilData();
       tblModelSmt.setData(list);
       
       txtDiskon.setText("0");
       nonAktif();
       txtBarcode.requestFocus();
       txtBarcode.setEditable(true);
       btnMenu.setEnabled(true);
    } 
    
     private void tambahData() {
        pn_main.removeAll();
        pn_main.add( pn_add);
        pn_main.repaint();
        pn_main.revalidate();
    }
    
    
    private void showPanel(){
        pn_main.removeAll();
        pn_main.add( pn_view);
        pn_main.repaint();
        pn_main.revalidate();
    }

    private void searchData() {
       List<modelTransaksi> list = service.pencarianData(txtPencarian.getText());
       tblModelTran.setData(list);
    }

    private void detailPenjualan() {
        int row = tblData.getSelectedRow();
        String id = tblData.getValueAt(row, 1).toString();
        dataDetailTransaksi dataDetail = new dataDetailTransaksi(null, true, id);
        dataDetail.setVisible(true);
        loadData();
    }

    private void aktif (){
        txtBarcode.setEnabled(true);
        txtMenu.setEnabled(true);
        txtHarga.setEnabled(true);
        txtJumlah.setEnabled(true);
        
        btnMenu.setEnabled(true);
        btnPerbaruiSmt.setEnabled(true);
        btnHapusSmt.setEnabled(true);
    }
    
    private void nonAktif (){
        txtNoTransaksi.setEditable(false);
        txtUser.setEditable(false);
        txtBarcode.setEditable(false);
        txtMenu.setEditable(false);
        txtHarga.setEditable(false);
        txtJumlah.setEditable(false);
        
        btnMenu.setEnabled(false);
        btnPerbaruiSmt.setEnabled(false);
        btnHapusSmt.setEnabled(false);
        btnBatalSmt.setEnabled(false);
    }
    
    private void resetMenu(){
        txtBarcode.setText("");
        txtMenu.setText("");
        txtHarga.setText("");
        txtJumlah.setText("");
    }
    

    
    private void resetPembayaran(){
        txtSubtotal.setText("");
        txtDiskon.setText("");
        txtPersen.setText("");
        txtTotal.setText("");
        txtBayar.setText("");
        txtKembali.setText("");
        lbTotalHarga.setText("0");
    }

    private void getPelanggan() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        model.addElement("Pilih Pelanggan");
        
        List<modelPelanggan> list = servisPel.ambilPelanggan();
        for(modelPelanggan modelpel : list){
            model.addElement(modelpel.getNamaPelanggan());
            hasMap.put(modelpel.getNamaPelanggan(), modelpel.getIdPelanggan());
        }
        cbxPelanggan.setModel(model);
        cbxPelanggan.addActionListener(e -> {
            String namaPelanggan = cbxPelanggan.getSelectedItem().toString();
            if(!"pilih pelanggan ".equals(namaPelanggan)){
                idPelanggan = hasMap.get(namaPelanggan);
            }
        });
        
    }
    
    private void getMeja() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        model.addElement("Pilih Meja");
        
        List<ModelMeja> list = servisMeja.ambilMeja();
        for(ModelMeja modelMeja : list){
            model.addElement(modelMeja.getNomor());
            hasMap.put(modelMeja.getNomor(), modelMeja.getIdMeja());
        }
        cbxMeja.setModel(model);
        cbxMeja.addActionListener(e -> {
            String nomorMeja = cbxMeja.getSelectedItem().toString();
            if(!"pilih Meja ".equals(nomorMeja)){
                idMeja = hasMap.get(nomorMeja);
            }
        });
        
    }

    private void pencarianMenu() {
    List<ModelMenu> list = serviceMenu.pencarianDataByBarcode(txtBarcode.getText());
    
    if (!list.isEmpty()) {
        ModelMenu menu = list.get(0);
        
        // Cek apakah menu sudah ada dalam data sementara
        int existingRow = -1;
        for (int i = 0; i < tblModelSmt.getRowCount(); i++) {
            if (tblModelSmt.getData(i).getModelMenu().getBarcode().equals(menu.getBarcode())) {
                existingRow = i;
                break;
            }
        }
        
        if (existingRow == -1) {
            // Produk belum ada, tambahkan baru
            String barcode = menu.getBarcode();
            String namaMenu = menu.getNamaMenu();
            double harga = menu.getHarga();
            int jumlah = 1;
            double subtotal = harga * jumlah;
            
            modelTransaksiSmt smt = new modelTransaksiSmt();
            ModelMenu MN = new ModelMenu();
            modelTransaksiDetail det = new modelTransaksiDetail();
            
            MN.setIdMenu(menu.getIdMenu());
            MN.setBarcode(barcode);
            MN.setNamaMenu(namaMenu);
            MN.setHarga((long) harga);
            
            det.setJumlah(jumlah);
            det.setSubtotal(subtotal);
            
            smt.setModelMenu(MN);
            smt.setModelTranDet(det);
            
            serviceSmt.tambahData(smt);
            serviceDet.sumTotal(det);
            
            txtSubtotal.setText(String.valueOf(det.getSubtotal()));
            String total = txtSubtotal.getText();
            txtTotal.setText(total);
            lbTotalHarga.setText("RP. " + total);
            
            loadDataSementara();
        } else {
            // Produk sudah ada, perbarui jumlah dan subtotal
            modelTransaksiSmt existingSmt = tblModelSmt.getData(existingRow);
            modelTransaksiDetail existingDet = existingSmt.getModelTranDet();
            
            int newJumlah = existingDet.getJumlah() + 1;
            double newSubtotal = menu.getHarga() * newJumlah;
            
            existingDet.setJumlah(newJumlah);
            existingDet.setSubtotal(newSubtotal);
            
            // Perbarui data di service atau model
            serviceSmt.perbaruiData(existingSmt); // Asumsi ada metode updateData
            serviceDet.sumTotal(existingDet); // Perbarui total
            
            // Tampilkan total terbaru
            txtSubtotal.setText(String.valueOf(newSubtotal));
            String total = txtSubtotal.getText();
            txtTotal.setText(total);
            lbTotalHarga.setText("RP. " + total);
            
            loadDataSementara(); // Perbarui tabel
        }
    }
}

    private void pencarianMenuFormDialog() {
    boolean closable = true;
    dataMenu modelForm = new dataMenu(null, closable);
    modelForm.setVisible(true);

    // Validasi apakah data dipilih
    if (modelForm.modelDialog.getBarcode() != null) {
        idMenu = modelForm.modelDialog.getIdMenu();
        txtMenu.setText(modelForm.modelDialog.getNamaMenu());
        txtHarga.setText(Double.toString(modelForm.modelDialog.getHarga()));
        txtBarcode.setText(modelForm.modelDialog.getBarcode());

        // Ambil data input
        String barcode = txtBarcode.getText().trim(); // pastikan bersih dari spasi
        String namaMenu = txtMenu.getText().trim();
        double harga = Double.parseDouble(txtHarga.getText().trim());
        int jumlah = 1;
        double subTotal = harga * jumlah;

        // Cek apakah produk sudah ada di tabel sementara
        int existingRow = -1;
        for (int i = 0; i < tblModelSmt.getRowCount(); i++) {
            String barcodeTabel = tblModelSmt.getData(i).getModelMenu().getBarcode().trim();
            if (barcodeTabel.equalsIgnoreCase(barcode)) { // aman terhadap spasi & case
                existingRow = i;
                break;
            }
        }

        if (existingRow == -1) {
            // Produk belum ada, tambahkan baru
            modelTransaksiSmt smt = new modelTransaksiSmt();
            ModelMenu MN = new ModelMenu();
            modelTransaksiDetail det = new modelTransaksiDetail();

            MN.setIdMenu(idMenu);
            MN.setBarcode(barcode);
            MN.setNamaMenu(namaMenu);
            MN.setHarga((long) harga);

            det.setJumlah(jumlah);
            det.setSubtotal(subTotal);

            smt.setModelMenu(MN);
            smt.setModelTranDet(det);

            // Simpan data
            serviceSmt.tambahData(smt);
            serviceDet.sumTotal(det);

            // Tampilkan total
            txtSubtotal.setText(String.valueOf(det.getSubtotal()));
            String total = txtSubtotal.getText();
            txtTotal.setText(total);
            lbTotalHarga.setText("RP. " + total);

            loadDataSementara(); // penting!
            resetMenu();
        } else {
            // Produk sudah ada, perbarui jumlah dan subtotal
            modelTransaksiSmt existingSmt = tblModelSmt.getData(existingRow);
            modelTransaksiDetail existingDet = existingSmt.getModelTranDet();
            
            int newJumlah = existingDet.getJumlah() + 1;
            double newSubTotal = harga * newJumlah;

            existingDet.setJumlah(newJumlah);
            existingDet.setSubtotal(newSubTotal);

            // Perbarui data di service atau model
            serviceSmt.perbaruiData(existingSmt); // Asumsi ada metode updateData
            serviceDet.sumTotal(existingDet); // Perbarui total

            // Tampilkan total terbaru
            txtSubtotal.setText(String.valueOf(newSubTotal));
            String total = txtSubtotal.getText();
            txtTotal.setText(total);
            lbTotalHarga.setText("RP. " + total);

            loadDataSementara(); // Perbarui tabel
            resetMenu();
        }
    } else {
        System.out.println("Anda tidak memilih produk");
    }
}

    private void dataTblSementara() {
    int row = tblDataSmt.getSelectedRow();

    // Aman untuk set nilai
    idMenu = tblDataSmt.getValueAt(row, 1).toString().trim();
    txtBarcode.setText(tblDataSmt.getValueAt(row, 2).toString());
    txtMenu.setText(tblDataSmt.getValueAt(row, 3).toString());
    txtHarga.setText(tblDataSmt.getValueAt(row, 4).toString());
    txtJumlah.setText(tblDataSmt.getValueAt(row, 5).toString());

    nonAktif();
    txtJumlah.setEditable(true);
    btnPerbaruiSmt.setEnabled(true);
    btnBatalSmt.setEnabled(true);
    btnHapusSmt.setEnabled(true);

}


    private void perbaruiDataSementara() {
        if(!txtJumlah.getText().equals("")){
            String barcode = txtBarcode.getText();
            String namaMenu = txtMenu.getText();
            double harga = Double.valueOf(txtHarga.getText());
            int jumlah = Integer.valueOf(txtJumlah.getText());
            double Subtotal = harga * jumlah;
            
            modelTransaksiSmt smt = new modelTransaksiSmt();
            ModelMenu MN = new ModelMenu();
            modelTransaksiDetail det = new modelTransaksiDetail();
            
            MN.setIdMenu(idMenu);
                MN.setBarcode(barcode);
                MN.setNamaMenu(namaMenu);
                MN.setHarga((long) harga);
                
                det.setJumlah(jumlah);
                det.setSubtotal(Subtotal);
                
                smt.setModelMenu(MN);
                smt.setModelTranDet(det);
                
                serviceSmt.perbaruiData(smt);
                serviceDet.sumTotal(det);
                
                txtSubtotal.setText(String.valueOf(det.getSubtotal()));
                String total = txtSubtotal.getText();
                txtTotal.setText(total);
                lbTotalHarga.setText("RP. " + total);
                
                loadDataSementara();
                resetMenu();
                
                txtBarcode.setEnabled(true);
                btnMenu.setEnabled(true);
                
        }
    }

    private void hapusDataSementara() {
        int row = tblDataSmt.getSelectedRow();
         
        if(row != -1){
            modelTransaksiSmt model = tblModelSmt.getData(row);
            if(JOptionPane.showConfirmDialog(null, "Yakin Data Ingin Dihapus?",
                    "Konfirmasi", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION)
            {
                serviceSmt.hapusData(model);
                tblModelSmt.deleteData(row);
                loadDataSementara();
                resetMenu();
                lbTotalHarga.setText("0");
                txtSubtotal.setText("");
                txtTotal.setText("");
            }
        }else {
            JOptionPane.showMessageDialog(null, "Pilih dahulu data yang ingin dihapus");
        }
    }
    
    private void hitungPotongan() {
        try {
            double Subtotal = Double.parseDouble(txtSubtotal.getText());
            int diskon = Integer.parseInt(txtPersen.getText());
            double hasilDiskon = Subtotal * (diskon / 100.0);
            double total = Subtotal - hasilDiskon;
            
            txtDiskon.setText(String.valueOf(hasilDiskon));
            txtTotal.setText(String.valueOf(total));
            
            String totalHarga = txtTotal.getText();
            lbTotalHarga.setText("Rp. " + totalHarga);
            txtHarga.requestFocus();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Masukan angka yang valid untuk diskon");
        }
    }
    
    
    private void pembayaran() {
        try {
            String totalStr = txtTotal.getText().replaceAll("[^\\d.]", "");
            double total = Double.parseDouble(totalStr);
            double bayar = Double.parseDouble(txtBayar.getText());
            double kembali = bayar - total;
            
            txtKembali.setText(String.format("%.0f", kembali));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Masukan nominal Pembayaran yang valid");
        }
    }
    
    private boolean validasiSimpan() {
    if (idPelanggan == null) {
        JOptionPane.showMessageDialog(null, "Silahkan Pilih Jenis Pelanggan");
        return false;
    } else if (txtTotal.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Total Tidak Boleh Kosong");
        return false;
    } else if (txtUser.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "User tidak boleh kosong");
        return false;
    }
    return true;
}

private void simpanData() {
    if (validasiSimpan() == true) {
        String idTransaksi = txtNoTransaksi.getText();
        String tanggal = lbTanggal.getText();  // yyyy-MM-dd
        String jam = lbJam.getText().trim();   // HH:mm:ss
        String fullTanggal = tanggal + " " + jam;  // Gabungkan jadi yyyy-MM-dd HH:mm:ss

        double total = Double.parseDouble(txtTotal.getText());
        double diskon = Double.parseDouble(txtDiskon.getText());
        double bayar = Double.parseDouble(txtBayar.getText());
        double kembali = Double.parseDouble(txtKembali.getText());
        
        modelTransaksi modeltrans = new modelTransaksi();
        ModelMenu modelMN = new ModelMenu();
        modelPelanggan modelPel = new modelPelanggan();
        ModelMeja modelMeja = new ModelMeja();
        modelUser modelUS = new modelUser();
        modelTransaksiDetail modelTrandet = new modelTransaksiDetail();
        
        // Tambah Transaksi
        modeltrans.setIdTransaksi(idTransaksi);
        modeltrans.setTanggal(fullTanggal);  // Simpan tanggal+jam
        modeltrans.setTotalHarga(total);
        modeltrans.setBayar(bayar);
        modeltrans.setDiskon(diskon);
        modeltrans.setKembali(kembali);
        modelPel.setIdPelanggan(idPelanggan);
        modelMeja.setIdMeja(idMeja);
        modelUS.setIdUser(idUser);
        
        modeltrans.setModelPelanggan(modelPel);
        modeltrans.setModelMeja(modelMeja);
        modeltrans.setModelUser(modelUS);
        
        // Tambah detail penjualan
        modelTrandet.setModelTransaksi(modeltrans);
        modelTrandet.setModelMenu(modelMN);
        
        service.tambahData(modeltrans);
        serviceDet.tambahData(modelTrandet);
        serviceDet.hapusDataSementara();
        serviceStruk.printStruk(idTransaksi);
        tblModelTran.insertData(modeltrans);
        showPanel();
        loadData();
        loadDataSementara();
        resetMenu();
        resetPembayaran();
    }
}

    
    
    
    
}
