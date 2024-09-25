
package Layout_1;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
public class CardLayout1 extends JFrame implements ActionListener{
        
        CardLayout card;
        JButton btn1,btn2;
    public CardLayout1() {
        btn1 = new JButton("Btn1");
        btn1.addActionListener(this);
        btn2 = new JButton("Btn2");
        btn2.addActionListener(this);
        
        this.add(btn1);
        this.add(btn2);
         card = new CardLayout(10,10);
        this.setLayout(card);
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
        
    public static void main(String[] args) {
         new CardLayout1();
    }   

    @Override
    public void actionPerformed(ActionEvent e) {          
                 card.next(getContentPane());
         }
}
