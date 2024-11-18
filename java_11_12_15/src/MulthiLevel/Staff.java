
package MulthiLevel;
public class Staff extends Person{
        private double salary;
        public Staff() {
                 super();
                 salary=0.0;
        }
        public Staff(int id,String name,String gender,double salary){
                 super(id, name, gender);
                 this.salary=salary;
        }
        public void Input(){
                 super.Input();
                 System.out.print("Enter Salary : "); salary = cin.nextDouble();
        }
        public void Output(){
                 super.Output();
                 System.out.printf("%-10.2f",salary);
        }
}
