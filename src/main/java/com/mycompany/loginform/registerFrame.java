/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.loginform;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class registerFrame extends javax.swing.JFrame {

    /**
     * Creates new form register
     */
    public registerFrame() {
        initComponents();
        //imagelabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("1.jpeg")));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblusername = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NEmailField = new javax.swing.JFormattedTextField();
        NCinField = new javax.swing.JFormattedTextField();
        NUsernameField = new javax.swing.JFormattedTextField();
        NPasswordField = new javax.swing.JPasswordField();
        NConfirmPasswordField = new javax.swing.JPasswordField();
        backBtn = new javax.swing.JButton();
        registerBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pharmacie");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,0));
        jPanel1.setForeground(new java.awt.Color(0, 0, 102));

        lblusername.setFont(new java.awt.Font("Marker Felt", 0, 30)); // NOI18N
        lblusername.setForeground(new java.awt.Color(0, 153, 0));
        lblusername.setText("username :");

        jLabel3.setFont(new java.awt.Font("Marker Felt", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 0));
        jLabel3.setText("email :");

        jLabel4.setFont(new java.awt.Font("Marker Felt", 0, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 0));
        jLabel4.setText("password :");

        jLabel5.setFont(new java.awt.Font("Marker Felt", 0, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 0));
        jLabel5.setText("confirm password :");

        jLabel6.setFont(new java.awt.Font("Marker Felt", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 0));
        jLabel6.setText("CIN :");

        NEmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NEmailFieldActionPerformed(evt);
            }
        });

        NCinField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NCinFieldActionPerformed(evt);
            }
        });

        NUsernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUsernameFieldActionPerformed(evt);
            }
        });

        NPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NPasswordFieldActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Marker Felt", 0, 13)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        registerBtn.setFont(new java.awt.Font("Marker Felt", 0, 13)); // NOI18N
        registerBtn.setText("Register");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblusername)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NCinField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NEmailField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NUsernameField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(backBtn)
                                .addGap(368, 368, 368)
                                .addComponent(registerBtn))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(124, 124, 124)
                                    .addComponent(NPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(NConfirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblusername)
                    .addComponent(NUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(NEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(NCinField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(NPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(NConfirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(registerBtn))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 760, 430));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\xampp\\htdocs\\2.PNG")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void NCinFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NCinFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NCinFieldActionPerformed

    private void NUsernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUsernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NUsernameFieldActionPerformed

    private void NEmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NEmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NEmailFieldActionPerformed

    private void NPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NPasswordFieldActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        LoginForm reg = new LoginForm();
        reg.setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_backBtnActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
       String userName = NUsernameField.getText();
       String email = NEmailField.getText();
       String cin=NCinField.getText();
       String password = String.valueOf(NPasswordField.getPassword());
       String confirmPassword = String.valueOf(NConfirmPasswordField.getPassword());
       
       boolean isempty = userName.isEmpty() || cin.isEmpty()|| email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty();
       
       if(isempty ){
           JOptionPane.showMessageDialog(this, "veuillez entrez tout les information necessaire ");  
       }
       else if ( ! password.equals(confirmPassword)){
           JOptionPane.showMessageDialog(this, "veuillez entrez confirmer votre mot de pass ");  

       }
       else if(userExiste(userName)){
            JOptionPane.showMessageDialog(this, "le nom d'utilisateur est deja pris ");  

       }
       else{
            PreparedStatement ps;
            String query ="INSERT INTO `users`(`USERNAME`, `EMAIL`, `CIN`, `PASSWORD`,`IS_ADMIN`) VALUES (?,?,?,?,0)";
           try {
               ps= MyConnection.getConnection().prepareStatement(query);
               
               ps.setString(1, userName);
               ps.setString(2, email);
               ps.setString(3, cin);
               ps.setString(4, password);
               
               if(ps.executeUpdate()>0){
                   JOptionPane.showMessageDialog(null, "user added");
               }
           } catch (SQLException ex) {
               Logger.getLogger(registerFrame.class.getName()).log(Level.SEVERE, null, ex);
           }
            
       }
       
      
        
    }//GEN-LAST:event_registerBtnActionPerformed

    public boolean userExiste(String username){
        boolean userexis=true;
        PreparedStatement ps;
            ResultSet rs;
            String query = "SELECT * FROM `users` WHERE `USERNAME` =?"  ;
            
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            ps.setString(1, username); 
            rs = ps.executeQuery();
            if(!rs.next()){
                userexis =false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(registerFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
        return userexis;
    }
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
            java.util.logging.Logger.getLogger(registerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registerFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField NCinField;
    private javax.swing.JPasswordField NConfirmPasswordField;
    private javax.swing.JFormattedTextField NEmailField;
    private javax.swing.JPasswordField NPasswordField;
    private javax.swing.JFormattedTextField NUsernameField;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblusername;
    private javax.swing.JButton registerBtn;
    // End of variables declaration//GEN-END:variables
}
