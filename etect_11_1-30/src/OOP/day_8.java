
package OOP;
import java.awt.Color;
import java.awt.Label;
import javax.swing.JFrame;

public class day_8 extends JFrame{
    Label label  , label1 ,label2;
    day_8(){
         label= new Label();
        label.setText("HELLO AWT");
        label.setBounds(10, 0, 100, 70);
        label.setBackground(Color.red);
        label1 = new Label();
        label1.setText("Wellcome");
        label1.setBounds(120, 0, 100, 70);
        
        this.add(label);
        this.add(label1);
        this.setLayout(null);
        this.setSize(700, 800);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new day_8();
    }  
}
