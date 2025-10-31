package login.view;

import login.view.CadastroView;

public class LoginView extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(LoginView.class.getName());

    public LoginView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        signinButton = new javax.swing.JButton();
        confirmLogButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPasswordField1 = new javax.swing.JPasswordField();
        juserField = new javax.swing.JTextField();
        loginLabel = new javax.swing.JLabel();
        FundoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signinButton.setContentAreaFilled(false);
        signinButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinButtonActionPerformed(evt);
            }
        });
        getContentPane().add(signinButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 770, 110, 30));

        confirmLogButton.setContentAreaFilled(false);
        confirmLogButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirmLogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmLogButtonActionPerformed(evt);
            }
        });
        getContentPane().add(confirmLogButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 680, 200, 70));

        jScrollPane2.setBorder(null);

        jTextPane1.setEditable(false);
        jTextPane1.setBackground(new java.awt.Color(52, 58, 64));
        jTextPane1.setBorder(null);
        jTextPane1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(244, 162, 97));
        jTextPane1.setText("Cadastre-se");
        jTextPane1.setToolTipText("");
        jTextPane1.setAutoscrolls(false);
        jScrollPane2.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 770, -1, -1));

        jPasswordField1.setBackground(new java.awt.Color(233, 236, 239));
        jPasswordField1.setForeground(new java.awt.Color(52, 58, 64));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 620, 320, 30));

        juserField.setBackground(new java.awt.Color(233, 236, 239));
        juserField.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        juserField.setForeground(new java.awt.Color(52, 58, 64));
        juserField.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        juserField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juserFieldActionPerformed(evt);
            }
        });
        getContentPane().add(juserField, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 490, 320, 30));

        loginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Login.png"))); // NOI18N
        loginLabel.setToolTipText("");
        loginLabel.setAlignmentX(960.0F);
        loginLabel.setAlignmentY(540.0F);
        getContentPane().add(loginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        FundoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/fundo.jpg"))); // NOI18N
        FundoLabel.setText("jLabel1");
        getContentPane().add(FundoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1960, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void confirmLogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmLogButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmLogButtonActionPerformed

    private void signinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinButtonActionPerformed
        CadastroView telaDeCadastro = new CadastroView();
        telaDeCadastro.setVisible(true);
    }//GEN-LAST:event_signinButtonActionPerformed

    private void juserFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juserFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_juserFieldActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new LoginView().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FundoLabel;
    private javax.swing.JButton confirmLogButton;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextField juserField;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JButton signinButton;
    // End of variables declaration//GEN-END:variables
}
