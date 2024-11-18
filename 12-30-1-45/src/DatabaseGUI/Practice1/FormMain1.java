/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DatabaseGUI.Practice1;
import com.mysql.jdbc.Statement;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class FormMain1 extends javax.swing.JFrame {
    public FormMain1() {
        initComponents();
        formlocation();
        fetchData();
    }
    
    Connection  conn =null;
    Statement stmt=null;
    ResultSet rss=null;
    DefaultTableModel model=null;
    private void formlocation(){
        this.setLocationRelativeTo(null);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btn_add1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        txt_price = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        txt_course = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        rb_male = new javax.swing.JRadioButton();
        rb_female = new javax.swing.JRadioButton();
        btn_add = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();

        btn_add1.setText("ADD USER");
        btn_add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Course : ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Name: ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("UserId : ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Gender : ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Price : ");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Gender", "Course", "Price"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        txt_price.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        txt_price.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_priceMouseClicked(evt);
            }
        });
        txt_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_priceActionPerformed(evt);
            }
        });

        txt_name.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N

        txt_course.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N

        txt_id.setEditable(false);
        txt_id.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        txt_id.setText("id will auto compelte ");

        buttonGroup1.add(rb_male);
        rb_male.setSelected(true);
        rb_male.setText("Male");

        buttonGroup1.add(rb_female);
        rb_female.setText("Female");

        btn_add.setText("ADD USER");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_name, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_id, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_course, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rb_male, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(55, 55, 55)
                                .addComponent(rb_female, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(82, 82, 82))
                            .addComponent(txt_price))
                        .addGap(246, 246, 246))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_course, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rb_male)
                    .addComponent(rb_female))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(115, 115, 115))
        );

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
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
         
        if(      
                  ( txt_name.getText().equals(""))||
                  ( txt_course.getText().equals(""))||
                  ( txt_price.getText().equals(""))
           ){
                   JOptionPane.showMessageDialog(null, "Field can't be empty");
          }else{
                   String name = txt_name.getText();
                    String gender= rb_male.isSelected()?"Male":"Female";
                    String course = txt_course.getText();
                    float price = Float.parseFloat(txt_price.getText());    
                   try {
                       conn  = (Connection) new Config().getConnection();
                       String sql = "INSERT INTO `student` (`id`,`name`,`gender`,`course`,`price`) VALUES(null,'"+name+"','"+gender+"','"+course+"','"+price+"')";
                       stmt = (Statement) conn.prepareStatement(sql);
                       stmt.executeUpdate(sql);
                       fetchData();
                       Clear();
                   } catch (SQLException ex) {
                       Logger.getLogger(FormMain1.class.getName()).log(Level.SEVERE, null, ex);
                   }
          }
    }//GEN-LAST:event_btn_addActionPerformed


    
    
    private void txt_priceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_priceMouseClicked
        
    }//GEN-LAST:event_txt_priceMouseClicked

    private void txt_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_priceActionPerformed
        
    }//GEN-LAST:event_txt_priceActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int row=table.getSelectedRow();
        txt_name.setText((String) table.getValueAt(row, 1));
         boolean check = table.getValueAt(row, 2).equals("Male");
         if(check==true){
             rb_male.setSelected(true);
             rb_female.setSelected(false);
         }else{
             rb_female.setSelected(true);
             rb_male.setSelected(false);
         }
         
         txt_course.setText((String) table.getValueAt(row, 3));
          txt_price.setText((String) table.getValueAt(row, 4));
    }//GEN-LAST:event_tableMouseClicked

    private void btn_add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add1ActionPerformed
        
    }//GEN-LAST:event_btn_add1ActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
              int row = table.getSelectedRow();
              if(row!=-1){
                  try {
                      int id = Integer.parseInt((String) table.getValueAt(row, 0)) ;
                      System.out.println(id);
                      conn  = (Connection) new Config().getConnection();
                      String sql = "DELETE FROM student WHERE `id` = "+id;
                      stmt = (Statement) conn.prepareStatement(sql);
                      stmt.executeUpdate(sql);
                      fetchData();
                      Clear();
                  } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(null,"Select field first");
                  }
                  
              }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
           int row = table.getSelectedRow();
           System.out.println(row);
              if(row!=-1){
                  try {
                      int id = Integer.parseInt((String) table.getValueAt(row, 0)) ;
                       String name = txt_name.getText();
                       String gender= rb_male.isSelected()?"Male":"Female";
                       String course = txt_course.getText();
                    float price = Float.parseFloat(txt_price.getText());
                      conn  = (Connection) new Config().getConnection();
                      String sql = "UPDATE `student` SET `name`='"+name+"',`gender`='"+gender+"',`course`='"+course+"',`price`='"+price+"' WHERE `id` = '"+id+"' ";                            
                      stmt = (Statement) conn.prepareStatement(sql);
                      stmt.executeUpdate(sql);
                      fetchData();
                      Clear();
                  } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(null,"Select field first");
                  }
                  
              }
    }//GEN-LAST:event_btn_updateActionPerformed
        
private void fetchData() {
        rss = null;
        try {
            model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            conn = new Config().getConnection();
            String sql = "SELECT * FROM student";
            stmt = (Statement) conn.prepareStatement(sql);
            rss = stmt.executeQuery(sql);
            while(rss.next()){
                  Object[] row={
                          rss.getString("id"),
                          rss.getString("name"),
                          rss.getString("gender"),
                          rss.getString("course"),
                          rss.getString("price")
                  };
                  model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormMain1.class.getName()).log(Level.SEVERE, null, ex);
        }
     
}

      
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMain1().setVisible(true);
            }
        });
    }
    
    private void Clear(){
            txt_name.setText("");
            txt_course.setText("");
            txt_price.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_add1;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_update;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rb_female;
    private javax.swing.JRadioButton rb_male;
    private javax.swing.JTable table;
    private javax.swing.JTextField txt_course;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_price;
    // End of variables declaration//GEN-END:variables
}
