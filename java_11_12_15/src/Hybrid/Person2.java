package Hybrid;
import java.util.Scanner;
public class Person2 {
         private String id,name,gender,address,dob; 
         Scanner cin = new Scanner(System.in);
         public Person2() {
                  id=name=gender=address=dob="don't know";
         }
         public Person2(String id, String name, String gender, String address, String dob) {
                 this.id = id;
                 this.name = name;
                 this.gender = gender;
                 this.address = address;
                 this.dob = dob;
        }
         public void Input(){
                  System.out.print("Enter Id           : "); id=cin.next();
                  System.out.print("Enter Name     : "); name=cin.next();
                  System.out.print("Enter Gender   : "); gender=cin.next();
                  System.out.print("Enter Address : "); address=cin.next();
                  System.out.print("Enter DOB        : "); dob=cin.next();
         }
         public void Output(){
                  System.out.printf("%-10s %-10s %-10s %-10s %-15s",id,name,gender,address,dob);
         }         
}
