
package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class Form_3 extends JFrame{
    JCheckBox pizza,burger,tea;
    JButton order;
    Form_3(){
        pizza = new JCheckBox("Pizza @25$");
        pizza.setBounds(20, 20, 200, 60);
        burger = new JCheckBox("Burger @3.5$");
        burger.setBounds(20, 90, 200, 60);
        tea = new JCheckBox("Tea @1.5$");
        tea.setBounds(20, 160, 200, 60);
        order = new JButton("Order");
        order.setBounds(20,230,200,60);
        order.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {         
                    float total =0.0f;
                    String result="";
                    if(pizza.isSelected()){
                        total += 25.0f;
                        result += "Pizza @25$\n"; 
                    }
                    if(burger.isSelected()){
                        total += 3.5f;
                        result +="Burger @3.5$\n";
                    }
                    if(tea.isSelected()){
                        total += 1.5;
                        result +="Tea @1.5$\n";
                    }
                    result +="-------------------\n"+"TOTAL : "+total+"$";
                    JOptionPane.showMessageDialog(null, result);
                }
            
        });
        
        this.add(order);
       this.add(pizza);
       this.add(burger);
       this.add(tea);
        this.setSize(700, 700);
        this.setLocationRelativeTo(null);
        this.setLayout(null); 
        //this.getContentPane().setBackground(Color.BLUE);
        this.setVisible(true);
    }
    public static void main(String[] args) {
         new Form_3();
    }  


}
