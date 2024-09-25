
package Introduction_java;
import java.io.IOException;
import java.util.*;

public class Main_checknotepad {
    
    void checknotepad() throws IOException{
        Runtime rt = Runtime.getRuntime();
        
             rt.exec("notepad");
        
        
    }
    
    public Main_checknotepad() throws IOException{
        checknotepad();
    }
    public static void main(String[] args) throws IOException{
        new Main_checknotepad();
    }
}
