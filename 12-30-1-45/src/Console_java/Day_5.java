
package Console_java;

import java.util.Scanner;

public class Day_5 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int x,y,z;
        System.out.print("Input value x : ");   x=cin.nextInt();
        System.out.print("Input value y : ");   y=cin.nextInt();
        System.out.print("Input value z : ");   z=cin.nextInt();
        
       int max = (x>y&&x>z)?x : (y>x&&y>z)?y : z;
       int min = (x<y&&x<z)?x:(y<x&&y<z)?y:z;
        System.out.println("\nMaximum is : "+max);
        System.out.println("Minimum   is : "+min);
       
    }    
}
