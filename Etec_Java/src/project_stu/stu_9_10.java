/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project_stu;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class stu_9_10 extends javax.swing.JFrame {

    /**
     * Creates new form stu_9_10
     */
    public stu_9_10() {
        initComponents();
        display();
        
    }
    PreparedStatement ps = null;
    ResultSet re = null;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        course = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtl_name = new javax.swing.JTextField();
        txtf_name = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        delete = new javax.swing.JButton();
        update = new javax.swing.JButton();
        insert = new javax.swing.JButton();
        back = new javax.swing.JButton();
        reset = new javax.swing.JButton();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setForeground(new java.awt.Color(0, 153, 153));
        jPanel1.setDoubleBuffered(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("STUDENTS TIME => 9 : 00 - 10 : 30");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setText("COURSE : ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        jLabel4.setText("PHONE : ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setText("ID : ");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 255, 255));
        jLabel7.setText("LAST NAME : ");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 255, 255));
        jLabel8.setText("FIRST NAME : ");

        course.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N

        txtid.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N

        txtl_name.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N

        txtf_name.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N

        phone.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N

        table.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "F_NAME", "L_NAME", "COURSE", "PHONE"
            }
        ));
        table.setRowHeight(30);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        delete.setBackground(new java.awt.Color(255, 51, 51));
        delete.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(255, 204, 102));
        update.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        insert.setBackground(new java.awt.Color(0, 153, 255));
        insert.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        insert.setForeground(new java.awt.Color(255, 255, 255));
        insert.setText("INSERT ");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(0, 0, 255));
        back.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("GO BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(51, 255, 0));
        reset.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtf_name, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(insert)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(update)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(delete))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(reset))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtf_name)
                                .addGap(2, 2, 2)))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(delete)
                            .addComponent(insert)
                            .addComponent(update))
                        .addGap(49, 49, 49)
                        .addComponent(reset)
                        .addGap(18, 18, 18)
                        .addComponent(back))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
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
    private Connection getconnection(){
        Connection con = null;
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/student_db_1", "root", "");
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(stu_9_10.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "false");
            return null;
        }
    }
    
    
    
    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Main m = new Main();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
       Connection  con = null;
       if(txtf_name.getText().equals("")||txtl_name.getText().equals("")||course.getText().equals("")||phone.equals("")){
           JOptionPane.showMessageDialog(null, "Field can't empty");
           return;
       }else{
           try {
               con = getconnection();
               ps = (PreparedStatement) con.prepareStatement("INSERT INTO `s1`(`id`, `fname`, `lname`, `course`, `phone`) VALUES (null,'"+txtf_name.getText()+"','"+txtl_name.getText()+"','"+course.getText()+"','"+phone.getText()+"')");
               ps.executeUpdate();
               display();
                 txtf_name.setText("");
                 txtl_name.setText("");
                 course.setText("");
                 phone.setText("");
           } catch (SQLException ex) {
               Logger.getLogger(stu_9_10.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
    }//GEN-LAST:event_insertActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
         if(txtf_name.getText().equals("")||txtl_name.getText().equals("")||course.getText().equals("")||phone.equals("")){
           JOptionPane.showMessageDialog(null, "Field can't empty");
           return;
       }else{
             try {
                 Connection con = getconnection();
                  int id = Integer.parseInt(txtid.getText());
                 ps=(PreparedStatement) con.prepareStatement("UPDATE `s1` SET  `fname`='"+txtf_name.getText()+"',`lname`='"+txtf_name.getText()+"',`course`='"+course.getText()+"',`phone`='"+phone.getText()+"' WHERE  id = '"+id+"' ");
                 ps.executeUpdate();
                 JOptionPane.showMessageDialog(null, "updated");
                 txtid.setText("");
                 txtf_name.setText("");
                 txtl_name.setText("");
                 course.setText("");
                 phone.setText("");
             } catch (SQLException ex) {
                 Logger.getLogger(stu_9_10.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
        
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try {
            Connection con = getconnection();
            ps=(PreparedStatement) con.prepareStatement("DELETE FROM `s1` WHERE id=?");
            int id = Integer.parseInt(txtid.getText());
            ps.setInt(1, id);
            ps.executeUpdate();
            display();
                 txtid.setText("");
                 txtf_name.setText("");
                 txtl_name.setText("");
                 course.setText("");
                 phone.setText("");
            JOptionPane.showMessageDialog(null, "Delete succes.!");
        } catch (SQLException ex) {
            Logger.getLogger(stu_9_10.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteActionPerformed

      
   
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
            int index=table.getSelectedRow();
            show_item(index);
    }//GEN-LAST:event_tableMouseClicked

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
                 txtid.setText("");
                 txtf_name.setText("");
                 txtl_name.setText("");
                 course.setText("");
                 phone.setText("");
    }//GEN-LAST:event_resetActionPerformed
    private void show_item(int index){
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        if(index!=-1){     
            txtid.setText(model.getValueAt(index, 0).toString());
            txtf_name.setText(model.getValueAt(index, 1).toString());
            txtl_name.setText(model.getValueAt(index, 2).toString());
            course.setText(model.getValueAt(index, 3).toString());
            phone.setText(model.getValueAt(index, 4).toString());
        }
    }
    private void display(){
          try {
            Connection con = getconnection();
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM `s1` ");
            re=ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            while(re.next()){
                Object[] row={
                    re.getInt("id"),
                    re.getString("fname"),
                    re.getString("lname"),
                    re.getString("course"),
                   re.getString("phone"),  
                };
                model.addRow(row);
            }
            re.close();
        } catch (SQLException ex) {
            Logger.getLogger(stu_9_10.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stu_9_10().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextField course;
    private javax.swing.JButton delete;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField phone;
    private javax.swing.JButton reset;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtf_name;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtl_name;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
