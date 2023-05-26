package Main;


import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import javax.swing.JOptionPane;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Random;
import java.sql.PreparedStatement;
import static javax.swing.UIManager.getString;

public class projectIcon3 extends javax.swing.JFrame {

    /**
     * Creates new form projectIcon3
     */
    public Connection con;
    public Statement stm;
    public PreparedStatement pst;
    public ResultSet rs = null;
    
   
    
    public projectIcon3() {
        initComponents();
    }

        public boolean checkLogin(String Username, String Password)
            {
                String sqlcon ="select * from user";
                
                try{
                    ResultSet cek = mainConnectionDB.con.createStatement().executeQuery(sqlcon);
                    while(cek.next()){
                        String hassPass = passEncrypt.generateSecurePassword(Password, cek.getString("salt"));
                        if(Username.equals(cek.getString("username")) && hassPass.equals(cek.getString("password")) ){
                            return true;
                        }
                    }
                }catch(SQLException ex){
                    System.out.println(ex.toString());
                }
                return false;
            }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jUser = new javax.swing.JTextField();
        btnlogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();
        Backlogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jUser.setBackground(new java.awt.Color(248, 249, 251));
        jUser.setBorder(null);
        getContentPane().add(jUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 270, 30));

        btnlogin.setContentAreaFilled(false);
        btnlogin.setBackground(new java.awt.Color(85, 85, 85));
        btnlogin.setContentAreaFilled(false);
        btnlogin.setFont(new java.awt.Font("Wide Latin", 1, 14)); // NOI18N
        btnlogin.setContentAreaFilled(false);
        btnlogin.setForeground(new java.awt.Color(255, 255, 255));
        btnlogin.setContentAreaFilled(false);
        btnlogin.setText("LOGIN");
        btnlogin.setContentAreaFilled(false);
        btnlogin.setBorder(null);
        btnlogin.setOpaque(true);
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 560, 180, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 20, 20));

        jPassword.setBackground(new java.awt.Color(247, 249, 251));
        jPassword.setBorder(null);
        jPassword.setOpaque(true);
        jPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 270, 30));

        Backlogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Backlogin.setText("Back");
        Backlogin.setContentAreaFilled(false);
        Backlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackloginActionPerformed(evt);
            }
        });
        getContentPane().add(Backlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/project3.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 440, 730));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        // TODO add your handling code here:
        System.out.println("hasil = " + checkLogin(jUser.getText(), jPassword.getText()));
        System.out.println(jUser.getText());
        System.out.println(jPassword.getText());
       
        if(checkLogin(jUser.getText(), jPassword.getText())){
           JOptionPane.showMessageDialog(null, "Login Berhasil!", "Login", 
                   JOptionPane.INFORMATION_MESSAGE);
                   main main = new main();
                   main.setVisible(true);
                   this.setVisible(false);
                   dispose();
       }else {
           JOptionPane.showMessageDialog(null, "Pasdstikan Username Dan Password Yang Anda Masukkan Benar", "Login", 
                   JOptionPane.ERROR_MESSAGE);
           
       }
        
         
    }//GEN-LAST:event_btnloginActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordActionPerformed

    private void BackloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackloginActionPerformed
        // TODO add your handling code here:
        projectIcon1 regist = new projectIcon1();
       regist.setVisible(true);
        Backlogin.setVisible(true);
        JOptionPane.showMessageDialog(null, "Back");
    }//GEN-LAST:event_BackloginActionPerformed

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
            java.util.logging.Logger.getLogger(projectIcon3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(projectIcon3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(projectIcon3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(projectIcon3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new projectIcon3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Backlogin;
    private javax.swing.JButton btnlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jUser;
    // End of variables declaration//GEN-END:variables
}