package Form_1;

import javax.swing.*;
import java.awt.*;

public class bcd extends JFrame {

    public bcd() {
        // Create the main panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Add multiple components to the panel
        for (int i = 0; i < 200; i++) {
            JLabel label = new JLabel("Item " + (i + 1));
            // You don't need to set the preferred size; let the layout manage the size
            panel.add(label);
        }

        // Wrap the panel in a JScrollPane to make it scrollable
        JScrollPane scrollPane = new JScrollPane(panel);

        // Add the scrollPane to the frame
        this.add(scrollPane);
        this.setTitle("Scrollable Frame Example");
        this.setSize(300, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new bcd());
    }
}
