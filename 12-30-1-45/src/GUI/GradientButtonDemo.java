/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GradientButtonDemo extends JFrame {

    public GradientButtonDemo() {
        setTitle("Linear Gradient Button Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create a panel and add the gradient button
        JPanel panel = new JPanel();
        GradientButton gradientButton = new GradientButton("Click Me!");

        // Add action listener for button click
        gradientButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Button Clicked!");
            }
        });

        panel.add(gradientButton);
        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GradientButtonDemo().setVisible(true);
            }
        });
    }
}

class GradientButton extends JButton {

    public GradientButton(String text) {
        super(text);
        setFocusPainted(false);  // Remove focus border
        setContentAreaFilled(false);  // Allow custom painting
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();

        // Define the linear gradient from top to bottom
        Color color1 = new Color(255, 140, 0);  // Orange
        Color color2 = new Color(255, 69, 0);   // Red
        GradientPaint gradientPaint = new GradientPaint(0, 0, color1, 0, getHeight(), color2);

        // Apply the gradient paint to the button background
        g2d.setPaint(gradientPaint);
        g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);

        // Paint the button text and border
        super.paintComponent(g2d);
        g2d.dispose();
    }
}
