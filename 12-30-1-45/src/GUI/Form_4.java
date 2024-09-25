
package GUI;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Form_4 extends JFrame implements ActionListener{
        JLabel lb;
        JButton btn;
        JComboBox  cb;
        String fruits[]={"apple","pineaple","grape","banana","peach"};
        Form_4(){
                  cb=new JComboBox(fruits);
                  cb.setBounds(100, 100, 200, 60);
                  cb.setFont(new Font("",Font.BOLD,30));
                  btn = new JButton("Show");
                  btn.setBounds(310, 100, 200, 60);
                  btn.addActionListener(this);
                  lb = new JLabel("You label selected is : "+cb.getSelectedItem());
                  lb.setBounds(100, 360, 500, 60);
                  lb.setFont(new Font("",Font.BOLD,30));
                  
                  
                  this.add(lb);
                 this.add(btn);
                 this.add(cb);
                this.setSize(700, 700);
                this.setLayout(null);
                this.setLocationRelativeTo(null);
                this.setVisible(true);
        }
        
    public static void main(String[] args) {
        new Form_4();
    }   

    @Override
    public void actionPerformed(ActionEvent e) {
        String item;
        item = (String) cb.getItemAt(cb.getSelectedIndex());
         lb.setText("You label selected is : "+item);
    }
}
