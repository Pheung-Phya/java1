
package Form_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class abc {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Enter Key to Move Focus");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());

        // Create text fields
        JTextField textField1 = new JTextField(10);
        JTextField textField2 = new JTextField(10);
        JTextField textField3 = new JTextField(10);

        // Add key binding for Enter to move focus to the next component
        textField1.getInputMap().put(KeyStroke.getKeyStroke("ENTER"), "moveFocus");
        textField1.getActionMap().put("moveFocus", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField2.requestFocusInWindow();
            }
        });
        textField2.getInputMap().put(KeyStroke.getKeyStroke("ENTER"), "moveFocus");
        textField2.getActionMap().put("moveFocus", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField3.requestFocusInWindow();
            }
        });
        

        // Add text fields to the frame
        frame.add(textField1);
        frame.add(textField2);
        frame.add(textField3);

        // Set frame size and make it visible
        frame.setSize(300, 100);
        frame.setVisible(true);
    }
}

