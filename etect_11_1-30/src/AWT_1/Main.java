
package AWT_1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Main extends JFrame implements ActionListener{
    JButton b1,b2,b3,b4;
    JLabel la1,la2,la3;
    JTextField t1,t2,t3;
    public Main()  {
        la1 = new JLabel("Value A");
        la1.setBounds(20, 20, 80, 40);
        t1 = new JTextField();
        t1.setBounds(110,20, 200, 40);
        t1.setFont(new Font("",Font.BOLD,30));
        
        la2 = new JLabel("Value B");
        la2.setBounds(20, 70, 80, 40);
        t2 = new JTextField();
        t2.setBounds(110,70, 200, 40);
        t2.setFont(new Font("",Font.BOLD,30));
        
        la3 = new JLabel("Result   ::");
        la3.setBounds(20, 130, 80, 40);
        t3 = new JTextField();
        t3.setBounds(110,130, 200, 40);
        t3.setEditable(false);
        t3.setFont(new Font("",Font.BOLD,30));
        
        b1=new JButton("+");
        b1.setBounds(110, 200, 70,40);
        b1.setFont(new Font("",Font.BOLD,30));
        b1.addActionListener(this);
        
        b2=new JButton("-");
        b2.setBounds(190, 200, 70,40);
         b2.setFont(new Font("",Font.BOLD,30));
        b3=new JButton("*");
        b3.setBounds(270, 200, 70,40);
         b3.setFont(new Font("",Font.BOLD,30));
        b4=new JButton("/");
        b4.setBounds(350, 200, 70,40);
         b4.setFont(new Font("",Font.BOLD,30));
        
        this.add(la1);
        this.add(t1);
         this.add(la2);
        this.add(t2);
         this.add(la3);
        this.add(t3);
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.getContentPane().setBackground(Color.gray);
        this.setSize(500,500);
        this.setLocationRelativeTo(this);
        this.setLayout(null);
        this.setVisible(true);
    }
    
    
    public static void main(String[] args) {
        new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        float a = Float.parseFloat(t1.getText());
        float b = Float.parseFloat(t2.getText());
        float result;
        if(e.getSource()==b1){
            result = a+b;
            t3.setText(""+result);
        }
     }
    
}
