package Console_java;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Day_9 { 
    void gotoNotepad() {
        Runtime rs = Runtime.getRuntime();
        try {
            String filePath = "C:\\Users\\USER\\Desktop\\txt_file\\diy.txt";  // Change this to the actual path of idea.txt
            rs.exec("notepad " + filePath);
        } catch (IOException ex) {
            Logger.getLogger(Day_9.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Day_9() {
        gotoNotepad();
    }  

    public static void main(String[] args) {
        new Day_9();
    }
}
