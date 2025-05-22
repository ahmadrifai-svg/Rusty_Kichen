 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package jDialog;

import DAO.TransaksiDAO;
import DAO.TransaksiDetailDAO;
import DAO.menuDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumnModel;
import model.ModelMenu;
import model.modelTransaksiDetail;
import service.serviceMenu;
import service.serviceTransaksiDetail;
import tableModel.tableModelMenu;
import tableModel.tableModelTransaksiDetail;

/**
 *
 * @author MyBook Hype AMD
 */
public class dataDetailTransaksi extends javax.swing.JDialog {

     private serviceTransaksiDetail servis = new TransaksiDetailDAO();
     private tableModelTransaksiDetail tblModel = new tableModelTransaksiDetail();
     private String id;
            
    public dataDetailTransaksi(java.awt.Frame parent, boolean modal, String id) {
        super(parent, modal);
        initComponents();
        
        this.id = id;
        
        tblData.setModel(tblModel);
        loadData();
        
    }
    
//    private void setLebarKolom() {
//        TableColumnModel kolom = tblData.getColumnModel();
//        kolom.getColumn(0).setPreferredWidth(50);
//        kolom.getColumn(0).setMaxWidth(50);
//        kolom.getColumn(0).setMinWidth(50);
//    }
//    
//    private void setLayoutForm() {
//        utama.putClientProperty(FlatClientProperties.STYLE, "background: $model.background");
//        txtPencarian.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Pencarian");
//    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        utama = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new Palette.JTable_Custom();
        Judul = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPencarian = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        utama.setBackground(new java.awt.Color(0, 51, 153));

        tblData.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblData);

        Judul.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        Judul.setForeground(new java.awt.Color(255, 255, 255));
        Judul.setText("Data Detail Transaksi");

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));

        txtPencarian.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPencarianKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout utamaLayout = new javax.swing.GroupLayout(utama);
        utama.setLayout(utamaLayout);
        utamaLayout.setHorizontalGroup(
            utamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(utamaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(utamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(utamaLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
                        .addGap(22, 22, 22))
                    .addGroup(utamaLayout.createSequentialGroup()
                        .addComponent(txtPencarian)
                        .addGap(20, 20, 20))))
            .addGroup(utamaLayout.createSequentialGroup()
                .addGroup(utamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(utamaLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel7))
                    .addGroup(utamaLayout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(Judul)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(utamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(utamaLayout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(19, Short.MAX_VALUE)))
        );
        utamaLayout.setVerticalGroup(
            utamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(utamaLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(Judul)
                .addGap(66, 66, 66)
                .addComponent(txtPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(51, 51, 51))
            .addGroup(utamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(utamaLayout.createSequentialGroup()
                    .addGap(83, 83, 83)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(587, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(utama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(utama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPencarianKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPencarianKeyReleased
        pencarianData();
    }//GEN-LAST:event_txtPencarianKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dataDetailTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dataDetailTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dataDetailTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dataDetailTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dataDetailTransaksi dialog = new dataDetailTransaksi(new javax.swing.JFrame(), true, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Judul;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private Palette.JTable_Custom tblData;
    private javax.swing.JTextField txtPencarian;
    private javax.swing.JPanel utama;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
        List<modelTransaksiDetail> list = servis.tampilData(id);
        tblModel.setData(list);
    }

    private void pencarianData() {
        List<modelTransaksiDetail> list = servis.pencarianData(id,txtPencarian.getText());
        tblModel.setData(list);
    }
 
}
