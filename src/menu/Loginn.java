package menu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class Loginn extends javax.swing.JFrame {
    int xx, xy;

    public Loginn() { 
        initComponents();
        this.setLocationRelativeTo(null);
        Connection mysqlconfig;
        
    }

    private static Connection mysqlconfig;
    
    Connection con;
    PreparedStatement pst;
   
    public static Connection configDB() throws SQLException {
        try {
            String url = "jdbc:mysql://localhost:3306/bakery?useSSL=false&serverTimezone=UTC";
            String user = "root"; // Sesuaikan dengan username Anda
            String password = ""; // Isi dengan password MySQL Anda

            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            mysqlconfig = DriverManager.getConnection(url, user, password);
            System.out.println("Koneksi Berhasil");
        } catch (SQLException e) {
            System.err.println("Koneksi gagal: " + e.getMessage());
            throw new SQLException("Tidak dapat terhubung ke database");
        }
        return mysqlconfig;
    }
    
    public class Session{
        public static int Id_user;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        color1 = new menu.color();
        jPanel2 = new javax.swing.JPanel();
        color3 = new menu.color();
        jLabel6 = new javax.swing.JLabel();
        text_password = new javax.swing.JPasswordField();
        _lihatpassword = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_login = new javax.swing.JButton();
        jButto_cancel = new javax.swing.JButton();
        text_username = new javax.swing.JTextField();
        color4 = new menu.color();
        color5 = new menu.color();
        color2 = new menu.color();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout color1Layout = new javax.swing.GroupLayout(color1);
        color1.setLayout(color1Layout);
        color1Layout.setHorizontalGroup(
            color1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        color1Layout.setVerticalGroup(
            color1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        color3.setColorEnd(new java.awt.Color(255, 255, 255));
        color3.setColorStart(new java.awt.Color(255, 255, 235));
        color3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(153, 0, 204));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Create an account");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        color3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 210, -1));

        text_password.setBackground(new java.awt.Color(235, 235, 235));
        text_password.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        text_password.setBorder(null);
        color3.add(text_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 224, 30));

        _lihatpassword.setBorder(null);
        _lihatpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _lihatpasswordActionPerformed(evt);
            }
        });
        color3.add(_lihatpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, -1, -1));

        jLabel1.setBackground(new java.awt.Color(153, 0, 204));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("Username :");
        color3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 106, -1, -1));

        jLabel2.setBackground(new java.awt.Color(153, 0, 204));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Login");
        color3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 250, 40));

        jLabel3.setBackground(new java.awt.Color(153, 0, 204));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 102));
        jLabel3.setText("Password  :");
        color3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 156, -1, -1));

        btn_login.setBackground(new java.awt.Color(102, 0, 102));
        btn_login.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("Login");
        btn_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_loginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_loginMouseEntered(evt);
            }
        });
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        color3.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 85, 35));

        jButto_cancel.setBackground(new java.awt.Color(102, 0, 102));
        jButto_cancel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButto_cancel.setForeground(new java.awt.Color(255, 255, 255));
        jButto_cancel.setText("Cancel");
        jButto_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButto_cancelActionPerformed(evt);
            }
        });
        color3.add(jButto_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 85, 35));

        text_username.setBackground(new java.awt.Color(235, 235, 235));
        text_username.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        text_username.setBorder(null);
        text_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_usernameActionPerformed(evt);
            }
        });
        color3.add(text_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 224, 30));

        color4.setColorEnd(new java.awt.Color(255, 255, 255));
        color4.setColorStart(new java.awt.Color(102, 0, 102));

        javax.swing.GroupLayout color4Layout = new javax.swing.GroupLayout(color4);
        color4.setLayout(color4Layout);
        color4Layout.setHorizontalGroup(
            color4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        color4Layout.setVerticalGroup(
            color4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        color3.add(color4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 5));

        color5.setColorEnd(new java.awt.Color(102, 0, 102));

        javax.swing.GroupLayout color5Layout = new javax.swing.GroupLayout(color5);
        color5.setLayout(color5Layout);
        color5Layout.setHorizontalGroup(
            color5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        color5Layout.setVerticalGroup(
            color5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        color3.add(color5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 325, 350, 5));

        jPanel2.add(color3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 350, 330));

        color2.setColorEnd(new java.awt.Color(204, 204, 204));
        color2.setColorStart(new java.awt.Color(102, 0, 102));
        color2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Haway-removebg-preview.png"))); // NOI18N
        color2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 330));

        jPanel2.add(color2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

            public boolean isEmpty(){
        if(text_username.getText().isEmpty()){
            JOptionPane.showConfirmDialog(null, "Username Tidak Ditemukan", "Peringatan", 2);
            return false;
        }if(String.valueOf(text_password.getPassword()).isEmpty()){
            JOptionPane.showConfirmDialog(null, "Password Tidak Ditemukan", "Peringatan", 2);
            return false;
        }
        return true;
      }
    
    
    
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMouseDragged

    private void _lihatpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__lihatpasswordActionPerformed
        if(_lihatpassword.isSelected()){
            text_password.setEchoChar((char)0);
        }
        else{
            text_password.setEchoChar('*');
        }
    }//GEN-LAST:event__lihatpasswordActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        Register reg = new Register();
        reg.setVisible(true);
        reg.pack();
        reg.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jButto_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButto_cancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButto_cancelActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        if (!isEmpty()) {
            return;
        }
        try {
            configDB();
        } catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {

            if (con == null || con.isClosed()) {
                con = configDB();}

            // Mengambil nilai dari form input
            String username = text_username.getText().trim();
            String password = String.valueOf(text_password.getPassword()).trim();

            // Validasi input kosong
            if (username.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Harap mengisi semua field!", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String query = "SELECT * FROM user WHERE Username = ? AND Password = ?";
            pst = con.prepareStatement(query);
            pst.setString(1, username);
            pst.setString(2, password);
            // Eksekusi query
            ResultSet rs = pst.executeQuery();

            // Menampilkan hasil operasi
            if (rs.next()) { // Jika ditemukan
                Session.Id_user = rs.getInt("Id_user");
                dashbord dash = new dashbord();
                dash.setVisible(true);
                dash.pack();
                dash.setLocationRelativeTo(null);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Username atau password salah!");
            }

            rs.close();
            pst.close();
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,  "Kesalahan saat login: " + ex.getMessage());
        }
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_loginMouseClicked

    private void text_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_usernameActionPerformed

    private void btn_loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseEntered

    }//GEN-LAST:event_btn_loginMouseEntered


    
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
            java.util.logging.Logger.getLogger(Loginn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loginn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loginn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loginn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loginn().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox _lihatpassword;
    private javax.swing.JButton btn_login;
    private menu.color color1;
    private menu.color color2;
    private menu.color color3;
    private menu.color color4;
    private menu.color color5;
    private javax.swing.JButton jButto_cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField text_password;
    private javax.swing.JTextField text_username;
    // End of variables declaration//GEN-END:variables
}
