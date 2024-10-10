
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.DropMode.INSERT;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import javax.swing.AbstractAction;
import javax.swing.KeyStroke;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Java_mysql extends javax.swing.JFrame {

    /**
     * Creates new form Java_mysql
     */
    public Java_mysql() {
        initComponents();
        fetchData();
        FixedHeader();  
        Enter();
    }
    
    public Connection getconnection(){
        Connection con = null;
       
        try {
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/student_db_1","root","");
            
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(Java_mysql.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "not connection");
            return null;
        }
        
    }
    
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        Data_Show = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Addres = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        IDtxt = new javax.swing.JTextField();
        txtPostCode = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtAddres = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255), 8));

        Data_Show.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 8));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Firstname");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Student ID");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Post Code");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Lastname");

        Addres.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Addres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Addres.setText("Address");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Telephone");

        IDtxt.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        IDtxt.setText("Auto Complete");
        IDtxt.setEnabled(false);

        txtPostCode.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N

        txtPhone.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N

        txtAddres.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N

        txtLastName.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N

        txtFirstName.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "FirstName", "LastName", "Address", "Post Code", "Telephone"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout Data_ShowLayout = new javax.swing.GroupLayout(Data_Show);
        Data_Show.setLayout(Data_ShowLayout);
        Data_ShowLayout.setHorizontalGroup(
            Data_ShowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Data_ShowLayout.createSequentialGroup()
                .addGroup(Data_ShowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Data_ShowLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Data_ShowLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(IDtxt))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Data_ShowLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(txtFirstName))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Data_ShowLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(txtLastName))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Data_ShowLayout.createSequentialGroup()
                        .addComponent(Addres, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(txtAddres))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Data_ShowLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(txtPostCode))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Data_ShowLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(txtPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );
        Data_ShowLayout.setVerticalGroup(
            Data_ShowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Data_ShowLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(Data_ShowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Data_ShowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Data_ShowLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(Data_ShowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Data_ShowLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(Data_ShowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Addres, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddres, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Data_ShowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPostCode, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Data_ShowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 8));

        btnExit.setBackground(java.awt.Color.lightGray);
        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnReset.setBackground(java.awt.Color.lightGray);
        btnReset.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnPrint.setBackground(java.awt.Color.lightGray);
        btnPrint.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        btnDelete.setBackground(java.awt.Color.lightGray);
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnAdd.setBackground(java.awt.Color.lightGray);
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAdd.setText("Add New Data");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(java.awt.Color.lightGray);
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSearch.setBackground(java.awt.Color.lightGray);
        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd)
                    .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("MySQL Connection");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Data_Show, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(Data_Show, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel3);

        setSize(new java.awt.Dimension(1055, 851));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private JFrame frame;
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        frame = new JFrame();
        if(JOptionPane.showConfirmDialog(frame, "Comfirm if you want to exit","MySQL Connector",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){        
            System.exit(0);
        } 
    }//GEN-LAST:event_btnExitActionPerformed

    private void Clear(){
        IDtxt.setText("");
        txtFirstName.setText("");
        txtLastName.setText("");
        txtAddres.setText("");
        txtPostCode.setText("");
        txtPhone.setText("");
        IDtxt.setText("");
    }
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        Clear();
        btnAdd.setEnabled(true);
    }//GEN-LAST:event_btnResetActionPerformed
private void fetchData() {
    try {
        Connection con = getconnection();
        PreparedStatement pre = (PreparedStatement) con.prepareStatement("SELECT * FROM student_1");
        ResultSet rs = (ResultSet) pre.executeQuery();

        // Clear existing table data
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);

        // Populate table with fetched data
        while (rs.next()) {
            Object[] row = {
                    rs.getInt("id"),
                    rs.getString("first_name"),
                    rs.getString("last_name"),
                    rs.getString("address"),
                    rs.getString("post_code"),
                    rs.getString("telephone")
            };
            model.addRow(row);
        }
    } catch (SQLException ex) {
        Logger.getLogger(Java_mysql.class.getName()).log(Level.SEVERE, null, ex);
    }
}

    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
  
           if(IDtxt.getText().isEmpty()  || 
           txtFirstName.getText().isEmpty() ||
           txtLastName.getText().isEmpty() ||
           txtAddres.getText().isEmpty() ||
           txtPostCode.getText().isEmpty() ||
           txtPhone.getText().isEmpty()
           ){
               JOptionPane.showMessageDialog(null,"Field is Empty...!");
               System.out.println("textbos is empty");
              return;
        }
          try {             
              Connection con = getconnection();
              PreparedStatement pre = (PreparedStatement) con.prepareStatement("INSERT INTO `student_1`(`id`, `student_id`, `first_name`, `last_name`, `address`, `post_code`, `telephone`) VALUES (null,'"+IDtxt.getText()+"','"+txtFirstName.getText()+"','"+txtLastName.getText()+"','"+txtAddres.getText()+"','"+txtPostCode.getText()+"','"+txtPhone.getText()+"')");
              
              pre.executeUpdate();
          } catch (SQLException ex) {
              Logger.getLogger(Java_mysql.class.getName()).log(Level.SEVERE, null, ex);
          }
        
      
    }//GEN-LAST:event_btnAddActionPerformed

    
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked

            int rowIndex = table.getSelectedRow();
             
            System.out.println(rowIndex);
        if (rowIndex != -1) {
        btnAdd.setEnabled(false);
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        IDtxt.setText(model.getValueAt(rowIndex, 0).toString());
          
            txtFirstName.setText(model.getValueAt(rowIndex, 1).toString());
            txtLastName.setText(model.getValueAt(rowIndex, 2).toString());
            txtAddres.setText(model.getValueAt(rowIndex, 3).toString());
            txtPostCode.setText(model.getValueAt(rowIndex, 4).toString());
            txtPhone.setText(model.getValueAt(rowIndex, 5).toString());
        }else{
            btnAdd.setEnabled(true);
        }
           
    }//GEN-LAST:event_tableMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Delete", "Do you want to delete this person ?", JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
             try {
                    Connection con = getconnection();
                    PreparedStatement pre = (PreparedStatement) con.prepareStatement("DELETE FROM `student_1` WHERE id = ?");
                    int id = Integer.parseInt(IDtxt.getText());
                    pre.setInt(1, id);
                    pre.executeUpdate();
                    fetchData(); // Refresh the table data after deletion
                    Clear();
                } catch (SQLException ex) {
                    Logger.getLogger(Java_mysql.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (IDtxt.getText().isEmpty() ||
            txtFirstName.getText().isEmpty() ||
            txtLastName.getText().isEmpty() ||
            txtAddres.getText().isEmpty() ||
            txtPostCode.getText().isEmpty() ||
            txtPhone.getText().isEmpty()
    ) {
        JOptionPane.showMessageDialog(null, "Field is Empty...!");
        System.out.println("textbox is empty");
        return;
    }
    try {
        Connection con = getconnection();
        PreparedStatement pre = (PreparedStatement) con.prepareStatement("UPDATE `student_1` SET student_id = ?, first_name = ?, last_name = ?, address = ?, post_code = ?, telephone = ? WHERE id = ?");
        pre.setString(1, IDtxt.getText());
        pre.setString(2, txtFirstName.getText());
        pre.setString(3, txtLastName.getText());
        pre.setString(4, txtAddres.getText());
        pre.setString(5, txtPostCode.getText());
        pre.setString(6, txtPhone.getText());
        pre.setInt(7, Integer.parseInt(IDtxt.getText()));
        pre.executeUpdate();
        fetchData(); // Refresh the table data after update
        Clear();
        btnAdd.setEnabled(true);
    } catch (SQLException ex) {
        Logger.getLogger(Java_mysql.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        fetchData();
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(Java_mysql.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Java_mysql.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Java_mysql.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Java_mysql.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Java_mysql().setVisible(true);
               
            }
        });
    }
     private void FixedHeader(){
         table.getTableHeader().setReorderingAllowed(false);
    } 
         private void Enter(){
        txtFirstName.getInputMap().put(KeyStroke.getKeyStroke("ENTER"), "MoveFocus");
        txtFirstName.getActionMap().put("MoveFocus", new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e) {
                txtLastName.requestFocusInWindow();
            }          
        });
        txtLastName.getInputMap().put(KeyStroke.getKeyStroke("ENTER"), "MoveFocus");
        txtLastName.getActionMap().put("MoveFocus", new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e) {
                txtAddres.requestFocusInWindow();
            }          
        });
        txtAddres.getInputMap().put(KeyStroke.getKeyStroke("ENTER"), "MoveFocus");
        txtAddres.getActionMap().put("MoveFocus", new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPostCode.requestFocusInWindow();
            }          
        });
        txtPostCode.getInputMap().put(KeyStroke.getKeyStroke("ENTER"), "MoveFocus");
        txtPostCode.getActionMap().put("MoveFocus", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 txtPhone.requestFocusInWindow();
            }
        });
        txtPhone.getInputMap().put(KeyStroke.getKeyStroke("ENTER"), "MoveFocus");
        txtPhone.getActionMap().put("MoveFocus", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 txtFirstName.requestFocusInWindow();
            }
        });
         }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Addres;
    private javax.swing.JPanel Data_Show;
    private javax.swing.JTextField IDtxt;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtAddres;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtPostCode;
    // End of variables declaration//GEN-END:variables

    
}
