
package Layout;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class FlowLayout1 {
        JFrame frame;
        JButton b1,b2,b3;
        JPanel panel;
        public FlowLayout1(){
                frame = new JFrame();   
                frame.setLayout(new FlowLayout(FlowLayout.CENTER,100,200));
                b1 = new JButton("Button1");
                b2 = new JButton("Button2");
                b3 = new JButton("Button3");
                panel = new JPanel();
                panel.setSize(500, 500);
                panel.setBackground(Color.red);
                panel.add(b1);
                panel.add(b2);
                panel.add(b3);
                frame.add(panel);
                frame.setSize(500,500);
                frame.setVisible(true);
        }
}
