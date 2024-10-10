
package Form_1.a;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

public class Jl extends JFrame{
        JButton jb;
        JLabel jl;
        
    public Jl(){
        final DefaultListModel<String> l1= new DefaultListModel<>();
        l1.addElement("C");
        l1.addElement("C ++");
        l1.addElement("C #");
        l1.addElement("Java");
        l1.addElement("Java Script");
        l1.addElement("Python");
        l1.addElement("Vue.Js");
        l1.addElement("Reach.Js");
        l1.addElement("Pascal");
        
        final JList<String> list1= new JList<>(l1);
        list1.setBounds(100, 100, 200, 170);
        jb=new JButton("Show");
        jb.setBounds(400, 100, 100, 50);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data="";
                if(list1.getSelectedIndex()!=-1){  // for get value from Jlist
                    data=list1.getSelectedValue();
                    jl.setText(data);  // for set Value
                    jl.setHorizontalAlignment(JLabel.HORIZONTAL);
                    
                }
             }
        });
        
        jl = new RoundedLabel(); // connect with class RoundedLabel make square box
        jl.setBounds(200, 10, 200, 50);
        jl.setBackground(Color.CYAN);
        jl.setOpaque(false); // សម្រាប់រុញ label ទៅលើ
        
         
        
        this.add(jb);
        add(jl);
        add(list1);
        this.setSize(700, 500);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Jl();
    }
    
}
