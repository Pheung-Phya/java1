
package GUI;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Form_1 extends JFrame{
         JLabel label,label2;
        Form_1(){
                  label = new JLabel("This class Java");
                  label.setBounds(0, 0, 200, 30);
                  
                  label2 = new JLabel("This is Awt");
                  label2.setBounds(700, 700, 200, 20);
            
                  this.add(label2);
                  this.add(label);
                  this.setTitle("JFrame#");
                  this.setSize(800, 800);
                  this.setLocationRelativeTo(null);
                  this.setLayout(null);
                  this.setVisible(true);
        }
    
    public static void main(String[] args) {
        new Form_1();
    }   
}
