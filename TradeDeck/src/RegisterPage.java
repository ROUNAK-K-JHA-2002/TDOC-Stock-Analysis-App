/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author dextrix
 */
public class RegisterPage extends javax.swing.JFrame {

    /**
     * Creates new form RegisterPage
     */
    public RegisterPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        Register_Container = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Name_Label = new javax.swing.JLabel();
        Name_Label1 = new javax.swing.JLabel();
        Name_Label2 = new javax.swing.JLabel();
        Name_Label3 = new javax.swing.JLabel();
        Name_Label4 = new javax.swing.JLabel();
        FirstName_Input = new javax.swing.JTextField();
        Email_Input = new javax.swing.JTextField();
        LastName_Input = new javax.swing.JTextField();
        Name_Label5 = new javax.swing.JLabel();
        Name_Label6 = new javax.swing.JLabel();
        Password_Input = new javax.swing.JPasswordField();
        CnfPassword_Input = new javax.swing.JPasswordField();
        Register_Btn = new javax.swing.JButton();
        UserName_Input = new javax.swing.JTextField();
        Name_Label7 = new javax.swing.JLabel();
        Register_Btn1 = new javax.swing.JButton();
        Register_title = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 255));
        setForeground(java.awt.Color.white);
        setUndecorated(true);

        Register_Container.setBackground(new java.awt.Color(255, 102, 102));
        Register_Container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setFont(new java.awt.Font("DejaVu Sans Mono", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("REGISTER");

        Name_Label.setFont(new java.awt.Font("Manjari", 0, 18)); // NOI18N
        Name_Label.setForeground(new java.awt.Color(0, 0, 0));
        Name_Label.setText("First Name :  ");

        Name_Label1.setFont(new java.awt.Font("Manjari", 0, 18)); // NOI18N
        Name_Label1.setForeground(new java.awt.Color(0, 0, 0));
        Name_Label1.setText("Password  :");

        Name_Label2.setFont(new java.awt.Font("Manjari", 0, 18)); // NOI18N
        Name_Label2.setForeground(new java.awt.Color(0, 0, 0));
        Name_Label2.setText("Email  : ");

        Name_Label3.setFont(new java.awt.Font("Manjari", 0, 18)); // NOI18N
        Name_Label3.setText("Aadhar Card ID : ");

        Name_Label4.setFont(new java.awt.Font("Manjari", 0, 18)); // NOI18N
        Name_Label4.setText("Pan Card Number : ");

        FirstName_Input.setBackground(new java.awt.Color(255, 153, 153));
        FirstName_Input.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FirstName_Input.setToolTipText("Enter Full Name");
        FirstName_Input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        FirstName_Input.setOpaque(false);
        FirstName_Input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstName_InputActionPerformed(evt);
            }
        });

        Email_Input.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Email_Input.setToolTipText("Enter Full Name");
        Email_Input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Email_Input.setOpaque(false);

        LastName_Input.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        LastName_Input.setToolTipText("Enter Full Name");
        LastName_Input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        LastName_Input.setOpaque(false);

        Name_Label5.setFont(new java.awt.Font("Manjari", 0, 18)); // NOI18N
        Name_Label5.setForeground(new java.awt.Color(0, 0, 0));
        Name_Label5.setText("Last Name :  ");

        Name_Label6.setFont(new java.awt.Font("Manjari", 0, 18)); // NOI18N
        Name_Label6.setForeground(new java.awt.Color(0, 0, 0));
        Name_Label6.setText("Cnf Password : ");

        Password_Input.setBackground(new java.awt.Color(0, 153, 255));
        Password_Input.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Password_Input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Password_Input.setOpaque(false);

        CnfPassword_Input.setBackground(new java.awt.Color(0, 153, 255));
        CnfPassword_Input.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CnfPassword_Input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        CnfPassword_Input.setOpaque(false);

        Register_Btn.setBackground(new java.awt.Color(102, 102, 255));
        Register_Btn.setFont(new java.awt.Font("Noto Sans CJK HK", 0, 18)); // NOI18N
        Register_Btn.setText("Submit");
        Register_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Register_BtnMouseClicked(evt);
            }
        });
        Register_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Register_BtnActionPerformed(evt);
            }
        });

        UserName_Input.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        UserName_Input.setToolTipText("Enter Full Name");
        UserName_Input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        UserName_Input.setOpaque(false);

        Name_Label7.setFont(new java.awt.Font("Manjari", 0, 18)); // NOI18N
        Name_Label7.setForeground(new java.awt.Color(0, 0, 0));
        Name_Label7.setText("UserName : ");

        Register_Btn1.setBackground(new java.awt.Color(0, 153, 153));
        Register_Btn1.setFont(new java.awt.Font("Mukti Narrow", 0, 18)); // NOI18N
        Register_Btn1.setText("Already a User ?");
        Register_Btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Register_Btn1MouseClicked(evt);
            }
        });
        Register_Btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Register_Btn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Name_Label3)
                            .addComponent(Name_Label4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Name_Label6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Name_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Name_Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Name_Label7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Name_Label5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Name_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UserName_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Email_Input, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                                .addComponent(FirstName_Input, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                                .addComponent(LastName_Input, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                                .addComponent(Password_Input)
                                .addComponent(CnfPassword_Input))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel1)))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(Register_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Register_Btn1)
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FirstName_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LastName_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name_Label5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name_Label7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserName_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name_Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CnfPassword_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name_Label6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Register_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Register_Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(417, 417, 417)
                .addComponent(Name_Label3)
                .addGap(48, 48, 48)
                .addComponent(Name_Label4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Register_Container.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 450, 650));

        Register_title.setFont(new java.awt.Font("AnjaliOldLipi", 1, 24)); // NOI18N
        Register_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Register_title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/dashboard.png"))); // NOI18N
        Register_title.setText("TradeDeck");
        Register_title.setToolTipText("");
        Register_Container.add(Register_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 280, 60));

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("Liberation Mono", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("X");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Register_Container.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 20, 30, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Register_Container, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Register_Container, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FirstName_InputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstName_InputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstName_InputActionPerformed

    private void Register_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Register_BtnMouseClicked
      
    }//GEN-LAST:event_Register_BtnMouseClicked

    public String HashingPwd(String Password){
        
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA");
            messageDigest.update(Password.getBytes());
            byte[] resultbyteArray = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for(byte b : resultbyteArray){
                sb.append(String.format("%02x", b));
                
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(RegisterPage.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
        return "";
    }
    private void Register_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Register_BtnActionPerformed
           Loading ld = new Loading();
         ld.setVisible(true);
        ld.pack();
        ld.setLocationRelativeTo(null);
        ld.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String FirstName = FirstName_Input.getText();
          String LastName = LastName_Input.getText();
          String UserName = UserName_Input.getText();
          String Email = Email_Input.getText();
          String Psswd = String.valueOf(Password_Input.getPassword());
          String CnfPsswd = String.valueOf(CnfPassword_Input.getPassword());
          String Email_Regex = "/^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$/";
         
          if(FirstName.isBlank()){
               JOptionPane.showMessageDialog(null, "Enter A Valid FirstName");
          }
         else if(LastName.isBlank()){
               JOptionPane.showMessageDialog(null, "Enter A Valid LastName");
          }
          else if(UserName.isBlank()){
               JOptionPane.showMessageDialog(null, "Enter A Valid UserName");
          }
          else if(Email.isBlank() && Email.matches(Email_Regex)){
               JOptionPane.showMessageDialog(null, "Enter A Valid Email Id");
          }
          else if(Psswd.isBlank()){
               JOptionPane.showMessageDialog(null, "Enter A Valid Password");
          }
          else if(CnfPsswd.isBlank()){
               JOptionPane.showMessageDialog(null, "Enter The Confirmation Password");
          }
          else if(!Psswd.equals(CnfPsswd)){
               JOptionPane.showMessageDialog(null, "Password Do not Match");
          }
          else if(Psswd.length()<=6){
               JOptionPane.showMessageDialog(null, "Password Length Must be Greater than 6");
          }
          
          
          else{
              PreparedStatement ps;
        String HashedPassword = HashingPwd(Psswd);
          String query = "INSERT INTO Users (PersonId,First_Name,Last_Name,User_name,Email,Password)" + "VALUES (1,'" +FirstName+"','" +LastName+"','" +UserName+"','" +Email+"','" +HashedPassword+"') ";
        try {
            ps = SqlConnection.getConnection().prepareStatement(query);
            ld.dispose();
            if(ps.executeUpdate() > 0){
               JOptionPane.showMessageDialog(null, "Account Created Succesfully");
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegisterPage.class.getName()).log(Level.SEVERE, null, ex);
        }
          }
       
          
          
    }//GEN-LAST:event_Register_BtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Register_Btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Register_Btn1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Register_Btn1MouseClicked

    private void Register_Btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Register_Btn1ActionPerformed
       LoginPage lgf = new LoginPage();
        lgf.setVisible(true);
        lgf.pack();
        lgf.setLocationRelativeTo(null);
        lgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_Register_Btn1ActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField CnfPassword_Input;
    private javax.swing.JTextField Email_Input;
    private javax.swing.JTextField FirstName_Input;
    private javax.swing.JTextField LastName_Input;
    private javax.swing.JLabel Name_Label;
    private javax.swing.JLabel Name_Label1;
    private javax.swing.JLabel Name_Label2;
    private javax.swing.JLabel Name_Label3;
    private javax.swing.JLabel Name_Label4;
    private javax.swing.JLabel Name_Label5;
    private javax.swing.JLabel Name_Label6;
    private javax.swing.JLabel Name_Label7;
    private javax.swing.JPasswordField Password_Input;
    private javax.swing.JButton Register_Btn;
    private javax.swing.JButton Register_Btn1;
    private javax.swing.JPanel Register_Container;
    private javax.swing.JLabel Register_title;
    private javax.swing.JTextField UserName_Input;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    // End of variables declaration//GEN-END:variables
}
