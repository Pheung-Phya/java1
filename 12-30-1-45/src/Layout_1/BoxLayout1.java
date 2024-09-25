
package Layout_1;
import java.awt.Button;
import java.awt.Frame;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BoxLayout1 extends Frame{
            Button btn1,btn2,btn3,btn4,btn5,btn6;
        BoxLayout1(){
                  btn1 = new Button("1");
                  btn2 = new Button("2");
                  btn3 = new Button("3");
                  btn4 = new Button("4");
                  btn5 = new Button("5");
                  btn6 = new Button("6");
                  
                  this.add(btn1);
                  this.add(btn2);
                  this.add(btn3);
                  this.add(btn4);
                  this.add(btn5);
                  this.add(btn6);
                  this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
                  this.setSize(800,800);
                  this.setVisible(true);
         }
    public static void main(String[] args) {
        new BoxLayout1();
    }
    
}
