
package GUI1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

class ComboBox extends JFrame{
         JComboBox<String> combo;
         JButton btn;
         String[] country = {"Cambodia","Lao","ThaiLand","Brazil","Vietnam"};
         public ComboBox(){
                  combo = new JComboBox<>(country);
                  combo.setBounds(50, 100, 100, 50);
                  
                  btn = new JButton("click");
                  btn.setBounds(50, 160, 100, 50);
                  btn.addActionListener(new ActionListener() {
                      @Override
                      public void actionPerformed(ActionEvent e) {
                           String text = (String) combo.getSelectedItem();
                           int index = combo.getSelectedIndex();
                           JOptionPane.showMessageDialog(null, "You index "+index+" is "+text);
                      }
                  });
                
                  add(combo);
                  add(btn);
                  setSize(700, 500);
                  setLayout(null);
                  setLocationRelativeTo(null);
                  setVisible(true);
         }
}

public class RadioBtn_Main {
        public static void main(String[] args) {
                  new ComboBox();
        } 
}
