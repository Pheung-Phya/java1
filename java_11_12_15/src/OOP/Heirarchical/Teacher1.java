
package OOP.Heirarchical;
public class Teacher1 extends Person{
        private float salary;
        public Teacher1() {
                 super();
                 salary=0.0f;
        }
        public Teacher1(float salary, int id, String name, String gender) {
                super(id, name, gender);
                this.salary = salary;
        }   
         public void Input(){
                 super.Input();
                 System.out.print("Enter Salary : "); salary=cin.nextFloat();
        }
        public void Output(){
                 super.Output();
                 System.out.printf("%-10.2f\n",salary);
        }
}
