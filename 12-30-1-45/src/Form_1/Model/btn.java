package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
class bt extends JFrame{
        JButton b;
        JFrame f;
        public bt(){
        b= new JButton("Click Me");
        JPanel p= new JPanel();
        p.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        p.setLayout(new GridLayout(0, 1));
        p.add(b);
        
        f.add(p,BorderLayout.CENTER);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Our GUI");
        f.pack();
        f.setVisible(true);
        
        
            
        }
        
    }

public class btn extends JFrame{
    JButton bt,b;
    
    public btn(){
        
        bt= new JButton("Button");
        bt.setBounds(200, 300, 300, 60);
        bt.setFont(new Font("", Font.BOLD, 30));
        bt.setBackground(Color.GRAY);
        bt.setForeground(Color.red);
        
        // this exact it's class
        this.add(bt);
        this.setSize(700, 700);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);
        
    }
    
    
    
    public static void main(String[] args) {
       new btn();
       new bt();
    }
    
}
