package gui;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Form_2_1 extends JFrame{
    JTextField t1,t2;
    public Form_2_1(){
        t1= new JTextField();
        t1.setBounds(10, 10, 200, 40);
        t1.setFont(new Font("", Font.BOLD, 30));
        
        t2=new JTextField();
        t2.setBounds(10, 60, 200, 40);
        t2.setFont(new Font("", Font.BOLD, 30));
        this.add(t1);
        this.add(t2);
        this.setSize(700, 700);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);
        
        
    }
    
    
    public static void main(String[] args) {
        
        new Form_2_1();
    }
    
}
