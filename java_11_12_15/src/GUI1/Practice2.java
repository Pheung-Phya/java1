
package GUI1;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
public class Practice2 extends JFrame implements ActionListener{
        JLabel lb_fullname,lb_gender,lb_country;
        JTextField txt_name;
        JRadioButton rb_male,rb_female;
        JComboBox<String> cb_country;
        String[] country = {"Cambodia","Taiwan","Australia","Hong Kong","Canada"};
        JButton regis;
        ButtonGroup btn_group;
        public Practice2(){
                 lb_fullname = new JLabel("Enter FullName : ");
                 lb_fullname.setFont(new Font("",Font.BOLD,25));
                 lb_fullname.setBounds(20, 20, 280, 50);
                 this.add(lb_fullname);
                 
                 txt_name=new JTextField();
                 txt_name.setFont(new Font("",Font.BOLD,20));
                 txt_name.setBounds(350, 20, 280, 50);
                 this.add(txt_name);
                 
                 lb_gender = new JLabel("Select Gender : ");
                 lb_gender.setFont(new Font("",Font.BOLD,25));
                 lb_gender.setBounds(20, 90, 280, 50);
                 this.add(lb_gender);
                 
                  rb_male = new JRadioButton("Male");
                  rb_male.setFont(new Font("",Font.BOLD,20));
                  rb_male.setBounds(350, 90, 140, 50);
                  rb_male.setSelected(true);
                  this.add(rb_male);
                   rb_female = new JRadioButton("Female");
                  rb_female.setFont(new Font("",Font.BOLD,20));
                  rb_female.setBounds(490, 90, 140, 50);
                  this.add(rb_female);
                  btn_group = new ButtonGroup();
                  btn_group.add(rb_female);
                  btn_group.add(rb_male);
                  
                  lb_country  = new JLabel("Choose Country : ");
                  lb_country.setFont(new Font("",Font.BOLD,25));
                  lb_country.setBounds(20, 160, 280, 50);
                  this.add(lb_country);
                  
                  cb_country  = new JComboBox<>(country);
                  cb_country.setFont(new Font("",Font.BOLD,20));
                  cb_country.setBounds(350, 160, 280, 50);
                  this.add(cb_country);
                  
                  regis = new JButton("Register");
                  regis.setFont(new Font("",Font.BOLD,25));
                  regis.setBounds(200, 500, 300, 50);
                  regis.addActionListener(this);
                  this.add(regis);
                  
                
                this.setSize(700, 700);
                this.setLayout(null);
                this.setLocationRelativeTo(null);
                this.setVisible(true);
        }

    @Override
    public void actionPerformed(ActionEvent e) {
            if(regis==e.getSource()){
                   String name = txt_name.getText();
                   String gender = rb_male.isSelected()?"Male":"Female";
                   String country = (String) cb_country.getSelectedItem();
                   if(name.equals("")){
                             JOptionPane.showMessageDialog(null, "Name can't be empty");
                   }else{
                            String value = "";
                            value += "Your name is : "+name+"\n";
                            value += "Your gender is : "+gender+"\n";
                            value += "Your Country is : "+country+"\n";
                            JOptionPane.showMessageDialog(null, value);
                            this.dispose();
                            new Practice1();
                   }
            }
    }
}
