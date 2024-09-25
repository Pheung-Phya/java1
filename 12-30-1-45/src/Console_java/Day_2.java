
package Console_java;
import java.util.Scanner;
public class Day_2 {
    public static void main(String[] args) {
       int code,qty;
       String name;
       char gender;
       float price,totalD,totalR;
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter Product Code : ");      
        code = cin.nextInt();
        System.out.print("Enter Product Name : ");
       name = cin.next();
        System.out.print("Enter Product Quantity : ");
        qty = cin.nextInt();
        System.out.print("Enter Product Price($) : ");
        price = cin.nextFloat();
        
        totalD = qty * price ;
        totalR = qty * (price*4100);
        System.out.println("==================================");
        System.out.println("Product Code      : "+code);
        System.out.println("Product Name     : "+name);
        System.out.println("Product Quantity : "+qty);
        System.out.println("Product Price      : "+price);
        System.out.println("==================================");
        System.out.println("Total Dollar = "+totalD+" $");
        System.out.println("Total Riel     = "+totalR+" reil");
    }
}
