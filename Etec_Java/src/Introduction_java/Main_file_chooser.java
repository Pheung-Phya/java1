
package Introduction_java;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;


public class Main_file_chooser extends JFrame implements ActionListener{
    
    JButton button = new JButton("choose file");
    Main_file_chooser(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // this.setLayout(new FlowLayout());
        
        button.addActionListener(this);
        this.add(button);
        this.pack();
        this.setVisible(true);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
              JFileChooser filechooser = new JFileChooser();
              filechooser.setCurrentDirectory(new File("png"));
           // int respon =   filechooser.showOpenDialog(null); //select file to open
           int respon = filechooser.showSaveDialog(null); //select file to save
            System.out.println("respon = "+respon);
            if(respon == JFileChooser.APPROVE_OPTION){
                File file = new File(filechooser.getSelectedFile().getAbsolutePath());
                 System.out.println("file ="+file);
            }
        }
    }
    
}
