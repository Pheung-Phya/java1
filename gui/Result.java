package gui;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Result extends JFrame{
    JTextArea ta;
    JLabel lb;
    public Result(){
        ta= new JTextArea("IT Professional get kk$$");
        ta.setBounds(200, 5, 600, 200);
        ta.setFont(new Font("", Font.BOLD, 25));
        
        lb=new JLabel("Result: ");
        lb.setBounds(10, 10, 150, 30);
        lb.setFont(new Font("", Font.BOLD, 25));
        
        this.add(lb);
        this.add(ta);
        this.setSize(700, 700);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);
    }
    
    

    public static void main(String[] args) {
        new Result(); // call constructor to use
    }
    
}