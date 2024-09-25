
package Introduction_java;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JProgressBar;


public class Main_ProgressBar {
    JFrame frame = new JFrame();
    JProgressBar progressbar = new JProgressBar();
    public Main_ProgressBar() {
        
        progressbar.setBounds(0, 0, 450, 50);
        
        progressbar.setStringPainted(true);
        
        frame.add(progressbar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        fill();
    }
    public void fill(){
        int count=0;
        while(count<=100){
            progressbar.setValue(count);
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(Main_ProgressBar.class.getName()).log(Level.SEVERE, null, ex);
            }
            count+=1;
        }
        progressbar.setString("Done! :");
    }
    
}
