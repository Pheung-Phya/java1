
package Introduction_java;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Main_colorChooser extends JFrame implements ActionListener{
    
    JLabel label = new JLabel();
    JButton button = new JButton("Chang color");
    Main_colorChooser(){
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setLayout(new FlowLayout());
         label.setText("I come from jchoosercolor..!");
         label.setFont(new Font("MV Boli",Font.PLAIN,30));
         label.setBackground(Color.WHITE);
         label.setOpaque(true);
         button.addActionListener(this);
        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            JColorChooser colorchooser = new JColorChooser();
            Color color = JColorChooser.showDialog(null, "choose what i guest..", Color.black);
            label.setBackground(color);
        }
    }
    
}
