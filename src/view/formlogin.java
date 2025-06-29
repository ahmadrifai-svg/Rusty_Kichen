/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import config.koneksi;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import java.math.BigInteger;
import javax.swing.UIManager;
import com.fazecast.jSerialComm.SerialPort;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javax.swing.JPasswordField;
import javax.swing.SwingUtilities;
import main.MenuKasir;
import main.MenuUtama;

public class formlogin extends javax.swing.JFrame {

    int xx, xy;
    private Connection conn;

    public formlogin() {
        initComponents();
        conn = koneksi.getConnection();
        setActionButton();
        setupPlaceholder();

    }
    
    private void setupPlaceholder() {
        // Username Placeholder
        txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (txtUsername.getText().equals("Username")) {
                    txtUsername.setText("");
                }
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (txtUsername.getText().isEmpty()) {
                    txtUsername.setText("Username");
                }
            }
        });

        // Password Placeholder
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                String pwd = new String(txtPassword.getPassword());
                if (pwd.equals("Password")) {
                    txtPassword.setText("");
                    txtPassword.setEchoChar('*');
                }
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                String pwd = new String(txtPassword.getPassword());
                if (pwd.isEmpty()) {
                    txtPassword.setText("Password");
                    txtPassword.setEchoChar((char) 0);
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsername = new Palette.JTextfieldRounded();
        txtPassword = new Palette.Custom_JPasswordFieldRounded();
        btn_login = new Palette.Custom_ButtonRounded();
        btn_rfid = new Palette.Custom_ButtonRounded();
        eye = new javax.swing.JLabel();
        hideEye = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsername.setBorder(null);
        txtUsername.setText("Username");
        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 362, 210, 70));

        txtPassword.setBorder(null);
        txtPassword.setText("Password");
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 470, 180, 70));

        btn_login.setBackground(new java.awt.Color(255, 255, 255));
        btn_login.setForeground(new java.awt.Color(0, 0, 0));
        btn_login.setText("Login\n");
        btn_login.setFillOriginal(new java.awt.Color(255, 255, 255));
        btn_login.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 580, 230, 50));

        btn_rfid.setBackground(new java.awt.Color(255, 255, 255));
        btn_rfid.setForeground(new java.awt.Color(0, 0, 0));
        btn_rfid.setText("Login dengan RFID");
        btn_rfid.setFillOriginal(new java.awt.Color(255, 255, 255));
        btn_rfid.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_rfid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rfidActionPerformed(evt);
            }
        });
        getContentPane().add(btn_rfid, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 640, 230, 50));

        eye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Eyes.png"))); // NOI18N
        getContentPane().add(eye, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 490, -1, -1));

        hideEye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Hide.png"))); // NOI18N
        getContentPane().add(hideEye, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 490, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Lupa Password?");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 550, -1, 20));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Login (7).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
       
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btn_rfidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rfidActionPerformed
    FormRfid form = new FormRfid(); 
    form.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_btn_rfidActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
      
    }//GEN-LAST:event_txtUsernameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        UIManager.put("Component.arc", 15);
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
            java.util.logging.Logger.getLogger(formlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formlogin().setVisible(true);
            }
        });
    }

    //fungsi eye 
    private void setActionButton() {
        eye.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                eye.setVisible(false);
                hideEye.setVisible(true);
                txtPassword.setEchoChar((char) 0); // Menampilkan password
            }
        });

        hideEye.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                eye.setVisible(true);
                hideEye.setVisible(false);
                txtPassword.setEchoChar('*'); // Menyembunyikan password
            }
        });
        btn_login.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                prosesLogin();
            }

        });

        txtPassword.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    prosesLogin();
                }
            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Palette.Custom_ButtonRounded btn_login;
    private Palette.Custom_ButtonRounded btn_rfid;
    private javax.swing.JLabel eye;
    private javax.swing.JLabel hideEye;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private Palette.Custom_JPasswordFieldRounded txtPassword;
    private Palette.JTextfieldRounded txtUsername;
    // End of variables declaration//GEN-END:variables

    public String getMd5java(String message){
        String digest = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] hash = md.digest(message.getBytes("UTF-8"));
            
            StringBuilder sb = new StringBuilder(2 * hash.length);
            for(byte b : hash){
                sb.append(String.format("%02X", b & 0xff));
            }
            digest = sb.toString();
        } catch (Exception e) {
            Logger.getLogger(formlogin.class.getName()).log(Level.SEVERE, null, e);
        }
        return digest(message);
    }
    
    //validasi input
    private boolean validasiInput() {
        boolean valid = false;
        if (txtUsername.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username Tidak Boleh Kosong");
        } else if (txtPassword.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Password Tidak Boleh Kosong");
        } else {
            valid = true;
        }
        return valid;
    }

    //proses chek login
    private Map<String, String> checkLogin(String username, String hashedPassword) {
    Map<String, String> result = null;

    String sql = "SELECT ID_User, Username, Role FROM user WHERE Username = ? AND Password = ?";
    try (PreparedStatement st = conn.prepareStatement(sql)) {
        st.setString(1, username);
        st.setString(2, hashedPassword);

        ResultSet rs = st.executeQuery();
        if (rs.next()) {
            result = new HashMap<>();
            result.put("ID_User", rs.getString("ID_User"));
            result.put("Username", rs.getString("Username"));
            result.put("Role", rs.getString("Role"));
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return result;
}


    private void prosesLogin() {
    if (validasiInput()) {
        String username = txtUsername.getText().trim();
        String password = new String(txtPassword.getPassword()).trim();
        String hashedPassword = digest(password); // Enkripsi password

        // Ambil data lengkap user dari database (ID, Username, Role)
        Map<String, String> loginResult = checkLogin(username, hashedPassword);

        if (loginResult != null) {
            String userID = loginResult.get("ID_User");
            String namaUser = loginResult.get("Username");
            String role = loginResult.get("Role");

            if (role.equals("Admin")) {
                new MenuUtama(userID, namaUser, role).setVisible(true); // Kirim ke constructor
            } else if (role.equals("Karyawan")) {
                new MenuKasir(userID, namaUser, role).setVisible(true); // Jika MenuKasir juga pakai data user
            }

            dispose(); // Tutup form login
        } else {
            JOptionPane.showMessageDialog(this, "Username dan Password Salah", "Pesan", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}


    public static String digest(String input) {
    try {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] messageDigest = md.digest(input.getBytes());
        
        // Convert byte array into signum representation
        BigInteger no = new BigInteger(1, messageDigest);
        
        // Convert message digest into hex value
        String hashText = no.toString(16);
        
        // Pad with leading zeros to make it 32 digits
        while (hashText.length() < 32) {
            hashText = "0" + hashText;
        }
        
        return hashText;
    } catch (NoSuchAlgorithmException e) {
        throw new RuntimeException(e);
    }
}

    
}
