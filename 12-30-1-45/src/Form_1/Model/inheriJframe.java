package gui;


import javax.swing.JFrame;
import javax.swing.JLabel;

class Form_2 extends JFrame{
    JLabel label,label2;
    
    public Form_2(){ // this is a constructor
        label= new JLabel("ហាងកាហ្វេ");
        label.setBounds(0, 0, 200, 30);
        
        label2= new JLabel("FORD");
        label2.setBounds(650, 650, 250, 20);
        
        this.add(label);
        this.add(label2);
        
        this.setTitle("ហាងលក់រថយន្ត");
        this.setSize(800, 800);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);
    }
    
}

public class inheriJframe {
    public static void main(String[] args) {
        new Form_2();
    }
    
}
