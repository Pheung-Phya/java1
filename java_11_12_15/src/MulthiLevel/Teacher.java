
package MulthiLevel;
public class Teacher extends Staff{
        private String subject;
        public Teacher() {
                 super();
                 subject="Null";
        }
        public Teacher(int id,String name,String gender,double salary,String subject){
                 super(id, name, gender,salary);
                 this.subject=subject;
        }
        public void Input(){
                 super.Input();
                 System.out.print("Enter Subject : "); subject = cin.next();
        }
        public void Output(){
                 super.Output();
                 System.out.printf("%-10s\n",subject);
        }
}
