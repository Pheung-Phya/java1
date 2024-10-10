
package Form_1.a;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Combo extends JFrame implements ActionListener{
    
    JLabel l;
    JButton b;
    
    JComboBox cb;
    String fruit[]={"Ford", "TOYOTA", "Nissan", "Range Rover", "Mecedes"};
    
    
    public Combo() {
        
        b= new JButton("Show");
        b.setBounds(400, 100, 150, 40);
        b.setFont(new Font("", Font.BOLD, 20));
        b.addActionListener(this);
        b.setForeground(Color.white);
        b.setBackground(Color.orange);
        
        
        
        
        // JCombo Boc
        cb= new JComboBox(fruit);
        cb.setBounds(100, 100, 200, 40);
        cb.setFont(new Font("", Font.BOLD, 20));
        
        
        
        l= new JLabel("Programming sellect language: "+cb.getSelectedItem());
        l.setBounds(100, 400, 500, 40);
        l.setFont(new Font("", Font.BOLD, 20));
        
        
        
        this.add(l);
        this.add(b);
        this.add(cb);
        this.setSize(700, 700);
        this.setLayout(null);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
    }
    

    public static void main(String[] args) {
        new Combo();
        
    }

    @Override
    public void actionPerformed(ActionEvent arg) {
        String item;
        item=(String) cb.getItemAt(cb.getSelectedIndex());
        l.setText("Programming sellect language: "+item); // l.setText(""); clear
        
    }
    
}
