package Layout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class CardLayout1 extends JFrame implements ActionListener{
        Container container;
        JButton b1,b2,b3,b4;
        CardLayout card;
        public CardLayout1(){
                card = new CardLayout(20, 30);
                container = this.getContentPane();  
                container.setLayout(card);
                b1 = new JButton("button1");
                b1.addActionListener(this);
                b2 = new JButton("button2");
                b2.addActionListener(this);
                b3 = new JButton("button3");
                b3.addActionListener(this);
                b4 = new JButton("button4");
                b4.addActionListener(this);
                container.add( b1);
                container.add(b2);
                container.add(b3);
                container.add(b4);
                this.setSize(500, 500);
                this.setVisible(true);
        }

    @Override
    public void actionPerformed(ActionEvent e) {
          if(b4==e.getSource()){
                card.first(container);
                return;
          }
          card.next(container);
    }
}
