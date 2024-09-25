
package Layout_1;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class LayoutManager extends JFrame{
         JButton btn1,btn2,btn3,btn4,btn5;
         LayoutManager(){
                  btn1 = new JButton("EAST");
                  btn2 = new JButton("WEST");
                  btn3 = new JButton("NORTH");
                  btn4 = new JButton("SOUTH");
                  btn5 = new JButton("CENTER");
                   
                  this.add(btn1, BorderLayout.EAST);
                  this.add(btn2, BorderLayout.WEST);
                  this.add(btn3, BorderLayout.NORTH);
                  this.add(btn4, BorderLayout.SOUTH);
                  this.add(btn5, BorderLayout.CENTER);
                  this.setSize(800,800);
                  this.setVisible(true);
         }

    public static void main(String[] args) {
         new LayoutManager();
    }
    
}
