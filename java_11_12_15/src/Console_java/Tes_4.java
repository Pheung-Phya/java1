
package Console_java;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Tes_4 {
    public static void main(String[] args) {
         int code,qty;
         String name;
         float price,totalD,totalR;
         Scanner cin = new Scanner(System.in);
         DecimalFormat df = new DecimalFormat("#,##0.00");
         System.out.print("Enter Code  : ");    code = cin.nextInt();
         System.out.print("Enter Name : ");    cin.nextLine(); name = cin.nextLine();
         System.out.print("Enter QTY    : ");    qty = cin.nextInt();
         System.out.print("Enter Price  : ");      price = cin.nextFloat();
         totalD = qty * price;
         totalR = totalD * 4100;
         System.out.println("Product Code  : "+code);
         System.out.println("Product Name : "+name);
         System.out.println("Product QTY    : "+qty);
         System.out.println("Product Price  : "+df.format(price)+" $");
         System.out.println("==================");
         System.out.println("Product Total Dollar : "+df.format(totalD)+" $");
         System.out.println("Product Total Riel     : "+df.format(totalR)+" riel");
    }  
}
