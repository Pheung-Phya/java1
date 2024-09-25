
package rupp;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI_1 {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(700, 500);
        frame.setLayout(null);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        JButton b1 = new JButton("button1");
        b1.setBounds(10, 20, 100, 40);
        frame.add(b1);
        frame.getContentPane().setBackground(Color.green);
          frame.setVisible(true);
    }
    
}
