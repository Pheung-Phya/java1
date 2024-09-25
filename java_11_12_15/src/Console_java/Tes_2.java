
package Console_java;
import java.util.Scanner;
public class Tes_2 {
    public static void main(String[] args) {
         int id;
         String name;
         Scanner cin = new Scanner(System.in);
         System.out.print("Enter your ID : ");
         id =  cin.nextInt();
         System.out.print("Enter your Name : ");
         name= cin.next();
         System.out.println("Id = "+id+" ,, Name = "+name);
    }   
}
