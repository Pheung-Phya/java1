
package OOP.Heirarchical;

public class Student1 extends Person{
        private float score;
        public Student1() {
                 super();
                 score=0.0f;
        }
        public Student1(float score, int id, String name, String gender) {
                 super(id, name, gender);  // សម្រាប់ហៅ constructor with param
                 this.score = score;
        }   
        public void Input(){
                 super.Input();
                 System.out.print("Enter Score : "); score=cin.nextFloat();
        }
        public void Output(){
                 super.Output();
                 System.out.printf("%-10.2f\n",score);
        }
}

