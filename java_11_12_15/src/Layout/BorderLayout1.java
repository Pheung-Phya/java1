package Layout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class BorderLayout1 {
        JFrame frame;
        JButton b1,b2,b3,b4,b5;
        JLabel tittle;
        public BorderLayout1() { 
                frame = new JFrame();
                frame.setLayout(new BorderLayout());
                tittle = new JLabel("I am borderlayout");
                tittle.setBackground(Color.red);
                tittle.setFont(new Font("",Font.BOLD,50));
                tittle.setOpaque(true);
                frame.add(tittle,BorderLayout.NORTH);
                 b2 = new JButton("East");       
                frame.add(b2,BorderLayout.EAST);
                 b3 = new JButton("West");       
                frame.add(b3,BorderLayout.WEST);
                 b4 = new JButton("South");       
                frame.add(b4,BorderLayout.SOUTH);
                 b5 = new JButton("Center");       
                frame.add(b5,BorderLayout.CENTER);
                
                frame.setSize(500, 500);
                frame.setVisible(true);
        }
}
