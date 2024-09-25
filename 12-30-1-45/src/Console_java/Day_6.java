
package Console_java;
import java.util.Random;

public class Day_6 {
    public static void main(String[] args) {
      
        int i,j;
        for(i=1;i<=4;i++){
            for(j=1;j<=10;j++){
               if((j>1 && i==2 && j<10) || (j>1 && i==3 && j<10) ){
                   System.out.print("   ");
               }else{
                    System.out.print(" * ");
               }
            }
            System.out.println("");
        }
        
    }   
}
