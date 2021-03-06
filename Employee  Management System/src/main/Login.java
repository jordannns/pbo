
package main;

import javax.swing.JOptionPane;
import java.sql.*;


public class Login extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement ps =null;
    
    public Login() {
        initComponents();
        conn = MyConnection.getConnection();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblUname = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        txtUname = new javax.swing.JTextField();
        btnLoggin = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login_page");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0,80));

        jLabel2.setFont(new java.awt.Font("Harrington", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LOGIN");

        lblUname.setFont(new java.awt.Font("Harrington", 1, 18)); // NOI18N
        lblUname.setForeground(new java.awt.Color(255, 255, 255));
        lblUname.setText("Username :");

        lblPass.setFont(new java.awt.Font("Harrington", 1, 18)); // NOI18N
        lblPass.setForeground(new java.awt.Color(240, 240, 240));
        lblPass.setText("Password :");

        txtUname.setBackground(new java.awt.Color(102, 102, 102));
        txtUname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUname.setForeground(new java.awt.Color(255, 255, 255));

        btnLoggin.setBackground(new java.awt.Color(203, 134, 134));
        btnLoggin.setFont(new java.awt.Font("Harrington", 1, 18)); // NOI18N
        btnLoggin.setForeground(new java.awt.Color(255, 255, 255));
        btnLoggin.setText("Login");
        btnLoggin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLoggin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogginMouseClicked(evt);
            }
        });
        btnLoggin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogginActionPerformed(evt);
            }
        });

        txtPass.setBackground(new java.awt.Color(102, 102, 102));
        txtPass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton2.setBackground(new java.awt.Color(255, 204, 204,80));
        jButton2.setText("Don`t have account?Register Now.");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("  X");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(btnLoggin))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUname)
                            .addComponent(lblPass))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPass, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(txtUname))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUname)
                    .addComponent(txtUname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPass)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(btnLoggin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 340, 330));

        jLabel1.setBackground(new java.awt.Color(51, 51, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\Documents\\Tugas Jordan\\Praktikum KBD\\iStock-504243026-e1514926306494-1024x450.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 450));

        setSize(new java.awt.Dimension(1040, 489));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogginActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
     dispose();
        
    }//GEN-LAST:event_jLabel7MouseClicked

    private void btnLogginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogginMouseClicked
        
     String uname =txtUname.getText();
     String pass =String.valueOf(txtPass.getPassword());
     
     if (uname.equalsIgnoreCase("")) {
         JOptionPane.showMessageDialog(null,"Username Field Is Empty");
     }else if (pass.equalsIgnoreCase("")) {
         JOptionPane.showMessageDialog(null,"Password Field  Is Empty");
     }else{
         String query = "SELECT * FROM `user` WHERE uname= ? AND pass=?";
         try {
             ps = conn.prepareStatement(query);
             ps.setString(1, uname);
             ps.setString(2, pass);
             
             rs=ps.executeQuery();
             
             if (rs.next()) {
                String name = rs.getString(3);
                String des= rs.getString(4);
                 JOptionPane.showMessageDialog(null,"Login Successfull");
                 mainmenu m = new mainmenu(name,des);
                 m.setVisible(true);
                 this.dispose();
             }else{
                 JOptionPane.showMessageDialog(null,"Login Failed");
                 txtUname.setText("");
                 txtPass.setText("");
             }
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,ex);
         }
     }
    }//GEN-LAST:event_btnLogginMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
       Register r = new Register();
       r.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton2MouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoggin;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblUname;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUname;
    // End of variables declaration//GEN-END:variables
}
