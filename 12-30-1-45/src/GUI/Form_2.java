
package GUI;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Form_2 extends JFrame{
    JTextArea ta;
    JLabel lb;
    public Form_2(){
        ta = new JTextArea("I.T ETECT CENTER PROFESSION");
        ta.setBounds(200,10,500,200);
        ta.setFont(new Font("",Font.BOLD,30));
        lb = new JLabel("RESULT : ");
        lb.setBounds(10,10,150,30);
        lb.setFont(new Font("",Font.BOLD,30));
        
        this.add(ta);
        this.add(lb);
        this.setSize(700, 700);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);
    }
    public static void main(String[] args) {
         new Form_2();
    } 
}
