
package OOP;

import java.util.Scanner;

class Person{
        private String id,name,gender,address,dob;
        Scanner cin = new Scanner(System.in);
        public Person(){
                  id=name=gender=address=dob="N/A!";
        }
        public Person(String id,String name,String gender,String address,String dob){
                  this.id=id;
                  this.name=name;
                  this.gender=gender;
                  this.address=address;
                  this.dob=dob;
        }
        public void Input(){
                 System.out.print("Enter Id           : "); id=cin.next();
                 System.out.print("Enter Name     : "); name=cin.next();
                 System.out.print("Enter Gender   : "); gender=cin.next();
                 System.out.print("Enter Address : "); address=cin.next();
                 System.out.print("Enter DOB        : "); dob=cin.next();
        }
        public void Output(){
                 System.out.printf("%-10s %-10s %-10s %-10s %-10s",id,name,gender,address,dob);
        }
        public String toString() {
            return "Person{" + "id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address + ", dob=" + dob +  '}';
        }      
}

class Employee extends Person{
        private double rate,salary;
        private int hour;

        public Employee() {
                  super();
                  rate=salary=0.0;
                  hour=0;
        }

        public Employee(double rate, double salary, int hour, String id, String name, String gender, String address, String dob) {
            super(id, name, gender, address, dob);
            this.rate = rate; 
            this.salary = salary;
            this.hour = hour;
        }
        public void Input(){
                super.Input();
                System.out.print("Enter Salary : "); salary = cin.nextDouble();
                System.out.print("Enter Rate    : "); rate = cin.nextDouble();
                System.out.print("Enter Hour    : "); hour = cin.nextInt();
        }
        double Income(){
                  return salary+(rate*hour);
        }
        public void Output(){
                  super.Output();
                  System.out.printf("%-10.2f %-10.2f %-10d %-10.2f\n",salary,rate,hour,Income());
        }

    @Override
    public String toString() {
        String base = super.toString();
        return base+"\nEmployee{" + "rate=" + rate + ", salary=" + salary + ", hour=" + hour + '}';
    }
        
}

public class MainClass1 {
    public static void main(String[] args) {
        Employee emp = new Employee(10, 250, 10, "101", "CEO", "Male", "PP", "10-10-1010");
        System.out.println(emp.toString());
        
    }    
}
