
package Layout;
import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Boxlayout1 extends JFrame{
       JButton[] b = new JButton[5];
       JPanel panel;
        Boxlayout1(){
                 panel = new JPanel();
                 panel.setBackground(Color.red);
                  panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
                  for(int i=0;i<5;i++){                     
                        b[i]=new JButton("btn"+(i+1));
                        panel.add(b[i]);
                  }              
                  this.add(panel);
                  this.setSize(800,800);
                  this.setVisible(true);
         } 
}
