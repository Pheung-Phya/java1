
package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BallAnimation extends JPanel implements ActionListener {
    
    private int x = 0;  // Starting x position of the ball
    private int y = 100; // y position of the ball
    private int diameter = 50; // Ball diameter
    private int dx = 2; // Horizontal movement speed

    private Timer timer;

    public BallAnimation() {
        // Set the timer to trigger every 10 milliseconds
        timer = new Timer(10, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw the background
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());
        // Draw the ball
        g.setColor(Color.RED);
        g.fillOval(x, y, diameter, diameter);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Move the ball by updating its x position
        x += dx;
        // If the ball hits the edges of the window, reverse its direction
        if (x + diameter > getWidth() || x < 0) {
            dx = -dx;
        }
        // Repaint the panel to update the ball's position
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ball Animation");
        BallAnimation ballAnimation = new BallAnimation();

        frame.add(ballAnimation);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
