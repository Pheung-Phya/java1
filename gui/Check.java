package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Check extends JFrame implements ActionListener{
    JCheckBox p,b,t;
    JButton o;
    
    Check(){
        
        p= new JCheckBox("Pizza @25$");
        p.setBounds(20, 20, 200, 60);
        p.setBackground(null);
        
        b= new JCheckBox("Burger @3.5$");
        b.setBounds(20, 90, 200, 60);
        b.setBackground(null);
        
        t= new JCheckBox("Tea @1,5$");
        t.setBounds(20, 160, 200, 60);
        t.setBackground(null);
        
        o= new JButton("Order");
        o.setBounds(20, 230, 200, 60);
        o.setFont(new Font("", Font.PLAIN, 20));
        o.setForeground(Color.white);
        o.setBackground(Color.orange);
        o.addActionListener( new ActionListener() {
            @Override                         // e is Object
            public void actionPerformed(ActionEvent e) {   // it's cond alert cal value
                float total=0.0f;
                String result="";
                
                if(p.isSelected()){
                    total+=25.0f;
                    result+="\nPizza @25$";
                }
                if(b.isSelected()){
                    total+=3.5f;
                    result+="\nBurger @3.5$";
                }
                if(t.isSelected()){
                    total+=1.5;
                    result+="\nTea @1,5$";
                }
                result+="\n------------------------\n"+"TOTAL : "+total+"$";
                JOptionPane.showConfirmDialog(null, result);
            }
        });
        
        
        add(p);
        add(b);
        add(t);
        add(o);
        this.setSize(700, 700);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.CYAN);
        this.setVisible(true);
        
        
    }
    
    

    public static void main(String[] args) {
        new Check();
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    
}
