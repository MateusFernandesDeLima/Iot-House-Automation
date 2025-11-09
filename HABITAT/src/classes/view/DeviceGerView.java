
package classes.view;

import classes.controller.DeviceController;
import classes.model.DeviceModel;
import classes.model.StatusColumnCellRenderer;

public class DeviceGerView extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(DeviceGerView.class.getName());

    private DeviceModel model;
    private DeviceController controller;
    
    public DeviceGerView() {
        model = new DeviceModel();
        controller = new DeviceController(model);
        initComponents();
        jTable1.getColumnModel().getColumn(3).setCellRenderer(new StatusColumnCellRenderer());
        jTable1.setRowHeight(30);
        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        removeButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        onOffButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        removeButton.setBackground(new java.awt.Color(244, 162, 97));
        removeButton.setForeground(new java.awt.Color(233, 236, 239));
        removeButton.setText("REMOVER DISPOSITIVO");
        removeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(removeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 800, 210, 40));

        addButton.setBackground(new java.awt.Color(42, 157, 143));
        addButton.setForeground(new java.awt.Color(233, 236, 239));
        addButton.setText("ADICIONAR DISPOSITIVO");
        addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 800, 210, 40));

        onOffButton.setBackground(new java.awt.Color(42, 157, 153));
        onOffButton.setForeground(new java.awt.Color(233, 236, 239));
        onOffButton.setText("LIGA / DESLIGA");
        onOffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onOffButtonActionPerformed(evt);
            }
        });
        jPanel1.add(onOffButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 380, 200, 80));

        backButton.setContentAreaFilled(false);
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 20, 80, 50));

        jTable1.setBackground(new java.awt.Color(233, 236, 239));
        jTable1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jTable1.setModel(model);
        jTable1.setColumnSelectionAllowed(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 1120, 640));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/DevicesGer.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 900));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void onOffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onOffButtonActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        controller.toggleDeviceStatus(selectedRow);
    }//GEN-LAST:event_onOffButtonActionPerformed

    //popup botao adicionar
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        controller.addDevice();

    }//GEN-LAST:event_addButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        controller.removeDevice(selectedRow);
    }//GEN-LAST:event_removeButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        MainScreen telaInicio = new MainScreen();
        telaInicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new DeviceGerView().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton onOffButton;
    private javax.swing.JButton removeButton;
    // End of variables declaration//GEN-END:variables
}
