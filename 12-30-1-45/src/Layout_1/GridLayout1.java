
package Layout_1;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayout1 extends JFrame{
         
                 JButton btn1,btn2,btn3,btn4,btn5,btn6;
         GridLayout1(){
                  btn1 = new JButton("1");
                  btn2 = new JButton("2");
                  btn3 = new JButton("3");
                  btn4 = new JButton("4");
                  btn5 = new JButton("5");
                  btn6 = new JButton("6");
                  
                  this.add(btn1);
                  this.add(btn2);
                  this.add(btn3);
                  this.add(btn4);
                  this.add(btn5);
                  this.add(btn6);
                  this.setLayout(new GridLayout(2, 3));
                  this.setSize(800,800);
                  this.setVisible(true);
         }
    
    public static void main(String[] args) {
         new GridLayout1();
    }
    
}
