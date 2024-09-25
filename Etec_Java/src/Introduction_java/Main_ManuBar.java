
package Introduction_java;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Main_ManuBar extends JFrame implements ActionListener{

    JMenuItem load ;
    JMenuItem save ;
    JMenuItem exit ;
    public Main_ManuBar() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setLayout(new FlowLayout());
        JMenuBar menubar = new JMenuBar();
        
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        JMenu help= new JMenu("Help");
        
        load = new JMenuItem("Load");
        save= new JMenuItem("Save");
        exit= new JMenuItem("Exit");
        
        load.setMnemonic(KeyEvent.VK_L);
        save.setMnemonic(KeyEvent.VK_S);
        exit.setMnemonic(KeyEvent.VK_E);
        
        menubar.add(file);
        menubar.add(edit);
        menubar.add(help);
        
        file.add(load);
        file.add(save);
        file.add(exit);
        
        load.addActionListener(this);
        save.addActionListener(this);
        exit.addActionListener(this);
        
        this.setJMenuBar(menubar);
        this.setSize(500,500);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==load){
            System.out.println("You upload a file.");
        }
        if(e.getSource()==save){
            System.out.println("You save file");
        }
        if(e.getSource()==exit){
            System.out.println("you exit");
        }
    }
    
    
}
