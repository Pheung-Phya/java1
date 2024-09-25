
package AWT_1;

import java.awt.Button;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main_1 extends JFrame implements ActionListener{
    Label la ;
    JCheckBox pizza,burger,tea;
    Button btn ;
    public Main_1()  {
        la = new Label("Food Order System");
        la.setBounds(100, 30, 280, 40);
        la.setFont(new Font("",Font.ITALIC,30));
        
        pizza=new JCheckBox();
        pizza.setText("Pizza @ 100");
        pizza.setBounds(50, 80,100, 40);
        
        burger=new JCheckBox();
        burger.setText("Burger @ 30");
        burger.setBounds(50, 140,100, 40);
        
        tea=new JCheckBox();
        tea.setText("Tea @ 10");
        tea.setBounds(50, 200,100, 40);
        
        btn = new Button("Order");
         btn.setBounds(50, 260,200, 60);
         btn.setFont(new Font("",Font.BOLD,30));
         btn.addActionListener(this);
        
        this.add(la);
        this.add(pizza);
        this.add(burger);
        this.add(tea);
        this.add(btn);
        this.setSize(500, 500);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    
    
    public static void main(String[] args) {
        new Main_1();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        float p,b,t;
        p=100;
        b=30;
        t=10;
        float amount=0;
        String text="";
        if(pizza.isSelected()){
            amount+=p;
            text+="Pizza : 100\n";
        } 
        if(burger.isSelected()){
            amount+=b;
            text+="Burger : 30\n";
        }
        if(tea.isSelected()){
            amount+=t;
            text+="Tea  : 10\n";
        }
         text+="----------\n";
        
        JOptionPane.showMessageDialog(null, text+"Total :" +amount);
         }
    
}
