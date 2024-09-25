
package Introduction_java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DATE_CURRENT {
    
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy hh::mm:ss");
        System.out.println("ខ្មែរ");
        for(int i=0;i<1000;i++){
            String date = sdf.format(new Date());
            System.out.println(date);
            try {
                Thread.sleep(1000);
                System.out.flush();
            } catch (InterruptedException ex) {
                Logger.getLogger(DATE_CURRENT.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
