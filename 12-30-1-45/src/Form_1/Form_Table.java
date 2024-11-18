
package Form_1;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Form_Table extends javax.swing.JFrame {

    public Form_Table() {
        initComponents();
        Enter();
        FixedHeader();
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb = new javax.swing.JTable();
        btn_close = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        txt_name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_gender = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_salary = new javax.swing.JTextField();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        search_name = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "GENDER", "SALARY"
            }
        ));
        tb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb);
        if (tb.getColumnModel().getColumnCount() > 0) {
            tb.getColumnModel().getColumn(0).setHeaderValue("ID");
            tb.getColumnModel().getColumn(1).setHeaderValue("NAME");
            tb.getColumnModel().getColumn(2).setHeaderValue("GENDER");
            tb.getColumnModel().getColumn(3).setHeaderValue("SALARY");
        }

        btn_close.setBackground(new java.awt.Color(102, 204, 255));
        btn_close.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_close.setText("Close");
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });

        btn_update.setBackground(new java.awt.Color(102, 204, 255));
        btn_update.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete.setBackground(new java.awt.Color(255, 0, 51));
        btn_delete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_add.setBackground(new java.awt.Color(102, 204, 255));
        btn_add.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_add.setText("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        txt_name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Name   : ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Id          :");

        txt_id.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Gender : ");

        txt_gender.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Salary   : ");

        txt_salary.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        search_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_nameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txt_name))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_id, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(txt_gender))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(txt_salary))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btn_add, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                        .addGap(27, 27, 27)
                        .addComponent(btn_update, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                        .addGap(29, 29, 29)
                        .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addGap(37, 37, 37)
                .addComponent(search_name, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search_name, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_salary)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void Enter(){
        txt_id.getInputMap().put(KeyStroke.getKeyStroke("ENTER"), "MoveFocus");
        txt_id.getActionMap().put("MoveFocus", new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e) {
                txt_name.requestFocusInWindow();
            }
            
        });
        txt_name.getInputMap().put(KeyStroke.getKeyStroke("ENTER"), "MoveFocus");
        txt_name.getActionMap().put("MoveFocus", new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e) {
                txt_gender.requestFocusInWindow();
            }
            
        });
        txt_gender.getInputMap().put(KeyStroke.getKeyStroke("ENTER"), "MoveFocus");
        txt_gender.getActionMap().put("MoveFocus", new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e) {
                txt_salary.requestFocusInWindow();
            }           
        });
        // Restrict txt_id to only allow integers
txt_id.addKeyListener(new java.awt.event.KeyAdapter() {
    public void keyTyped(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        String text = txt_id.getText(); // 1
        // Allow only digits (0-9) and backspace/delete
        if (!Character.isDigit(c) &&  c != java.awt.event.KeyEvent.VK_BACK_SPACE && c != java.awt.event.KeyEvent.VK_DELETE || text.length()>5 || c==' ') {          
            evt.consume();  // Ignore the input if it's not a digit
        }
    }
});

// Restrict txt_salary to only allow float values
txt_salary.addKeyListener(new java.awt.event.KeyAdapter() {
    public void keyTyped(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        String text = txt_salary.getText();
        // 111.
        // Allow digits, one period (.) for decimal values, and backspace/delete
        if (!Character.isDigit(c) && c != '.' && c != java.awt.event.KeyEvent.VK_BACK_SPACE && c != java.awt.event.KeyEvent.VK_DELETE) {
            evt.consume();  // Ignore the input
        }
        // Prevent more than one decimal point
//        System.out.println(c);
//        System.out.println(text);
        if (c == '.' && text.contains(".")) {
            evt.consume();  // Ignore if already contains a period
        }
    }
});

    }
    
    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        if(JOptionPane.showConfirmDialog
        (null, "Do you want to exit ? ",
                "Exit", JOptionPane.YES_NO_OPTION)
                ==JOptionPane.YES_OPTION){
                System.exit(1);
        }
    }//GEN-LAST:event_btn_closeActionPerformed
    
    private void FixedHeader(){
         tb.getTableHeader().setReorderingAllowed(false);
    } 
    
    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        int id = Integer.parseInt(txt_id.getText());
        String name = txt_name.getText();
        String gender = txt_gender.getText();
        float salary = Float.parseFloat(txt_salary.getText());
        DefaultTableModel model = (DefaultTableModel) tb.getModel();
        Object[] row = new Object[] {id,name,gender,salary};
        model.addRow(row);
        txt_id.setText("");
        txt_name.setText("");
        txt_gender.setText("");
        txt_salary.setText("");
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
         DefaultTableModel model = (DefaultTableModel) tb.getModel();
         int row = tb.getSelectedRow();
         
        if(row!=-1){
                  int id = Integer.parseInt(txt_id.getText());
                String name = txt_name.getText();
                String gender = txt_gender.getText();
                float salary = Float.parseFloat(txt_salary.getText());
                 model.setValueAt(id, row, 0);
                 model.setValueAt(name, row, 1);
                 model.setValueAt(gender, row, 2);
                 model.setValueAt(salary, row,3);
        }else{
                   JOptionPane.showMessageDialog(null, "Please Select Row to Update ");
         }
        txt_id.setText("");
        txt_name.setText("");
        txt_gender.setText("");
        txt_salary.setText("");
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
         DefaultTableModel model = (DefaultTableModel) tb.getModel();
         int row = tb.getSelectedRow();
         if(row!=-1){
                   model.removeRow(row);
                    txt_id.setText("");
                    txt_name.setText("");
                    txt_gender.setText("");
                    txt_salary.setText("");
         }else{
                   JOptionPane.showMessageDialog(null, "Please Select Row to Delete ");
         }
         
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void tbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMouseClicked
         int row = tb.getSelectedRow();
         System.out.println("row = "+row);
         DefaultTableModel model = (DefaultTableModel) tb.getModel();
         if(row!=-1){
                  txt_id.setText(model.getValueAt(row, 0).toString());
                  txt_name.setText(model.getValueAt(row, 1).toString());
                  txt_gender.setText(model.getValueAt(row, 2).toString());
                  txt_salary.setText(model.getValueAt(row, 3).toString());
         }
    }//GEN-LAST:event_tbMouseClicked
private TableRowSorter<DefaultTableModel> rowSorter;
    private void search_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_nameActionPerformed
         DefaultTableModel model = (DefaultTableModel) tb.getModel();
        rowSorter = new TableRowSorter<>(model);
        tb.setRowSorter(rowSorter);       
        search_name.getDocument().addDocumentListener(new DocumentListener() {
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
                String searchText = search_name.getText();
                if (searchText.trim().length() == 0) {
                    rowSorter.setRowFilter(null); // No filter if the text field is empty
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + searchText, 1)); // Case-insensitive filter on column 1 (Name)
                }
            }
        });
    }//GEN-LAST:event_search_nameActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Table().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_update;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField search_name;
    private javax.swing.JTable tb;
    private javax.swing.JTextField txt_gender;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_salary;
    // End of variables declaration//GEN-END:variables
}
