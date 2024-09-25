
package Introduction;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Array_ {
        public static void main(String[] args) {
                int a[]=new int[100];
                int i,n = 0,op;
                Scanner cin = new Scanner(System.in);
                Random ran =new Random();
                while(true){
                        System.out.println("1. Random value");
                        System.out.println("2. Output");
                        System.out.println("3. Search");
                        System.out.println("4. Update");
                        System.out.println("5. Delete");
                        System.out.print("Select one option => ");
                        op=cin.nextInt();
                        switch(op){
                                case 1:{
                                    System.out.print("Enter value n : ");  n = cin.nextInt();
                                    for(i=0;i<n;i++){
                                        a[i]=ran.nextInt(100)+1;
                                    }
                                    System.out.println("Random value success!\n");
                                    break;
                                }
                                case 2:{
                                    for(i=0;i<n;i++){
                                        System.out.print(a[i]+"  ");
                                    }
                                    System.out.println("\n");
                                    break;
                                }
                        }
                }          
        }  
}
