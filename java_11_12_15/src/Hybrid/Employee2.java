package Hybrid;
public class Employee2 extends Person2{
         private double salary;
        public Employee2() {
                  super();
                  salary=0.0;                  
        }
        public Employee2(String id, String name, String gender, String address, String dob,double salary ) {
                 super(id, name, gender, address, dob);
                 this.salary = salary;
        }
        public void Input() {
                 super.Input(); 
                 System.out.print("Enter Salary : "); salary = cin.nextDouble();
        }
        public void Output(){
                  super.Output();
                  System.out.printf("%-10.2f\n",salary);
        }         
}
