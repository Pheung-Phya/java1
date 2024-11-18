package Project_end;
public class FormPay extends javax.swing.JFrame {  
    public FormPay() {
        initComponents();
    }
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtreturn = new javax.swing.JTextField();
        txttotal = new javax.swing.JTextField();
        txtdis = new javax.swing.JTextField();
        txtpay = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtrev = new javax.swing.JTextField();
        cddis = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        jLabel8.setBackground(new java.awt.Color(0, 153, 153));
        jLabel8.setOpaque(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(638, 429));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Kh BL LazyDistorted", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Payment Form ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 300, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Payment");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 110, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 110, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Discount%");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 110, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cash Return");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 110, 20));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Discount$");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 110, -1));

        txtreturn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtreturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtreturnActionPerformed(evt);
            }
        });
        getContentPane().add(txtreturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 180, 30));

        txttotal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(txttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 180, 30));

        txtdis.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(txtdis, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 180, 30));

        txtpay.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(txtpay, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 180, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cash Receive ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 110, -1));

        txtrev.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtrev.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtrevKeyReleased(evt);
            }
        });
        getContentPane().add(txtrev, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 180, 30));

        cddis.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cddis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0%", "10%", "20%", "30%", "40%", "50%", "60%", "70%", " " }));
        cddis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cddisActionPerformed(evt);
            }
        });
        getContentPane().add(cddis, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 180, 24));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Eras Bold ITC", 0, 12)); // NOI18N
        jButton1.setText("<<<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 90, -1));

        jButton2.setBackground(new java.awt.Color(51, 255, 0));
        jButton2.setFont(new java.awt.Font("Eras Bold ITC", 0, 12)); // NOI18N
        jButton2.setText("Cash");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, 90, -1));

        jLabel9.setBackground(new java.awt.Color(0, 153, 153));
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 390));

        getAccessibleContext().setAccessibleDescription("");
        getAccessibleContext().setAccessibleParent(jButton1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void cddisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cddisActionPerformed

       
    }//GEN-LAST:event_cddisActionPerformed

    private void txtrevKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrevKeyReleased

        
    }//GEN-LAST:event_txtrevKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        FormFood.main(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtreturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtreturnActionPerformed

    }//GEN-LAST:event_txtreturnActionPerformed

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new FormPay().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cddis;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtdis;
    private javax.swing.JTextField txtpay;
    private javax.swing.JTextField txtreturn;
    private javax.swing.JTextField txtrev;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
