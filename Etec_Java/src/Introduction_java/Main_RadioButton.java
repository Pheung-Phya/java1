
package Introduction_java;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.plaf.metal.MetalBorders;


public class Main_RadioButton extends JFrame implements ActionListener{

    JRadioButton pizza;
    JRadioButton hamburger;
    JRadioButton hotdog;
    JPanel panel;
    ButtonGroup group = new ButtonGroup();
    public Main_RadioButton() {
        
        panel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        
        
        pizza = new JRadioButton("pizza");
        hamburger = new JRadioButton("hamburger");
        hotdog = new JRadioButton("hotdog");
        pizza.addActionListener(this);
        hamburger.addActionListener(this);
        hotdog.addActionListener(this);
        group.add(pizza);
        group.add(hamburger);
        group.add(hotdog);
        
        
        panel.add(pizza);
        panel.add(hamburger);
        panel.add(hotdog);
        this.add(panel);
        this.pack();
        this.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==pizza){
           System.out.println("You order pizza");
       }else if(e.getSource()==hamburger){
           System.out.println("You order hamburger");
       }else {
           System.out.println("You order hotdog");
       }
    }
    
}
