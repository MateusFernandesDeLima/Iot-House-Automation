package login.view;

public class CadastroView extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CadastroView.class.getName());

    public CadastroView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField3 = new javax.swing.JPasswordField();
        juserNameField = new javax.swing.JTextField();
        jstateField = new javax.swing.JTextField();
        jemailField = new javax.swing.JTextField();
        jphoneField = new javax.swing.JTextField();
        jadressField = new javax.swing.JTextField();
        jnumberField = new javax.swing.JTextField();
        jcityField = new javax.swing.JTextField();
        confirmButton = new javax.swing.JButton();
        loginLabel = new javax.swing.JLabel();
        FundoLabel = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        jPasswordField2.setText("jPasswordField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPasswordField3.setBackground(new java.awt.Color(233, 236, 239));
        jPasswordField3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jPasswordField3.setForeground(new java.awt.Color(52, 58, 64));
        getContentPane().add(jPasswordField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 730, 590, 30));

        juserNameField.setBackground(new java.awt.Color(233, 236, 239));
        juserNameField.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        juserNameField.setForeground(new java.awt.Color(52, 58, 64));
        juserNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juserNameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(juserNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 800, 30));

        jstateField.setBackground(new java.awt.Color(233, 236, 239));
        jstateField.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jstateField.setForeground(new java.awt.Color(52, 58, 64));
        jstateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jstateFieldActionPerformed(evt);
            }
        });
        getContentPane().add(jstateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 650, 80, 30));

        jemailField.setBackground(new java.awt.Color(233, 236, 239));
        jemailField.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jemailField.setForeground(new java.awt.Color(52, 58, 64));
        jemailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jemailFieldActionPerformed(evt);
            }
        });
        getContentPane().add(jemailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 490, 370, 30));

        jphoneField.setBackground(new java.awt.Color(233, 236, 239));
        jphoneField.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jphoneField.setForeground(new java.awt.Color(52, 58, 64));
        jphoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jphoneFieldActionPerformed(evt);
            }
        });
        getContentPane().add(jphoneField, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 490, 410, 30));

        jadressField.setBackground(new java.awt.Color(233, 236, 239));
        jadressField.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jadressField.setForeground(new java.awt.Color(52, 58, 64));
        jadressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jadressFieldActionPerformed(evt);
            }
        });
        getContentPane().add(jadressField, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 570, 620, 30));

        jnumberField.setBackground(new java.awt.Color(233, 236, 239));
        jnumberField.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jnumberField.setForeground(new java.awt.Color(52, 58, 64));
        jnumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnumberFieldActionPerformed(evt);
            }
        });
        getContentPane().add(jnumberField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 570, 80, 30));

        jcityField.setBackground(new java.awt.Color(233, 236, 239));
        jcityField.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jcityField.setForeground(new java.awt.Color(52, 58, 64));
        jcityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcityFieldActionPerformed(evt);
            }
        });
        getContentPane().add(jcityField, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 650, 370, 30));

        confirmButton.setContentAreaFilled(false);
        confirmButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(confirmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 740, 200, 80));

        loginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Cadastro.png"))); // NOI18N
        loginLabel.setToolTipText("");
        loginLabel.setAlignmentX(960.0F);
        loginLabel.setAlignmentY(540.0F);
        getContentPane().add(loginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        FundoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/fundo.jpg"))); // NOI18N
        FundoLabel.setText("jLabel1");
        getContentPane().add(FundoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1960, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmPasswordActionPerformed

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void phoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneFieldActionPerformed

    private void adressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adressFieldActionPerformed

    private void numberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberFieldActionPerformed

    private void cityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityFieldActionPerformed

    private void stateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stateFieldActionPerformed

    private void jstateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jstateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jstateFieldActionPerformed

    private void juserNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juserNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_juserNameFieldActionPerformed

    private void jemailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jemailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jemailFieldActionPerformed

    private void jphoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jphoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jphoneFieldActionPerformed

    private void jadressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jadressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jadressFieldActionPerformed

    private void jnumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jnumberFieldActionPerformed

    private void jcityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcityFieldActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new CadastroView().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FundoLabel;
    private javax.swing.JButton confirmButton;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jadressField;
    private javax.swing.JTextField jcityField;
    private javax.swing.JTextField jemailField;
    private javax.swing.JTextField jnumberField;
    private javax.swing.JTextField jphoneField;
    private javax.swing.JTextField jstateField;
    private javax.swing.JTextField juserNameField;
    private javax.swing.JLabel loginLabel;
    // End of variables declaration//GEN-END:variables
}
