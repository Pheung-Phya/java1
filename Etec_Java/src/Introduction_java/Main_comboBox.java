
package Introduction_java;

import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;


public class Main_comboBox extends JFrame implements ActionListener{

    JComboBox combo;
    public Main_comboBox() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        
        String[] animals={"dog","cat","horse"};
        combo = new  JComboBox(animals);
       // combo.setEditable(true);
       combo.addItem("Mouse");
       combo.insertItemAt("monkey", 0);
       combo.removeItem("dog");
       combo.removeItemAt(2);
       combo.removeAllItems();
        System.out.println(combo.getItemCount());
        
        combo.addActionListener(this);
        this.add(combo);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==combo){
            System.out.println(combo.getSelectedIndex());
          //  System.out.println(combo.getSelectedItem());
        }
    }
      
}
