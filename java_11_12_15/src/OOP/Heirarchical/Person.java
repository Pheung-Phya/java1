
package OOP.Heirarchical;
import java.util.Scanner;

public class Person {
        private int id;
        private String name;
        private String gender;
        public Scanner cin = new Scanner(System.in);
        public Person() {
                 id=0;
                 name=gender="null";
        }
        public Person(int id, String name, String gender) {
                this.id = id;
                this.name = name;
                this.gender = gender;
        }     
        public void Input(){
                 System.out.print("Enter Id         : "); id=cin.nextInt();
                 System.out.print("Enter Name   : "); cin.nextLine();name=cin.nextLine();
                 System.out.print("Enter Gender : "); gender=cin.next();
        }
        public void Output(){
                 System.out.printf("%-10d %-10s %-10s ",id,name,gender);
        }
}
