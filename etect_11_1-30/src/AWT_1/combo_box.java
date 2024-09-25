
package AWT_1;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class combo_box extends JFrame{
    JComboBox combo ;
    JButton btn ;
    String menu[]={"Java","C","C++","C#","Python"};
    public combo_box() {
        combo = new JComboBox(menu);
        combo.setBounds(100, 200, 300, 60);
        
        btn = new JButton("Show");
        btn.setBounds(100, 300, 300,60);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int index;
                index=combo.getSelectedIndex();
                JOptionPane.showMessageDialog(null, "You Select : "+combo.getItemAt(index));
            }
        });
        
        this.add(combo);
        this.add(btn);
        this.setTitle("Center Text");     
        this.setLayout(null);
        this.setSize(500, 500);
        this.setLocationRelativeTo(this);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
       new combo_box();
    }   

   
     
}
