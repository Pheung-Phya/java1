
package Hybrid;
public class MainHybrid {
         public static void main(String[] args) {
             System.out.println("class Person");
         Person2 p = new Person2();
         p.Output();
         System.out.println("");
          
             System.out.println("class Employee");
         Employee2 e = new Employee2("101", "nara", "male", "PP", "10-10-2010", 450);
         e.Output();
         System.out.println("");
         
             System.out.println("class Student"); 
         Student2 s = new Student2("101", "nara", "male", "PP", "10-10-2010", 50, 60,70,80,90);
         s.Output();
         System.out.println("");
              
             System.out.println("class Teacher");
         Teacher2 t = new Teacher2();
         t.Input();
         t.Output();
             
         }   
}
