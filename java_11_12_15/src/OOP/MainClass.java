package OOP;
import java.util.Scanner;

class Person{
        protected int id;
        protected String name,gender;
         Scanner cin = new Scanner(System.in);
        public Person(){
                  id=0;
                  name=gender="N/A!";
        }
        public Person(int id,String name,String gender){
                  this.id=id;
                  this.name=name;
                  this.gender=gender;
        }
        public void Input(){                 
                  System.out.print("Enter Id          : "); id=cin.nextInt();
                  System.out.print("Enter Name    : "); name=cin.next();
                  System.out.print("Enter Gender : ");  gender=cin.next();
        }
        public void Output(){
                  System.out.printf("%-10d %-10s %-10s",id,name,gender);
        }
}

class Student extends Person{
        private float score;
        public Student(){
                  super();
                  score=0.0f;   
        }
        public Student(int id,String name,String gender,float score){
                  super(id,name,gender);
                  this.score=score;
        }
        public void Input(){
                  super.Input();
                  System.out.print("Enter Score : "); score=cin.nextFloat();
        }
        public void Output(){
                  super.Output();
                  System.out.printf("%-10.2f \n",score);
        }
}

public class MainClass {
    public static void main(String[] args) {
         Student stu=new Student(102,"Chea ta","female",90);
         stu.Output();
    }  
}
