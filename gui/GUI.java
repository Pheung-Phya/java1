package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import javax.swing.JFrame;


class Form_1{
    JFrame frame; // សម្រាប់ធ្វើផ្ទាំង​ JFrame
    Label label; //សម្រាប់ បង្ហាញអក្សរ
    
   public Form_1() {
        frame=new JFrame("តោះផឹកកាហ្វេ");
        frame.setLayout(null);
        frame.setSize(800, 800);
        frame.setLocationRelativeTo(null);// make JFrame to center
        
        
        label= new Label();
        label.setText("Hello AWT");
        label.setBounds(300, 340, 200, 60); // show size text
        label.setBackground(Color.red);
        label.setFont(new Font("",Font.BOLD,30));
        
        
        frame.add(label);
        frame.setVisible(true); // if true show JFrame in console, else false not show JFrame

    }
   
    
    
}


public class GUI {
    public static void main(String[] args) {
       new Form_1();
    }
    
}
