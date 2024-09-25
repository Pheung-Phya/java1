
package Layout_1;
import java.awt.*;
import javax.swing.*;

public class Container1 {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Layout Manager Example");

        
        Container container1 = new JPanel();
        container1.setLayout(new FlowLayout());
        container1.add(new JButton("Flow Button 1"));
        container1.add(new JButton("Flow Button 2"));
        container1.add(new JButton("Flow Button 3"));

       
        Container container2 = new JPanel();
        container2.setLayout(new BorderLayout());
        container2.add(new JButton("Border North"), BorderLayout.NORTH);
        container2.add(new JButton("Border South"), BorderLayout.SOUTH);
        container2.add(new JButton("Border Center"), BorderLayout.CENTER);

        // Use GridLayout
        Container container3 = new JPanel();
        container3.setLayout(new GridLayout(2, 2));
        container3.add(new JButton("Grid Button 1"));
        container3.add(new JButton("Grid Button 2"));
        container3.add(new JButton("Grid Button 3"));
        container3.add(new JButton("Grid Button 4"));

        
        Container container4 = new JPanel();
        container4.setLayout(new BoxLayout(container4, BoxLayout.Y_AXIS));
        container4.add(new JButton("Box Button 1"));
        container4.add(new JButton("Box Button 2"));
        container4.add(new JButton("Box Button 3"));

     
        frame.setLayout(new GridLayout(2, 2)); // 2x2 grid for the 4 containers
        frame.add(container1);
        frame.add(container2);
        frame.add(container3);
        frame.add(container4);

       
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

