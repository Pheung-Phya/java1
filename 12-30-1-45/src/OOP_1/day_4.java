
package OOP_1;

class Employee{
        String name;
        String position;
        float salary;
        Employee(){
                  name=position="NONE";
                  salary=0.0f;
        }
        Employee(String Name){
                  this.name=Name;
                  position="NONE";
                  salary=0.0f;
        }
        Employee(String Name,String Position){
                   this.name=Name;
                   this.position=Position;
                   salary=0.0f;
        }
        
        Employee(String Name ,String Position,float Salary){
                   this.name=Name;
                   this.position=Position;
                   this.salary=Salary;
        }
        void Outptu(){
                   System.out.println(name+"\t"+position+"\t"+salary);
        }
}

public class day_4 {
    public static void main(String[] args) {       
         Employee emp=new Employee();
         emp.Outptu();
         
         Employee emp1=new Employee("cheng ching");
         emp1.Outptu();
         
         Employee emp2 = new Employee("Ching chang", "IT");
         emp2.Outptu();
         
         Employee emp3= new Employee("Naja", "Salary", 200.1f);
         emp3.Outptu();
    }  
}
