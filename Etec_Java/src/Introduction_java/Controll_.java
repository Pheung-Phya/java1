
package Introduction_java;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Controll_ {

    public static void main(String[] args) {
            Scanner cin = new Scanner(System.in);
            DecimalFormat df = new DecimalFormat(",##.##");
            float a=2334.345f;
            System.out.println(df.format(a));
            System.out.print("Enter Name : ");
            String s = cin.nextLine();
            
            if(s.equalsIgnoreCase("Phya")){
                System.out.println("Hello world");
            }else{
                System.out.println("Wrong");
            }
    }
    
}
