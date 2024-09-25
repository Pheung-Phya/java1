
package Console_java;
public class Day_7 {      
   
    public static void main(String[] args) {
           int x=500,y=300;
           System.out.println("before call function Swap");
           System.out.println("x = "+x);
           System.out.println("y = "+y);
           
           System.out.println("\nCall funtion Swap()");
           swap(x,y);
           
           System.out.println("\n After call function Swap");
           System.out.println("x = "+x);
           System.out.println("y = "+y);
    } 
   static void swap(int x,int y){
        int temp;
        temp=x;
        x=y;
        y=temp;
        System.out.println("x = "+x);
         System.out.println("y = "+y);
    }
    
    
}
