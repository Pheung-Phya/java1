package GUI1;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class Practice1 extends JFrame implements ActionListener{
         JLabel tittle,lname,lpass,lcountry;
         JTextField name;
         JPasswordField pass;
         JButton submit,clear;
         JComboBox<String> combo;
         String[] country = {"Cambodia","Canada","ThaiLand","Laos","USA"};
         public Practice1(){
                  tittle = new JLabel("Register Window Form");
                  tittle.setBounds(0, 10, 700, 50);
                  tittle.setFont(new Font("",Font.BOLD,25));
                  tittle.setHorizontalAlignment((int) CENTER_ALIGNMENT);
                  tittle.setForeground(Color.BLUE);
                  this.add(tittle);
                  
                  lname = new JLabel("Enter Name : ");
                  lname.setBounds(20, 80, 280, 50);
                  lname.setFont(new Font("",Font.BOLD,20));
                  this.add(lname);
                  
                  name = new JTextField();
                  name.setBounds(350, 80, 280, 50);
                  name.setFont(new Font("",Font.BOLD,20));
                  this.add(name);
                  
                   lpass = new JLabel("Enter Password : ");
                  lpass.setBounds(20, 150, 280, 50);
                  lpass.setFont(new Font("",Font.BOLD,20));
                  this.add(lpass);
                  
                  pass = new JPasswordField();
                  pass.setBounds(350, 150, 280, 50);
                  pass.setFont(new Font("",Font.BOLD,20));
                  this.add(pass);
                  
                  lcountry = new JLabel("Country : ");
                  lcountry.setBounds(20, 220, 280, 50);
                  lcountry.setFont(new Font("",Font.BOLD,20));
                  this.add(lcountry);
                  
                  combo = new JComboBox<>(country);
                  combo.setBounds(350, 220, 280, 50);
                  combo.setFont(new Font("",Font.BOLD,20));
                  this.add(combo);
                  
                  clear = new JButton("Clear ");
                  clear.setBounds(20, 350, 280, 50);
                  clear.setFont(new Font("",Font.BOLD,20));
                  clear.addActionListener(this);
                  this.add(clear);
                  
                  submit = new JButton("Submit");
                  submit.setBounds(350, 350, 280, 50);
                  submit.setFont(new Font("",Font.BOLD,20));
                  submit.addActionListener(this);
                  this.add(submit);
                  
                  this.setSize(700, 700);
                  this.setLayout(null);
                  this.setLocationRelativeTo(null);
                  this.setVisible(true);
         }

    @Override
    public void actionPerformed(ActionEvent e) {
         if(submit==e.getSource()){
                  String password = String.valueOf(pass.getPassword());
                  if(name.getText().equals("")||password.equals("")){
                           JOptionPane.showMessageDialog(null, "Data can't be empty");
                  }else{
                           JOptionPane.showMessageDialog(null, "Data save success@");
                           this.dispose();
                           new Practice2();
                  }
         }
         
         if(clear ==e.getSource()){
                  name.setText("");
                  pass.setText("");
                  combo.setSelectedItem("Cambodia");
         }
    }
}
