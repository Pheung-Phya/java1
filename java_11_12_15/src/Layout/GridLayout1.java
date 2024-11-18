package Layout;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayout1 {
        JFrame frame ;
        JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
        public GridLayout1(){
                  frame = new JFrame();
                  frame.setLayout(new GridLayout(3, 3));
                  b1=new JButton("Button1");
                  b2=new JButton("Button2");
                  b3=new JButton("Button3");
                  b4=new JButton("Button4");
                  b5=new JButton("Button5");
                  b6=new JButton("Button6");
                   b7=new JButton("Button7");
                   b8=new JButton("Button8");
                    b9=new JButton("Button9");
                  frame.add(b1);frame.add(b2);
                  frame.add(b3);frame.add(b4);
                  frame.add(b5);frame.add(b6);
                  frame.add(b7); frame.add(b8);
                  frame.add(b9);
                
                frame.setSize(600, 600);
                frame.setVisible(true);
        }
}
