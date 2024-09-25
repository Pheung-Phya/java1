
package Introduction;

import java.util.Scanner;

public class Control_st {
    
    public static void main(String[] args) {
      String original;
      String revers="";
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter String ");
        original = cin.next();   
        int leng = original.length();  
        for(int i=leng-1;i>=0;i--){  
            revers = revers+ original.charAt(i);
        }
        System.out.println("Revers String : "+revers);
    } 
}
