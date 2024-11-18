package GUI1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class Practice5  implements ActionListener{
         JFrame frame = new JFrame();
         JMenuBar menuBar;
         JMenu file,edit,help;
         JMenuItem cut,copy,past,selectAll;
         JTextArea area;
         public Practice5(){
                   menuBar = new JMenuBar();
                   file = new JMenu("File");
                   edit = new JMenu("Edit");
                   help = new JMenu("Help");
                   
                   cut = new JMenuItem("Cut");
                   cut.addActionListener(this);
                   copy= new JMenuItem("copy");
                   copy.addActionListener(this);
                   past= new JMenuItem("past");
                   past.addActionListener(this);
                   selectAll= new JMenuItem("selectAll");
                   selectAll.addActionListener(this);
                   edit.add(cut);
                   edit.add(copy);
                   edit.add(past);
                   edit.add(selectAll);
                   
                   
                   menuBar = new JMenuBar();
                   menuBar.add(file);
                   menuBar.add(edit);
                   menuBar.add(help);
                   
                   area = new JTextArea();
                   area.setBounds(0, 0, 500, 550);
                   
                  frame.add(area);
                  frame.add(menuBar);
                  frame.setJMenuBar(menuBar);  
                  frame.setLocationRelativeTo(null);
                  frame.setLayout(null);    
                  frame.setSize(700,700);    
                  frame.setVisible(true); 
         }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==cut){
                   area.cut();
        }
        if(e.getSource()==selectAll){
                area.selectAll();
        }
        if(e.getSource()==past){
               area.paste();
        }
        if(e.getSource()==copy){
                area.copy();
        }
    }
}
