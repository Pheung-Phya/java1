package Project_end;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class FormGUI extends javax.swing.JFrame {

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_pass = new javax.swing.JPasswordField();
        btn_login = new Form_1.MyButton();
        btn_signup = new Form_1.MyButton();
        profile = new javax.swing.JLabel();
        btn_profile = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel3.setBackground(new java.awt.Color(0, 153, 153));
        jLabel3.setFont(new java.awt.Font("Rockwell Condensed", 2, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("REGISTER LOGIN");
        jLabel3.setOpaque(true);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Enter Name : ");

        txt_email.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N

        txt_name.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Enter Email : ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Enter Password : ");

        btn_login.setBackground(new java.awt.Color(0, 153, 255));
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("Login");
        btn_login.setFont(new java.awt.Font("Segoe UI Semibold", 2, 18)); // NOI18N
        btn_login.setRadius(20);
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        btn_signup.setBackground(new java.awt.Color(0, 204, 204));
        btn_signup.setForeground(new java.awt.Color(255, 255, 255));
        btn_signup.setText("Signup");
        btn_signup.setFont(new java.awt.Font("Segoe UI Semibold", 2, 18)); // NOI18N
        btn_signup.setRadius(20);
        btn_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_pass)
                                    .addComponent(txt_email)
                                    .addComponent(btn_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_signup, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)))))
                    .addComponent(jLabel6))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(txt_pass))
                .addGap(37, 37, 37)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 810, 560));

        profile.setBackground(new java.awt.Color(204, 255, 255));
        profile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profile.setText("Profile");
        profile.setOpaque(true);
        getContentPane().add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 140, 180));

        btn_profile.setBackground(new java.awt.Color(102, 153, 255));
        btn_profile.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btn_profile.setText("Image");
        btn_profile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 140, 30));

        jLabel1.setBackground(new java.awt.Color(102, 204, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\30202-1-coffee-logo-file_400x400.png")); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel1.setIconTextGap(1);
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1139, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
  public FormGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    Connection con = null;
    Statement state=null;
    ResultSet result = null;
    Controller controller=null;
    DatabaseConfig config = new DatabaseConfig();
    
    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
         if(txt_name.getText().equals("")||txt_email.getText().equals("")||String.valueOf(txt_pass.getPassword()).equals("")){
                   JOptionPane.showMessageDialog(null,"Field can't be null");
                   return;
         }
         boolean find=false;
         try {
                       String name = txt_name.getText();
                       String email = txt_email.getText();
                       String pass = String.valueOf(txt_pass.getPassword());
                       con = config.connecthzhz();
                       String sql = "SELECT * FROM loginform "+"WHERE `username`='"+name+"' AND `useremail` ='"+email+"' AND `password`='"+pass+"' ";
                       state=con.prepareStatement(sql);
                       result = state.executeQuery(sql);
                       while(result.next()){
                           String getName = result.getString("username");
                           String getEmail = result.getString("useremail");
                           String getPass = result.getString("password");
                           if(getName.equals(name)&&getEmail.equals(email) && getPass.equals(pass)){                                 
                               this.dispose();
                               find=true;
                               new FormFood(email).setVisible(true);
                           }
                       }
                       
                       if(find==false){
                           JOptionPane.showMessageDialog(null, "Invalid username , useremail or password");
                       }
                          
                   } catch (SQLException ex) {
                           JOptionPane.showMessageDialog(null, ex.getMessage());
                   }
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signupActionPerformed
          if(txt_name.getText().equals("")||txt_email.getText().equals("")||String.valueOf(txt_pass.getPassword()).equals("")){
                   JOptionPane.showMessageDialog(null,"Field can't be null");
                   return;
          }
        try {
                       String name = txt_name.getText();
                       String email = txt_email.getText();
                       String pass = String.valueOf(txt_pass.getPassword());
                       con = config.connecthzhz();
                       String sql = "INSERT INTO LOGINFORM (`username`,`useremail`,`password`) "+
                               "VALUES ('"+name+"','"+email+"','"+pass+"')";
                       state = con.prepareStatement(sql);
                       int success = state.executeUpdate(sql);
                       System.out.println(success);
                       if(success!=0){
                               this.dispose();
                               new FormFood(email).setVisible(true);
                       }
                   } catch (SQLException ex) {
                           JOptionPane.showMessageDialog(null, "Email aready has account");
                   }
    }//GEN-LAST:event_btn_signupActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new FormGUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Form_1.MyButton btn_login;
    private javax.swing.JButton btn_profile;
    private Form_1.MyButton btn_signup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JLabel profile;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_name;
    private javax.swing.JPasswordField txt_pass;
    // End of variables declaration//GEN-END:variables
}
