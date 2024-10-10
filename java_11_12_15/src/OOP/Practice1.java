
package OOP;
import java.util.Scanner;

class Employee{
        private String id,name,gender;
        private double salary;
        public void Input(){
                  Scanner cin = new Scanner(System.in);
                  System.out.print("Enter Id         : "); id=cin.next();
                  System.out.print("Enter Name   : "); name=cin.next();
                  System.out.print("Enter Gender : "); gender=cin.next();
                  System.out.print("Enter Salary   : "); salary=cin.nextDouble();
        }
        public void Output(){
                  System.out.printf("%-10s %-10s %-10s %-10.2f\n",id,name,gender,salary);
        }
        static void Show(){
                  System.out.println("Hello Static");
        }
}

public class Practice1 {
        public Practice1(){
                Employee emp1,emp2;
                emp1=new Employee();
                emp1.Input();
                emp1.Output();

                System.out.println("");
                emp2=new Employee();
                emp2.Input();
                emp2.Output();
        }
    public static void main(String[] args) {
        
         new Practice1();
    }   
}
