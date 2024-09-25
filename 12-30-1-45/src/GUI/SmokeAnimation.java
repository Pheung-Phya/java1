
package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class SmokeAnimation extends JPanel implements ActionListener {

    private Timer timer;
    private ArrayList<Particle> particles;  // List to store smoke particles
    private Random random;

    public SmokeAnimation() {
        // Initialize particle list and random generator
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

        // Set background to black (optional)
        g2d.setColor(Color.BLACK);
        g2d.fillRect(0, 0, getWidth(), getHeight());

        // Draw all particles
        for (Particle particle : particles) {
            particle.draw(g2d);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Add new particles to simulate continuous smoke generation
        addParticle();

        // Update all particles' positions and properties
        for (int i = 0; i < particles.size(); i++) {
            Particle particle = particles.get(i);
            particle.update();

            // Remove particles that are fully faded out or moved too far
            if (particle.isDead()) {
                particles.remove(i);
                i--;
            }
        }

        // Repaint the panel to update the animation
        repaint();
    }

    // Method to add a new smoke particle
    private void addParticle() {
        int x = getWidth() / 2;
        int y = getHeight() / 2;  // Starting from the center
        particles.add(new Particle(x, y));
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Smoke Animation");
        SmokeAnimation smokeAnimation = new SmokeAnimation();

        frame.add(smokeAnimation);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

// Particle class representing individual smoke particles
class Particle {
    private int x, y;  // Position
    private int size;  // Particle size
    private float alpha;  // Transparency level
    private int dx, dy;  // Speed of particle
    private Random random;

    public Particle(int x, int y) {
        this.x = x;
        this.y = y;
        this.size = 20 + new Random().nextInt(20);  // Random size for each particle
        this.alpha = 1.0f;  // Start fully opaque
        this.random = new Random();

        // Random horizontal and vertical movement
        this.dx = random.nextInt(6) - 3;  // Move in random x direction
        this.dy = random.nextInt(3) - 5;  // Slowly rise upwards
    }

    public void update() {
        // Update the position
        x += dx;
        y += dy;

        // Gradually fade out by reducing the alpha value
        alpha -= 0.01f;
        if (alpha < 0) alpha = 0;
    }

    public void draw(Graphics2D g2d) {
        // Set transparency for smoke particles
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));

        // Set a gray color for the smoke
        g2d.setColor(new Color(200, 200, 200));

        // Draw the particle as a filled oval
        g2d.fillOval(x, y, size, size);

        // Reset composite to fully opaque for next drawings
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f));
    }

    // Returns true if the particle has faded out completely
    public boolean isDead() {
        return alpha <= 0;
    }
}
