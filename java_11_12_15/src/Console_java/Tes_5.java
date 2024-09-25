
package Console_java;

import java.text.DecimalFormat;
import java.util.Scanner;
public class Tes_5 {
    public static void main(String[] args) {
        int code,qty;
        String name;
        float price,total,dis,pay;
        DecimalFormat df = new DecimalFormat("#,##0.00");
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter Id        : "); code = cin.nextInt();
        System.out.print("Enter Name : ");  cin.nextLine(); name = cin.nextLine();
        System.out.print("Enter QTY    : ");   qty = cin.nextInt();
        System.out.print("Enter Price  : ");    price = cin.nextFloat();
        total = qty * price ;
         if(total >=1 && total<=10){
                   dis = 10.0f;
         }else if(total>10 && total<=20){
                    dis = 20.0f;
         }else if(total>20 && total<=30){
                    dis = 30.0f;
         }else{
                    dis = 40.0f;
         }
         pay = total - (dis*total/100);
         System.out.println("=======> Payment <========");
         System.out.println("TOTAL PRICE = "+df.format(total)+"$");
         System.out.println("DISCOUNT      = "+df.format(dis)+"% = "+(total*dis/100)+"$");
         System.out.println("PAYMENT       = "+df.format(pay)+"$");
    }   
}
