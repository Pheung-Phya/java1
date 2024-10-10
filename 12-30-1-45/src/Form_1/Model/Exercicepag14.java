
package gui;

import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Exercicepag14 extends javax.swing.JFrame {

    public Exercicepag14() {
        initComponents();  // have table
        
        this.setLocationRelativeTo(null); //set to center
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tb = new javax.swing.JTable();
        btnupdate = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ttid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ttname = new javax.swing.JTextField();
        ttgender = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ttsalary = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tsearch = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee Record");
        setBackground(new java.awt.Color(204, 0, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        tb.setForeground(new java.awt.Color(255, 0, 153));
        tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Gender", "Salary"
            }
        ));
        tb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb);

        btnupdate.setBackground(new java.awt.Color(0, 204, 204));
        btnupdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnupdate.setForeground(java.awt.Color.black);
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 204, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(java.awt.Color.black);
        jButton2.setText("Add New");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 51, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(java.awt.Color.white);
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnclose.setBackground(new java.awt.Color(0, 204, 204));
        btnclose.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnclose.setForeground(new java.awt.Color(0, 0, 0));
        btnclose.setText("Close");
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID");

        ttid.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ttid.setForeground(new java.awt.Color(0, 0, 0));
        ttid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ttid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttidActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Name");

        ttname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ttname.setForeground(java.awt.Color.black);
        ttname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttnameActionPerformed(evt);
            }
        });

        ttgender.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ttgender.setForeground(java.awt.Color.black);
        ttgender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttgenderActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gender");

        ttsalary.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ttsalary.setForeground(java.awt.Color.black);
        ttsalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttsalaryActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Salary");

        jLabel2.setFont(new java.awt.Font("Source Code Pro", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Employee Record Editor");

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Documents\\NetBeansProjects\\tes.png")); // NOI18N

        tsearch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tsearchActionPerformed(evt);
            }
        });

        btnsearch.setBackground(new java.awt.Color(51, 204, 0));
        btnsearch.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnsearch.setForeground(java.awt.Color.white);
        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnclose, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ttid, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ttgender, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ttsalary, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ttname, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(tsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnsearch)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel2)))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsearch))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ttid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ttname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ttgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ttsalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnclose, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        ttsalary.getAccessibleContext().setAccessibleName("Table");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // making update
        
        DefaultTableModel model=(DefaultTableModel) tb.getModel();
        int row=tb.getSelectedRow();
        
        if(row!=-1){
            int id=Integer.parseInt(ttid.getText());
            String name=ttname.getText();
            String gender=ttgender.getText();
            double salary=Double.parseDouble(ttsalary.getText());
            
            
            model.setValueAt(id, row, 0);
            model.setValueAt(name, row, 1);
            model.setValueAt(gender, row, 2);
            model.setValueAt(salary, row, 3);
            
            
            ttid.setText("");
            ttname.setText("");
            ttgender.setText("");
            ttsalary.setText("");
        }else{
            JOptionPane.showMessageDialog(null, "Please Select Row");
        }
        
    }//GEN-LAST:event_btnupdateActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Convert String to int or double in TextField
        
        int id=Integer.parseInt(ttid.getText());
        String name=ttname.getText();
        String gender=ttgender.getText();
        double salary=Double.parseDouble(ttsalary.getText());
//        DefaultTableModel DefaultTableModel = null;
        
        // it's constructor default touch tb.getModel and cast alert this
        DefaultTableModel model= (DefaultTableModel) tb.getModel();
       // Object is static 
        model.addRow(new Object[]{id,name,gender,salary});
        // below will clear data after input ended
        ttid.setText("");
        ttname.setText("");
        ttgender.setText("");
        ttsalary.setText("");
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        
        DefaultTableModel model=(DefaultTableModel) tb.getModel();
        int row=tb.getSelectedRow();
        
        if(row!=-1){
            model.removeRow(row);
            
            // clear input after data to table.
            ttid.setText("");
            ttname.setText("");
            ttgender.setText("");
            ttsalary.setText("");
            
        }else{
            JOptionPane.showMessageDialog(null, "Please Select Row");
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        // TODO add your handling code here // button close
       if(JOptionPane.showConfirmDialog(null, "Do you want to exit?", "Exit?", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
           System.exit(1);
       }
    }//GEN-LAST:event_btncloseActionPerformed

    private void ttidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ttidActionPerformed

    private void ttnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ttnameActionPerformed

    private void ttgenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttgenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ttgenderActionPerformed

    private void ttsalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttsalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ttsalaryActionPerformed

    private void tbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMouseClicked
        // ទាញទិន្នន័យពី table to input:
        int row=tb.getSelectedRow();
        System.out.println("Row: "+row);
        // ទាញទិន្នន័យពី model
        DefaultTableModel model= (DefaultTableModel) tb.getModel();
        if(row!=-1){
            ttid.setText(model.getValueAt(row, 0).toString());// tostring is convert to string
            ttname.setText(model.getValueAt(row, 1).toString());
            ttgender.setText(model.getValueAt(row, 2).toString());
            ttsalary.setText(model.getValueAt(row, 3).toString());
            
        }
   
    }//GEN-LAST:event_tbMouseClicked

    private void tsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tsearchActionPerformed
         TableRowSorter<DefaultTableModel> rowSorter;                                            
            DefaultTableModel model = (DefaultTableModel) tb.getModel();
            rowSorter = new TableRowSorter<>(model);
            tb.setRowSorter(rowSorter); // Attach the sorter to the JTable
             // Assuming your search field is called txt_searchName
            tsearch.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                filterByName();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                filterByName();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                filterByName();
            }

            private void filterByName() {
                String searchText = tsearch.getText();
                if (searchText.trim().length() == 0) {
                    rowSorter.setRowFilter(null); // No filter if the text field is empty
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + searchText, 1)); // Case-insensitive filter on column 1 (Name)
                }
            }
        });
        
    }//GEN-LAST:event_tsearchActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // text search
            
    }//GEN-LAST:event_btnsearchActionPerformed

  
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
            java.util.logging.Logger.getLogger(Exercicepag14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exercicepag14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exercicepag14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exercicepag14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exercicepag14().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb;
    private javax.swing.JTextField tsearch;
    private javax.swing.JTextField ttgender;
    private javax.swing.JTextField ttid;
    private javax.swing.JTextField ttname;
    private javax.swing.JTextField ttsalary;
    // End of variables declaration//GEN-END:variables
}
