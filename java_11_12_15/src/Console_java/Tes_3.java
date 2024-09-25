
package Console_java;

import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Tes_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("#Example 1");
        int x = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter value x : "));
        int y = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter value y : "));
        JOptionPane.showMessageDialog(frame, "x + y = "+(x+y));
        
    }    
}
