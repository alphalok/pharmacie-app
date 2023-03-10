/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.loginform;

import com.sun.source.tree.BreakTree;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class LoginForm extends javax.swing.JFrame {
    
    private Connection connection;

    /**
     * Creates new form Login
     */
    public LoginForm() {
        initComponents();
        connection=MyConnection.getConnection();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        usernamefield = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        registerBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0,0));

        jLabel3.setFont(new java.awt.Font("Marker Felt", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password :");

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        loginBtn.setBackground(new java.awt.Color(204, 204, 204));
        loginBtn.setFont(new java.awt.Font("Marker Felt", 0, 24)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(51, 153, 0));
        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        usernamefield.setFont(new java.awt.Font("Marker Felt", 0, 13)); // NOI18N
        usernamefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernamefieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Marker Felt", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username :");

        registerBtn.setFont(new java.awt.Font("Marker Felt", 0, 10)); // NOI18N
        registerBtn.setText("register if you dont have an account !");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usernamefield, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(passwordField))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(162, Short.MAX_VALUE)
                .addComponent(registerBtn)
                .addGap(41, 41, 41)
                .addComponent(loginBtn)
                .addGap(52, 52, 52))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernamefield, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(registerBtn)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loginBtn)
                        .addGap(23, 23, 23))))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 550, 200));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\xampp\\htdocs\\mht.png")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 570));

        setSize(new java.awt.Dimension(1000, 578));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed

        String username = usernamefield.getText();
        String password = String.valueOf(passwordField.getPassword());
        
        if(username.isEmpty() ){
            JOptionPane.showMessageDialog(this, "Veulliez entrer un username");
        }else if(password.isEmpty()){
            JOptionPane.showMessageDialog(this, "Veulliez entrer votre mot de pass");
        }
        else{
            
            PreparedStatement ps;
            ResultSet rs;
            String query = "SELECT * FROM `users` WHERE `USERNAME` =? AND `PASSWORD`= ?";
            
            try {
                ps = connection.prepareStatement(query);
                
                ps.setString(1, username); 
                ps.setString(2, password);
                rs = ps.executeQuery();
                
                
                
                if (rs.next()) {
                    boolean isAdmin = rs.getBoolean("IS_ADMIN");;
                    if(isAdmin){
                        Admin admin = new Admin();
                        admin.setName(rs.getString("USERNAME"));
                        admin.setPassword(rs.getString("PASSWORD"));
                        admin.setId(rs.getInt("ID"));
                        admin.setCin(rs.getString("CIN"));
                        admin.setEmail(rs.getString("EMAIL"));
                     
                        AdminFrame frame = new AdminFrame(admin);
                        frame.setVisible(true);
                        
                    }else{
                        
                    
                     User user = new User();
                     user.setName(rs.getString("USERNAME"));
                     user.setPassword(rs.getString("PASSWORD"));
                     user.setId(rs.getInt("ID"));
                     user.setCin(rs.getString("CIN"));
                     user.setEmail(rs.getString("EMAIL"));
                     user.setSolde(rs.getDouble("SOLDE"));
                     
                     userFrame reg = new userFrame(user);
                     reg.setVisible(true);
                     }
                     
                     this.dispose();
                     
                     
                            
                     
                     
                    
                }
                else{
                    JOptionPane.showMessageDialog(null, "Les information saisie sont incorect");
                }
            } catch (SQLException ex) {
                Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            
           
            
        }
        
        
        
        
       
               // TODO add your handling code here:
    }//GEN-LAST:event_loginBtnActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        // TODO add your handling code here:
        registerFrame reg = new registerFrame();
        reg.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_registerBtnActionPerformed

    private void usernamefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernamefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernamefieldActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton registerBtn;
    private javax.swing.JFormattedTextField usernamefield;
    // End of variables declaration//GEN-END:variables
}
