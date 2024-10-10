package gui;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class BtnRadio extends JFrame implements ActionListener{
    JRadioButton m,f;    
    ButtonGroup btg;     // for select one of two
    JButton bn;
    public BtnRadio() {
        m=new JRadioButton("Male");
        m.setBounds(100, 100, 200, 20);
        f=new JRadioButton("Female");
        f.setBounds(100, 130, 200, 20);
        btg=new ButtonGroup();
        bn=new JButton("Submit");
        bn.setBounds(200, 160, 80, 25);
        bn.addActionListener((ActionListener) this);
        btg.add(m);
        btg.add(f);
        f.setSelected(true);   // set sellect F , f is female
        
        btg.add(m);
        btg.add(f);
        
        this.add(bn);
        this.add(m);
        this.add(f);
        this.setSize(700, 500);
        
        this.setResizable(false);  // can not maz and minimume
//        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);  // can not close
//        this.setDefaultCloseOperation();
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
        
    }
    
    public static void main(String[] args) {
        new BtnRadio();
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        if(m.isSelected()){
            JOptionPane.showConfirmDialog(null, "You are Male");
        }
        if(f.isSelected()){
            JOptionPane.showConfirmDialog(null, "You are Female");
        }
    }
    
}
