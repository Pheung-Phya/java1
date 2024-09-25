
package Introduction;

import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Introduct_1{
    public static void main(String[] args){
           String name;
           char gender;
           int id;
           Scanner cin = new Scanner(System.in);
           
           System.out.print("Enter id : ");
           id=cin.nextInt();  
           System.out.print("Enter name : ");
           cin.nextLine();
           name=cin.nextLine();
           System.out.print("Enter gender : ");
           gender=cin.next().charAt(0);
           
           System.out.println(id+"\t"+name+"\t"+gender);
            
    }
}
