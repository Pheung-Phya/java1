
package Console_java;
import java.util.Random;
import java.util.Scanner;
public class Day_10 {
    public static void main(String[] args) {
         int n;
         Scanner cin = new Scanner(System.in);
         Random random = new Random();
         System.out.println("How many number do you want to input : ");
         n = cin.nextInt();
         int arr[]=new int[n];
         for(int i=0;i<n;i++){
                    arr[i] = random.nextInt(50)+1;
         }
         System.out.println("=======================");
         for(int index:arr){
             System.out.println("Array = "+index);
         } 
    }  
}

