
package AWT_1;

import java.awt.Button;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Main_2 extends JFrame implements ActionListener{
    
    JRadioButton M,F;
    Button btn ;
    ButtonGroup btg;
    public Main_2(){
        M=new JRadioButton("Male");
        M.setBounds(20, 50, 200, 40);
        M.setFont(new Font("",Font.BOLD,30));
        
        F=new JRadioButton("Female");
        F.setBounds(20, 120, 200, 40);
        F.setFont(new Font("",Font.BOLD,30));
        
        btn=new Button("CLICK");
        btn.setBounds(50, 190, 200, 40);
        btn.setFont(new Font("",Font.BOLD,30));
        btn.addActionListener(this);
        
        btg=new ButtonGroup();
        btg.add(M);
        btg.add(F);
        
       
        this.add(M);
        this.add(F);
        this.add(btn);
        this.setSize(500, 500);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new Main_2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(M.isSelected()){
           JOptionPane.showMessageDialog(null, "You are Man");
       }
       if(F.isSelected()){
           JOptionPane.showMessageDialog(null, "You are Female");
       }
   }
    
}
