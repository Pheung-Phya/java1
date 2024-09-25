
package Introduction_java;

import java.io.IOException;





public class Runtime_Main {
    void time(){
        Runtime rt = Runtime.getRuntime();
        try {
            rt.exec("excel");
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public Runtime_Main(){
        time();
    }
    public static void main(String[] args) {
        new Runtime_Main();
    }
    
}
