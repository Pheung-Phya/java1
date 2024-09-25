/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GUI;import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class FireAnimation extends JPanel implements ActionListener {

    private Timer timer;
    private ArrayList<FireParticle> particles;
    private Random random;

    public FireAnimation() {
        particles = new ArrayList<>();
        random = new Random();

        // Set up a timer to update the animation every 30ms
        timer = new Timer(30, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Draw background (optional)
        g2d.setColor(Color.BLACK);
        g2d.fillRect(0, 0, getWidth(), getHeight());

        // Draw all fire particles
        for (FireParticle particle : particles) {
            particle.draw(g2d);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Add new fire particles continuously
        addParticle();

        // Update particle positions and properties
        for (int i = 0; i < particles.size(); i++) {
            FireParticle particle = particles.get(i);
            particle.update();

            // Remove particles that are fully faded out or have moved off screen
            if (particle.isDead()) {
                particles.remove(i);
                i--;
            }
        }

        // Repaint the panel to update the animation
        repaint();
    }

    // Method to add a new fire particle
    private void addParticle() {
        int x = getWidth() / 2;  // Starting position at the bottom center
        int y = getHeight() - 50; // Near the bottom of the panel, like the base of a fire
        particles.add(new FireParticle(x, y));
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Fire Animation");
        FireAnimation fireAnimation = new FireAnimation();

        frame.add(fireAnimation);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

// FireParticle class representing individual fire particles
class FireParticle {
    private int x, y;  // Position
    private int size;  // Particle size
    private float alpha;  // Transparency level
    private Color color;  // Color of the particle
    private double dx, dy;  // Speed of particle
    private Random random;

    public FireParticle(int x, int y) {
        this.x = x;
        this.y = y;
        this.size = 5 + new Random().nextInt(10);  // Random size for each particle
        this.alpha = 1.0f;  // Start fully opaque
        this.random = new Random();

        // Assign color based on the vertical position (closer to the base, more yellow)
        int colorChoice = random.nextInt(3);
        switch (colorChoice) {
            case 0: color = new Color(255, 165, 0); break;  // Orange
            case 1: color = new Color(255, 69, 0); break;   // Red
            default: color = new Color(255, 255, 0); break; // Yellow
        }

        // Random horizontal drift and upward movement
        this.dx = (random.nextDouble() - 0.5) * 2;  // Gentle horizontal variation (-1 to 1)
        this.dy = -(2 + random.nextDouble() * 2);   // Fast upward movement (-2 to -4)
    }

    public void update() {
        // Update position
        x += dx;
        y += dy;

        // Gradually fade out by reducing the alpha value
        alpha -= 0.03f;
        if (alpha < 0) alpha = 0;

        // Increase size slightly as it rises, simulating a flickering effect
        size += 0.05;
    }

    public void draw(Graphics2D g2d) {
        // Set transparency for fire particles
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));

        // Draw the particle with its color and size
        g2d.setColor(color);
        g2d.fillOval(x, y, (int) size, (int) size);

        // Reset composite to fully opaque for the next drawing
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f));
    }

    // Returns true if the particle has faded out completely
    public boolean isDead() {
        return alpha <= 0;
    }
}
