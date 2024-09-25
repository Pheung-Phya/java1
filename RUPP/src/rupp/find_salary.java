
package rupp;

import java.util.Scanner;

public class find_salary {

    
    public static void main(String[] args) {
       int salary;
       int n,s;
       Scanner cin= new Scanner(System.in);
        System.out.print("Input salary : ");
        salary=cin.nextInt();
        n=salary/100;
        s=salary%100;
        System.out.println("100 dollar has : "+n);
        n=s/50;
        s=s%50;
        System.out.println("50 dollar has : "+n);
        n=s/20;
        s=s%20;
        System.out.println("20 dollar has : "+n);
        n=s/10;
        s=s%10;
        System.out.println("10 dollar has : "+n);
        n=s/5;
        s=s%5;
        System.out.println("5 dollar has : "+n);
        n=s/2;
        s=s%2;
        System.out.println("2 dollar has : "+n);
        n=s/1;
        s=s%1;
        System.out.println("1 dollar has : "+n);
    }
    
}
