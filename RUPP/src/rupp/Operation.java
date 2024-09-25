
package rupp;

import java.util.Scanner;


public class Operation {

    public static void main(String[] args) {
        int x,y;
        float dev;
        long sum , mul , sub ;
        Scanner cin = new Scanner(System.in);
        System.out.print("Input x : ");
        x=cin.nextInt();
        System.out.print("Input y : ");
        y=cin.nextInt();
        System.out.println("=====================");
        System.out.printf("x = %d , y = %d",x,y);
        sum=x+y;
        mul=x*y;
        sub=x-y;
        dev=x/y;
        System.out.printf("Sum = %ld",sum);
        System.out.printf("Sub = %ld",sub);
        System.out.printf("Mul = %ld",mul);
        System.out.printf("Dev = %.2f",dev);
        
       
    }
    
}
