
package Form_1;
import javax.swing.*;
import java.awt.*;

public class DashboardWithTabs extends JFrame {

    public DashboardWithTabs() {
        // Set up the frame
        setTitle("Java Swing Dashboard with Tabs");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Create the tabbed pane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create the first panel for "Tab 1"
        JPanel panel1 = new JPanel();
        panel1.setLayout(new BorderLayout());
        panel1.add(new JLabel("Content for Tab 1"), BorderLayout.CENTER);
        JButton button1 = new JButton("Action 1");
        panel1.add(button1, BorderLayout.SOUTH);
        
        // Create the second panel for "Tab 2"
        JPanel panel2 = new JPanel();
        panel2.setLayout(new BorderLayout());
        panel2.add(new JLabel("Content for Tab 2"), BorderLayout.CENTER);
        JButton button2 = new JButton("Action 2");
        panel2.add(button2, BorderLayout.SOUTH);

        // Add panels to the tabbed pane
        tabbedPane.addTab("Menu 1", panel1);
        tabbedPane.addTab("Menu 2", panel2);

        // Add the tabbed pane to the frame
        add(tabbedPane, BorderLayout.CENTER);
        
        // Add action listeners for buttons (optional)
        button1.addActionListener(e -> JOptionPane.showMessageDialog(null, "You clicked Action 1 in Menu 1!"));
        button2.addActionListener(e -> JOptionPane.showMessageDialog(null, "You clicked Action 2 in Menu 2!"));
    }

    public static void main(String[] args) {
        // Create and show the dashboard
        SwingUtilities.invokeLater(() -> new DashboardWithTabs().setVisible(true));
    }
}
