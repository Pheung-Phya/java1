
package Form_1;
import java.awt.Image;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Etecregister extends javax.swing.JFrame {
    String path;
    public Etecregister() {
        initComponents();
        this.setLocationRelativeTo(null);
        ttdate.setDate(new Date());
        table.getTableHeader().setReorderingAllowed(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ttid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ttphone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ttname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        search_name = new javax.swing.JTextField();
        ttcourse = new javax.swing.JComboBox<>();
        tttime = new javax.swing.JComboBox<>();
        ttplace = new javax.swing.JComboBox<>();
        btnaddphoto = new javax.swing.JButton();
        gm = new javax.swing.JRadioButton();
        gf = new javax.swing.JRadioButton();
        btn_mt = new javax.swing.JCheckBox();
        btn_ss = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnsave = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        ttprice = new javax.swing.JTextField();
        image = new javax.swing.JLabel();
        ttdate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Register");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Old English Text MT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Engineering  of Technology and Electronic Center");

        jLabel3.setFont(new java.awt.Font("Kh Muol", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("មជ្ឍមណ្ឌលវិស្វកម្មបច្ចេកវិទ្យានិងអេឡិចត្រូនិច");

        jLabel4.setFont(new java.awt.Font("Kh Battambang", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("លេខរៀង");

        ttid.setBackground(new java.awt.Color(0, 102, 102));
        ttid.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ttid.setForeground(new java.awt.Color(255, 255, 255));
        ttid.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setFont(new java.awt.Font("Kh Battambang", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("វគ្គសិក្សា");

        ttphone.setBackground(new java.awt.Color(0, 102, 102));
        ttphone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ttphone.setForeground(new java.awt.Color(255, 255, 255));
        ttphone.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel6.setFont(new java.awt.Font("Kh Battambang", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("លេខទូរស័ព្ទ");

        jLabel7.setFont(new java.awt.Font("Kh Battambang", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ឈ្មោះ");

        ttname.setBackground(new java.awt.Color(0, 102, 102));
        ttname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ttname.setForeground(new java.awt.Color(255, 255, 255));
        ttname.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel8.setFont(new java.awt.Font("Kh Battambang", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ភេទ");

        jLabel9.setFont(new java.awt.Font("Kh Battambang", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ថ្ងៃខែឆ្នាំ ចូលរៀន");

        jLabel10.setFont(new java.awt.Font("Kh Battambang", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ម៉ោងសិក្សា");

        jLabel11.setFont(new java.awt.Font("Kh Battambang", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("តម្លៃសិក្សា");

        jLabel12.setFont(new java.awt.Font("Kh Battambang", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("វគ្គសិក្សា");

        jLabel13.setFont(new java.awt.Font("Kh Battambang", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("រូបភាព");

        jLabel14.setFont(new java.awt.Font("Kh Battambang", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("កន្លែងសិក្សា");

        jLabel15.setFont(new java.awt.Font("Kh Battambang", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("ស្វែងរក");

        search_name.setBackground(new java.awt.Color(0, 102, 102));
        search_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        search_name.setForeground(new java.awt.Color(255, 255, 255));
        search_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_nameActionPerformed(evt);
            }
        });

        ttcourse.setBackground(new java.awt.Color(0, 102, 102));
        ttcourse.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ttcourse.setForeground(new java.awt.Color(255, 255, 255));
        ttcourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C/C++", "Python", "Java", "Web Front-End", "Web Back-End", "Mobile App", "System Network" }));

        tttime.setBackground(new java.awt.Color(0, 102, 102));
        tttime.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tttime.setForeground(new java.awt.Color(255, 255, 255));
        tttime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8:00-9:20", "9:45-11:00", "11:15-12:20", "12:30-1:45", "2:00-3:20" }));

        ttplace.setBackground(new java.awt.Color(0, 102, 102));
        ttplace.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ttplace.setForeground(new java.awt.Color(255, 255, 255));
        ttplace.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Etec1", "Etec2", "Etec3" }));

        btnaddphoto.setBackground(new java.awt.Color(153, 102, 255));
        btnaddphoto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnaddphoto.setForeground(new java.awt.Color(204, 255, 255));
        btnaddphoto.setText("Add Photo");
        btnaddphoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddphotoActionPerformed(evt);
            }
        });

        buttonGroup1.add(gm);
        gm.setFont(new java.awt.Font("Kh Battambang", 0, 14)); // NOI18N
        gm.setForeground(new java.awt.Color(255, 255, 255));
        gm.setSelected(true);
        gm.setText("ប្រុស");

        buttonGroup1.add(gf);
        gf.setFont(new java.awt.Font("Kh Battambang", 0, 14)); // NOI18N
        gf.setForeground(new java.awt.Color(255, 255, 255));
        gf.setText("ស្រី");

        btn_mt.setFont(new java.awt.Font("Kh Battambang", 0, 14)); // NOI18N
        btn_mt.setForeground(new java.awt.Color(255, 255, 255));
        btn_mt.setSelected(true);
        btn_mt.setText("ចន្ទ-ព្រហ");
        btn_mt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mtActionPerformed(evt);
            }
        });

        btn_ss.setFont(new java.awt.Font("Kh Battambang", 0, 14)); // NOI18N
        btn_ss.setForeground(new java.awt.Color(255, 255, 255));
        btn_ss.setText("សុក្រ-សៅរ៍");
        btn_ss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ssActionPerformed(evt);
            }
        });

        table.setBackground(new java.awt.Color(153, 153, 255));
        table.setForeground(new java.awt.Color(0, 0, 204));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "លេខរៀង", "ឈ្មោះ", "ភេទ", "ថ្ងៃខែចូលរៀន", "វគ្គសិក្សា", "ម៉ោងសិក្សា", "តម្លៃសិក្សា", "ថ្ងៃសិក្សា", "លេខទូរស័ព្ទ", "រូបភាព", "កន្លែងសិក្សា"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        btnsave.setBackground(new java.awt.Color(153, 153, 153));
        btnsave.setFont(new java.awt.Font("Kh Battambang", 0, 14)); // NOI18N
        btnsave.setForeground(new java.awt.Color(255, 255, 255));
        btnsave.setText("រក្សាទុក");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btnupdate.setBackground(new java.awt.Color(153, 153, 255));
        btnupdate.setFont(new java.awt.Font("Kh Battambang", 0, 14)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(255, 255, 255));
        btnupdate.setText("កែតម្រូវ");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btnclear.setBackground(new java.awt.Color(0, 204, 204));
        btnclear.setFont(new java.awt.Font("Kh Battambang", 0, 14)); // NOI18N
        btnclear.setForeground(new java.awt.Color(255, 255, 255));
        btnclear.setText("សម្អាត");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        btndelete.setBackground(new java.awt.Color(204, 0, 0));
        btndelete.setFont(new java.awt.Font("Kh Battambang", 0, 14)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setText("លុប");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnexit.setFont(new java.awt.Font("Kh Battambang", 0, 14)); // NOI18N
        btnexit.setText("ចាកចេញ");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        ttprice.setBackground(new java.awt.Color(0, 102, 102));
        ttprice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ttprice.setForeground(new java.awt.Color(255, 255, 255));
        ttprice.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        image.setBackground(new java.awt.Color(51, 204, 255));
        image.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(gm)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(gf))
                                    .addComponent(ttid)
                                    .addComponent(ttname)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ttdate, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)))
                        .addGap(101, 101, 101)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ttprice)
                                    .addComponent(tttime, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ttcourse, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(39, 39, 39)
                                .addComponent(btn_ss)
                                .addGap(18, 18, 18)
                                .addComponent(btn_mt)))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ttplace, 0, 164, Short.MAX_VALUE)
                                    .addComponent(search_name)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ttphone)
                                    .addComponent(btnaddphoto, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                    .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel2)
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(275, 275, 275))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(btnsave, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                        .addGap(115, 115, 115)
                        .addComponent(btnupdate, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                        .addGap(122, 122, 122)
                        .addComponent(btnclear, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                        .addGap(121, 121, 121)
                        .addComponent(btndelete, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                        .addGap(103, 103, 103)
                        .addComponent(btnexit, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                        .addGap(122, 122, 122))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                                        .addGap(27, 27, 27)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(ttname, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(ttid))
                                        .addGap(38, 38, 38)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tttime)
                                            .addComponent(jLabel13)
                                            .addComponent(btnaddphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ttcourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6)
                                        .addComponent(ttphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(37, 37, 37)
                                .addComponent(gf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(28, 28, 28)
                                .addComponent(ttdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(ttprice, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                            .addComponent(ttplace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14)))
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(gm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(btn_ss, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(btn_mt, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9)))))
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 256, Short.MAX_VALUE)
                        .addComponent(search_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnupdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnclear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btndelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnexit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42))
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

    private void btn_mtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mtActionPerformed
        btn_ss.setSelected(false);
    }//GEN-LAST:event_btn_mtActionPerformed

    private void btn_ssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ssActionPerformed
        btn_mt.setSelected(false);
    }//GEN-LAST:event_btn_ssActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        if(JOptionPane.showConfirmDialog(null, "ចង់ចាកចេញមែន?","Exit",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
            System.exit(1);
        }
    }//GEN-LAST:event_btnexitActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        int id = Integer.parseInt(ttid.getText());
         String name = ttname.getText();
         String gender = gm.isSelected()?"Male":"Female";
         SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String date = dateFormat.format(ttdate.getDate());
         String course = (String) ttcourse.getSelectedItem();
         String time = (String) tttime.getSelectedItem();
         double price = Double.parseDouble( ttprice.getText());
         String day = btn_ss.isSelected()?"Sat-Son":"Mon-Thur";
         String phone = ttphone.getText();
         String phtot = path;
         
         ModelStudent.list.add(new ModelStudent(id, name, gender, time, phone, course, day, phone, phtot, date, price));
         Collections.sort(ModelStudent.list, Comparator.comparing(ModelStudent::getId));
         for(int i=0;i<ModelStudent.list.size();i++){
                 Object[] row={
                          ModelStudent.list.get(i).getId(),
                          ModelStudent.list.get(i).getName(),
                         ModelStudent.list.get(i).getGender(),
                          ModelStudent.list.get(i).getDate(),
                          ModelStudent.list.get(i).getCours(),
                          ModelStudent.list.get(i).getTime(),
                          ModelStudent.list.get(i).getPrice(),
                          ModelStudent.list.get(i).getDay(),
                         ModelStudent.list.get(i).getPhone(),
                          ModelStudent.list.get(i).getPhoto(),
                          ModelStudent.list.get(i).getPlace(),
                          
                 }    ; 
                 model.addRow(row);
        }
         ClearText();
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnaddphotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddphotoActionPerformed
 JFileChooser file = new JFileChooser();
    file.setCurrentDirectory(new File(System.getProperty("user.home")));
    int result = file.showSaveDialog(null);  // Changed to showOpenDialog
    if(result == JFileChooser.APPROVE_OPTION) {
        File selectedFile = file.getSelectedFile();
         path = selectedFile.getAbsolutePath();
        ImageIcon img = new ImageIcon(path);
        Image img1 = img.getImage();
        Image scaleImage = img1.getScaledInstance(image.getWidth(), image.getHeight(), Image.SCALE_SMOOTH);
        image.setIcon(new ImageIcon(scaleImage));        
    } else {
        System.out.println("No File Selected!");
    }
    // Nimbus Look and Feel should be set at the beginning of the program, if needed
    
    }//GEN-LAST:event_btnaddphotoActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        ClearText();
    }//GEN-LAST:event_btnclearActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        DefaultTableModel model = (DefaultTableModel) table.getModel();
         int row= table.getSelectedRow();
         if(row !=-1){
            try {
                ttid.setText(model.getValueAt(row, 0).toString());
                ttname.setText(model.getValueAt(row, 1).toString());
                boolean gender= model.getValueAt(row, 2).toString().equals("Male")?true:false;
                 if(gender){
                           gm.setSelected(true);
                 }else{
                           gf.setSelected(true);
                 }
                String date = model.getValueAt(row, 3).toString();
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                Date d = sdf.parse(date);
                ttdate.setDate(d);
                 ttcourse.setSelectedItem(model.getValueAt(row, 4).toString());
                 tttime.setSelectedItem(model.getValueAt(row, 5).toString());
                 ttprice.setText(model.getValueAt(row, 6).toString());
                 boolean day = model.getValueAt(row, 7).toString().equals("Sat-Son")?true:false;
                 if(day){
                          btn_ss.setSelected(true);
                 }else{
                          btn_mt.setSelected(true);
                 }
                 ttphone.setText(model.getValueAt(row, 8).toString());
                 String picture = model.getValueAt(row, 9).toString();
                  ImageIcon img = new ImageIcon(picture);
                    Image img1 = img.getImage();
                    Image scaleImage = img1.getScaledInstance(image.getWidth(), image.getHeight(), Image.SCALE_SMOOTH);
                    image.setIcon(new ImageIcon(scaleImage)); 
                 ttplace.setSelectedItem(model.getValueAt(row, 10).toString());
            } catch (ParseException ex) {
                Logger.getLogger(Etecregister.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
    }//GEN-LAST:event_tableMouseClicked

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        int index = table.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        if(index!=-1){
                 ModelStudent.list.remove(index);
                 System.out.println(ModelStudent.list.size());
                 model.removeRow(index);
                 ClearText();
        }
        
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int index = table.getSelectedRow();
        if(index!=-1){
                 int id = Integer.parseInt(ttid.getText());
                String name = ttname.getText();
                String gender = gm.isSelected()?"Male":"Female";
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
               String date = dateFormat.format(ttdate.getDate());
                String course = (String) ttcourse.getSelectedItem();
                String time = (String) tttime.getSelectedItem();
                double price = Double.parseDouble( ttprice.getText());
                String day = btn_ss.isSelected()?"Sat-Son":"Mon-Thur";
                String phone = ttphone.getText();
                String phtot = path;
                ModelStudent.list.set(index,new ModelStudent(id, name, gender, time, phone, course, day, phone, phtot, date, price) );
                  model.setValueAt(ModelStudent.list.get(index).getId(), index, 0);
        model.setValueAt(ModelStudent.list.get(index).getName(), index, 1);
        model.setValueAt(ModelStudent.list.get(index).getGender(), index, 2);
        model.setValueAt(ModelStudent.list.get(index).getDate(), index, 3);
        model.setValueAt(ModelStudent.list.get(index).getCours(), index, 4);
        model.setValueAt(ModelStudent.list.get(index).getTime(), index, 5);
        model.setValueAt(ModelStudent.list.get(index).getPrice(), index, 6);
        model.setValueAt(ModelStudent.list.get(index).getDay(), index, 7);
        model.setValueAt(ModelStudent.list.get(index).getPhone(), index, 8);
        model.setValueAt(ModelStudent.list.get(index).getPhoto(), index, 9);
                ClearText();
                
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void search_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_nameActionPerformed
         TableRowSorter<DefaultTableModel> rowSorter;
         DefaultTableModel model = (DefaultTableModel) table.getModel();
        rowSorter = new TableRowSorter<>(model);
        table.setRowSorter(rowSorter);       
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
            java.util.logging.Logger.getLogger(Etecregister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Etecregister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Etecregister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Etecregister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        try {
        UIManager.setLookAndFeel(new NimbusLookAndFeel());
    } catch (UnsupportedLookAndFeelException ex) {
        Logger.getLogger(Etecregister.class.getName()).log(Level.SEVERE, null, ex);
    }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Etecregister().setVisible(true);
            }
        });
    }
    private void ClearText(){
         ttid.setText("");
         ttname.setText("");
         ttphone.setText("");
         ttprice.setText("");
         ttphone.setText("");
         image.setText("");      
         Date currentDate = new Date();  
        ttdate.setDate(currentDate);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox btn_mt;
    private javax.swing.JCheckBox btn_ss;
    private javax.swing.JButton btnaddphoto;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnupdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton gf;
    private javax.swing.JRadioButton gm;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField search_name;
    private javax.swing.JTable table;
    private javax.swing.JComboBox<String> ttcourse;
    private com.toedter.calendar.JDateChooser ttdate;
    private javax.swing.JTextField ttid;
    private javax.swing.JTextField ttname;
    private javax.swing.JTextField ttphone;
    private javax.swing.JComboBox<String> ttplace;
    private javax.swing.JTextField ttprice;
    private javax.swing.JComboBox<String> tttime;
    // End of variables declaration//GEN-END:variables
}
