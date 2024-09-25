
package Introduction_java;
import java.text.DecimalFormat;
import java.util.*;
import java.util.Scanner;


public class Etec_Java {

    
    public static void main(String[] args) {
        int id;
        String name,gender;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter id : ");
        id=obj.nextInt();
        System.out.print("Enter name : ");
        name=obj.next();
        System.out.print("Enter Gender : ");
        gender=obj.next();
        
        
        double myNumber = 3.122222;
        DecimalFormat df = new DecimalFormat("#.###");
        String format = df.format(myNumber);
        System.out.println(format+id);
        df.applyPattern("#.##");
        System.out.println(format+id);
    }
    
}
