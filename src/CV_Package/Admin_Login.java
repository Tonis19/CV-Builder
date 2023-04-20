/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CV_Package;

import java.sql.*;
import javax.swing.JOptionPane;
import co.yogesh.Captcha;


public class Admin_Login extends javax.swing.JFrame {
     
    public static Connection mycon(){ 
        Connection con =null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/buildcvdb?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "theStranger#23");
        }

        catch (ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }
        return con;
    }
    Captcha cap =new Captcha();
    public Admin_Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        cap.setImageCaptcha(Captcha);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        user_name = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        Captcha = new javax.swing.JLabel();
        Verify = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 102));
        setLocation(new java.awt.Point(650, 300));
        setSize(new java.awt.Dimension(800, 600));

        jLabel1.setFont(new java.awt.Font("Sitka Display", 1, 36)); // NOI18N
        jLabel1.setText("ADMIN LOGIN PAGE");

        user_name.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        user_name.setText("USERNAME:");

        password.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        password.setText("PASSWORD:");

        jTextField1.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N

        jPasswordField1.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LOGIN");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Verify.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Verify");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Back.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        Back.setText("Back to Customer Login!");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(user_name)
                    .addComponent(password))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(jPasswordField1))
                .addGap(80, 80, 80))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(Verify, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Back)
                            .addComponent(Captcha, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(231, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user_name)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(Captcha, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Verify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(62, 62, 62)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(Back)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jTextField1.getText().length()==0) // Checking for empty field
            JOptionPane.showMessageDialog(null, "Empty fields detected ! Please fill up all fields");

        else if(jPasswordField1.getPassword().length==0) // Checking for empty field

            JOptionPane.showMessageDialog(null, "Empty fields detected ! Please fill up all fields");

        else{
            String user = jTextField1.getText(); // Collecting the input
            char[] pass = jPasswordField1.getPassword(); // Collecting the input
            String pwd = String.copyValueOf(pass); // converting from array to string

            if(validate_login(user,pwd))
                if(cap.Validate (Captcha,Verify.getText())){

                    JOptionPane.showMessageDialog(null, "Correct Login Credentials");
                    setVisible(false);
                    new Admin_page().setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Captcha does not match");
                    
                }
            else

                JOptionPane.showMessageDialog(null, "Incorrect Login Credentials");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(cap.Validate (Captcha,Verify.getText()))

            JOptionPane.showMessageDialog(this, "Captcha matched");

        else

            JOptionPane.showMessageDialog(this, "Captcha does not match");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        setVisible(false);
        new LOGIN().setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JLabel Captcha;
    private javax.swing.JTextField Verify;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel password;
    private javax.swing.JLabel user_name;
    // End of variables declaration//GEN-END:variables

    private boolean validate_login(String username,String password) {

        try{

            Class.forName("com.mysql.cj.jdbc.Driver"); // MySQL database connection

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/buildcvdb?zeroDateTimeBehavior=CONVERT_TO_NULL" , "root", "theStranger#23");

            PreparedStatement pst = conn.prepareStatement("Select * from admin_l where uname=? and pswd=?");

            pst.setString(1, username);

            pst.setString(2, password);

            ResultSet rs = pst.executeQuery();

            if(rs.next())

                return true;

            else

                return false;

        }

        catch(Exception e){

            e.printStackTrace();

            return false;

        }

    }
}
