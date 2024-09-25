
package Introduction;

import java.util.Random;
import java.util.Scanner;

public class Array_2 {
    public static void main(String[] args) {
         int col,row,K = 0,i,j;
         int a[][]=new int[20][20];
         Random ran = new Random();
         Scanner cin = new Scanner(System.in);
         System.out.print("Enter value of Row : ");    row = cin.nextInt();
         System.out.print("Enter value of Column : ");    col = cin.nextInt();
         System.out.println("You Random "+(col*row)+" value");
         
         for(i=0;i<row;i++){
             for(j=0;j<col;j++){
                 a[i][j]=ran.nextInt(10)+1;
                 K = K + a[i][j];
             }
         }
         
         for(i=0;i<row;i++){
             for(j=0;j<col;j++){
                 System.out.print(a[i][j]+"  ");
             }
             System.out.println("");
         }
         System.out.println("");
         System.out.println("Total of value is = "+K);
         
    }
}
