/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author dextrix
 */
public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
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

        Container_left = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Container_Right = new javax.swing.JPanel();
        Login_Container = new javax.swing.JPanel();
        LoginText = new javax.swing.JLabel();
        Username_Label = new javax.swing.JLabel();
        Username_Label1 = new javax.swing.JLabel();
        UserName_Input = new javax.swing.JTextField();
        Password_Input = new javax.swing.JPasswordField();
        Login_Btn = new javax.swing.JButton();
        Username_Label2 = new javax.swing.JLabel();
        Username_Label3 = new javax.swing.JLabel();
        Project_Label = new javax.swing.JLabel();

        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Container_left.setBackground(new java.awt.Color(255, 255, 255));
        Container_left.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Container_left.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/loginImage.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Gayathri Thin", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Welcome to world ");

        jLabel3.setFont(new java.awt.Font("Gayathri Thin", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("of Trading !");

        javax.swing.GroupLayout Container_leftLayout = new javax.swing.GroupLayout(Container_left);
        Container_left.setLayout(Container_leftLayout);
        Container_leftLayout.setHorizontalGroup(
            Container_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Container_leftLayout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addGroup(Container_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Container_leftLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Container_leftLayout.createSequentialGroup()
                        .addGroup(Container_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69))))
        );
        Container_leftLayout.setVerticalGroup(
            Container_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Container_leftLayout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        getContentPane().add(Container_left, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 0, -1, 600));

        Container_Right.setBackground(new java.awt.Color(51, 51, 255));

        Login_Container.setBackground(new java.awt.Color(102, 75, 233));

        LoginText.setFont(new java.awt.Font("DejaVu Serif", 0, 36)); // NOI18N
        LoginText.setText("LOGIN");
        LoginText.setAutoscrolls(true);

        Username_Label.setFont(new java.awt.Font("Lohit Devanagari", 0, 18)); // NOI18N
        Username_Label.setText("Password : ");

        Username_Label1.setFont(new java.awt.Font("Lohit Devanagari", 0, 18)); // NOI18N
        Username_Label1.setText("User Name : ");

        UserName_Input.setBackground(new java.awt.Color(102, 153, 255));
        UserName_Input.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        UserName_Input.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        UserName_Input.setToolTipText("Enter Username");
        UserName_Input.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        UserName_Input.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        UserName_Input.setOpaque(false);
        UserName_Input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserName_InputActionPerformed(evt);
            }
        });

        Password_Input.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Password_Input.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Password_Input.setToolTipText("Enter Password");
        Password_Input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Password_Input.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Password_Input.setOpaque(false);

        Login_Btn.setBackground(new java.awt.Color(255, 51, 0));
        Login_Btn.setFont(new java.awt.Font("Nimbus Mono L", 1, 24)); // NOI18N
        Login_Btn.setText("Login");
        Login_Btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 1, true));

        Username_Label2.setFont(new java.awt.Font("Lohit Devanagari", 1, 14)); // NOI18N
        Username_Label2.setText("Forgot Password ?");
        Username_Label2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Username_Label2MouseClicked(evt);
            }
        });

        Username_Label3.setFont(new java.awt.Font("Lohit Devanagari", 1, 14)); // NOI18N
        Username_Label3.setText("New User?");
        Username_Label3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Username_Label3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Login_ContainerLayout = new javax.swing.GroupLayout(Login_Container);
        Login_Container.setLayout(Login_ContainerLayout);
        Login_ContainerLayout.setHorizontalGroup(
            Login_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Login_ContainerLayout.createSequentialGroup()
                .addGroup(Login_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Login_ContainerLayout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(LoginText, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Login_ContainerLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(Login_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Username_Label1, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                            .addComponent(Username_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Login_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UserName_Input, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                            .addComponent(Password_Input))))
                .addGap(51, 51, 51))
            .addGroup(Login_ContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Username_Label2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Username_Label3)
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Login_ContainerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Login_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156))
        );
        Login_ContainerLayout.setVerticalGroup(
            Login_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Login_ContainerLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(LoginText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(Login_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Username_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserName_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(Login_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Username_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(Login_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Login_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Username_Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Username_Label3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87))
        );

        Project_Label.setFont(new java.awt.Font("Ubuntu Light", 0, 48)); // NOI18N
        Project_Label.setText("TradeDeck");
        Project_Label.setToolTipText("");
        Project_Label.setAlignmentX(0.2F);

        javax.swing.GroupLayout Container_RightLayout = new javax.swing.GroupLayout(Container_Right);
        Container_Right.setLayout(Container_RightLayout);
        Container_RightLayout.setHorizontalGroup(
            Container_RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Container_RightLayout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(Login_Container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Container_RightLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Project_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );
        Container_RightLayout.setVerticalGroup(
            Container_RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Container_RightLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(Project_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Login_Container, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        getContentPane().add(Container_Right, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 0, 690, 600));

        setSize(new java.awt.Dimension(1057, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UserName_InputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserName_InputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserName_InputActionPerformed

    private void Username_Label2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Username_Label2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Username_Label2MouseClicked

    private void Username_Label3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Username_Label3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Username_Label3MouseClicked

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container_Right;
    private javax.swing.JPanel Container_left;
    private javax.swing.JLabel LoginText;
    private javax.swing.JButton Login_Btn;
    private javax.swing.JPanel Login_Container;
    private javax.swing.JPasswordField Password_Input;
    private javax.swing.JLabel Project_Label;
    private javax.swing.JTextField UserName_Input;
    private javax.swing.JLabel Username_Label;
    private javax.swing.JLabel Username_Label1;
    private javax.swing.JLabel Username_Label2;
    private javax.swing.JLabel Username_Label3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
