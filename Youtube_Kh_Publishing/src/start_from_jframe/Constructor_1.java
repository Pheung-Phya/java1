
package start_from_jframe;

import java.util.Scanner;


public class Constructor_1 {

  
    public static void main(String[] args) {
        Class_Constructor_1[] obj ;
        int id,n,i;
        String name;
        float java,cpp;
        Scanner cin = new Scanner(System.in);
       System.out.print("How many students do you want to input : ");
        n=cin.nextInt();
       
         obj = new Class_Constructor_1[n];
         for(i=0;i<n; i ++){
             System.out.printf("-------> Student %d <--------\n",i+1);
             obj[i]=new Class_Constructor_1();
             obj[i].id=cin.nextInt();
             cin.nextLine();
             obj[i].name=cin.nextLine();
             obj[i].java=cin.nextFloat();
             obj[i].cpp=cin.nextFloat();
         }
         for(i=0;i<n;i++){
             obj[i].show();
         }
    }
    
}
