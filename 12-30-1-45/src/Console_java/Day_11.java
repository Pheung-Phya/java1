
package Console_java;
import java.util.Random;
import java.util.Scanner;
public class Day_11 {
    public static void main(String[] args) {
         int arr[] = new int[30];
         int i,n = 0,op;
         Scanner cin = new Scanner(System.in);
         Random ran = new Random();
         while(true){
             System.out.println("[1]. Random Value");
             System.out.println("[2]. Output Value");
             System.out.println("[3]. Search Value");
             System.out.println("[4]. Exit Program");
             System.out.println("===================");
             System.out.print("Please select one => ");
             op = cin.nextInt();
             switch(op){
                 case 1->{
                     System.out.print("How many value do you want to random : ");
                     n=cin.nextInt();
                     for(i=0;i<n;i++){
                         arr[i]=ran.nextInt(50)+1;
                     }
                 }
                 case 2->{
                     for(i=0;i<n;i++){
                            System.out.printf("Value arr[%d] : %d\n",i,arr[i]);
                     }
                 }
                 case 3->{
                        int search;
                        boolean f=false;
                        System.out.println("Which number do you want to search : ");
                        search=cin.nextInt();
                        for(int a : arr){
                            if(search==a){
                                f=true;
                            }
                        }
                        if(f){
                            System.out.println("It has number "+search+" in my list");
                        }else{
                            System.out.println("It doesn't has number "+search+" in my list");
                        }
                 }
                 case 4->{
                     System.exit(0);
                 }
                 default->{
                     System.out.println("Wrong option\n");
                 }
             }
         }
         
    }   
}
