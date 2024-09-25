
package Form_1;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class RoundedImagePanel extends JPanel {
    private BufferedImage image;

    public RoundedImagePanel(String imagePath) {
        try {
            // Load the image from the specified path
            image = ImageIO.read(new File(imagePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Set the preferred size of the panel based on the image size
        setPreferredSize(new Dimension(image.getWidth(), image.getHeight()));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            // Create a Graphics2D object for drawing
            Graphics2D g2 = (Graphics2D) g.create();

            // Enable anti-aliasing for smooth edges
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            // Define the shape of the rounded rectangle (or use Ellipse2D for a circular shape)
            int arcWidth = 50;  // Width of the arcs at the corners
            int arcHeight = 50; // Height of the arcs at the corners
            Shape clip = new RoundRectangle2D.Float(0, 0, getWidth(), getHeight(), arcWidth, arcHeight);

            // Set the clip to the rounded rectangle
            g2.setClip(clip);

            // Draw the image inside the rounded rectangle
            g2.drawImage(image, 0, 0, getWidth(), getHeight(), null);

            // Dispose of the Graphics2D object to free resources
            g2.dispose();
        }
    }

//    public static void main(String[] args) {
//        // Create a JFrame to hold the panel
//        JFrame frame = new JFrame("Rounded Image Example");
//
//        // Create a panel with the image and rounded corners
//        RoundedImagePanel panel = new RoundedImagePanel("D:\\phya1\\NetBeansProjects\\12-30-1-45\\src\\Form_1\\pic.jpg");
//
//        // Add the panel to the frame
//        frame.add(panel);
//
//        // Set up the frame
//        frame.pack();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
//    }
}



