package GUI1;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class Practice3 extends JFrame implements ActionListener{
         JTextField name;
         JPasswordField pass;
         JButton submit;
         public Practice3(){
                  name = new JTextField();
                  name.setBounds(50, 50, 250, 50);
                  name.setFont(new Font("",Font.BOLD,25));
                  this.add(name);
                  
                  pass = new JPasswordField();
                  pass.setBounds(50, 120, 250, 50);
                  pass.setFont(new Font("",Font.BOLD,25));
                  this.add(pass);
                  
                  submit = new JButton("Login");
                  submit.setBounds(50, 190, 250, 50);
                  submit.setFont(new Font("",Font.BOLD,25));
                  submit.addActionListener(this);
                  // submit.setBackground(Color.blue);
                  this.add(submit);
                              
                  this.setSize(700, 500);
                  this.setLocationRelativeTo(null);
                  this.setLayout(null);
                  this.setVisible(true);
         }

    @Override
    public void actionPerformed(ActionEvent e) {
         String txt_name = name.getText();
                           String txt_pass = String.valueOf(pass.getPassword());
                           if(txt_name.equals("") || txt_pass.equals("")){
                                    JOptionPane.showMessageDialog(null, "Field can't empty");
                           }else{
                                    if(txt_name.equals("Taka") && txt_pass.equals("123")){
                                             new Practice2().setVisible(true);
                                             this.dispose();
                                    }else{
                                             JOptionPane.showMessageDialog(null, "wrong username or password");
                                    }
                           }
    }
}
