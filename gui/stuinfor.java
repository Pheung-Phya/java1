
package gui;

import static gui.List_stuinfor.list_stu;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class stuinfor extends javax.swing.JFrame {


    

    public stuinfor() {
        initComponents(); // កញ្ចប់កូដ
        this.setLocationRelativeTo(null); // to center
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        stable = new javax.swing.JTable();
        sid = new javax.swing.JLabel();
        tid = new javax.swing.JTextField();
        sname = new javax.swing.JLabel();
        tname = new javax.swing.JTextField();
        sgender = new javax.swing.JLabel();
        tscore = new javax.swing.JTextField();
        sscore = new javax.swing.JLabel();
        gmale = new javax.swing.JRadioButton();
        gfemale = new javax.swing.JRadioButton();
        btncancel = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Informatoin");
        setBackground(new java.awt.Color(204, 204, 204));

        stable.setBackground(new java.awt.Color(204, 204, 204));
        stable.setForeground(new java.awt.Color(255, 51, 51));
        stable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Stu-Id", "Name", "Gender", "Score"
            }
        ));
        stable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(stable);

        sid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sid.setForeground(java.awt.Color.black);
        sid.setText("Stu-ID");

        tid.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tid.setForeground(new java.awt.Color(0, 0, 0));
        tid.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        sname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sname.setForeground(java.awt.Color.black);
        sname.setText("Name");

        tname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tname.setForeground(new java.awt.Color(0, 0, 0));
        tname.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        sgender.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sgender.setForeground(java.awt.Color.black);
        sgender.setText("Gender");

        tscore.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tscore.setForeground(new java.awt.Color(0, 0, 0));
        tscore.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        sscore.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sscore.setForeground(java.awt.Color.black);
        sscore.setText("Score");

        buttonGroup1.add(gmale);
        gmale.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        gmale.setForeground(java.awt.Color.black);
        gmale.setSelected(true);
        gmale.setText("Male");
        gmale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gmaleActionPerformed(evt);
            }
        });

        buttonGroup1.add(gfemale);
        gfemale.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        gfemale.setForeground(java.awt.Color.black);
        gfemale.setText("Female");
        gfemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gfemaleActionPerformed(evt);
            }
        });

        btncancel.setBackground(new java.awt.Color(255, 0, 0));
        btncancel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btncancel.setForeground(java.awt.Color.white);
        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });

        btnadd.setBackground(new java.awt.Color(0, 153, 153));
        btnadd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnadd.setForeground(java.awt.Color.black);
        btnadd.setText("Add Data");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setFont(new java.awt.Font("Khmer Samady KS", 1, 24)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("STUDENT    INFORMATION");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Documents\\NetBeansProjects\\nle.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(81, 81, 81)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(479, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 29, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnadd)
                        .addGap(152, 152, 152)
                        .addComponent(btncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(gfemale)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(sname, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38)
                            .addComponent(tname, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(sgender, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38)
                            .addComponent(gmale))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(sid, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38)
                            .addComponent(tid, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sscore, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(tscore, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sid, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sgender, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gmale)
                            .addComponent(gfemale))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tscore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sscore, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnadd)
                    .addComponent(btncancel))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gfemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gfemaleActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_gfemaleActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        // TODO add your handling code here:
        tid.setText("");
        tname.setText("");
        tscore.setText("");
                
    }//GEN-LAST:event_btncancelActionPerformed

    private void gmaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gmaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gmaleActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // Adding data
        
        DefaultTableModel model= (DefaultTableModel) stable.getModel();
        model.setRowCount(0);// ដាក់កុំឲ្យពេលបញ្ចូលតម្លៃហើយបញ្ចូលប្ដងទៀតវាចម្លងចូលទៀត
        
        int id=Integer.parseInt(tid.getText());
        String name=tname.getText();
        String male=gmale.isSelected() ? "Male" : "Female"; // choose male for accept data
        float score=Float.parseFloat(tscore.getText()); //convert string to float score
        // call class have arraylsit
        List_stuinfor stu= new List_stuinfor(id, name, male, score); //add data to list
        List_stuinfor.list_stu.add(stu);
       
        for(int i=0;i<List_stuinfor.list_stu.size();i++){
           Object[] row= {
            List_stuinfor.list_stu.get(i).getId(),
            List_stuinfor.list_stu.get(i).getName(),
            List_stuinfor.list_stu.get(i).getGender(),
            List_stuinfor.list_stu.get(i).getScore(),   
               
           };
           model.addRow(row); // view ទាញទិន្នន័យបង្ហាញ
        }
        tid.setText("");
        tname.setText("");
        tscore.setText("");
    }//GEN-LAST:event_btnaddActionPerformed

    private void stableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stableMouseClicked
        DefaultTableModel model= (DefaultTableModel) stable.getModel();
        int row=stable.getSelectedRow();
        if(row!=-1){
            tid.setText(model.getValueAt(row, 0).toString());
            tname.setText(model.getValueAt(row, 1).toString());
            boolean gender="Male".equalsIgnoreCase(model.getValueAt(row, 2).toString());
            if(gender){
                gmale.setSelected(true);
            }else{
                gfemale.setSelected(true);
            }
            tscore.setText(model.getValueAt(row, 3).toString());
        }
        
    }//GEN-LAST:event_stableMouseClicked

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stuinfor().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btncancel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton gfemale;
    private javax.swing.JRadioButton gmale;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel sgender;
    private javax.swing.JLabel sid;
    private javax.swing.JLabel sname;
    private javax.swing.JLabel sscore;
    private javax.swing.JTable stable;
    private javax.swing.JTextField tid;
    private javax.swing.JTextField tname;
    private javax.swing.JTextField tscore;
    // End of variables declaration//GEN-END:variables
}
