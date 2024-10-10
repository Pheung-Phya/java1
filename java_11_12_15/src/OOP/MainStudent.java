package OOP;
import java.util.ArrayList;
import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
         ArrayList<Student> list = new ArrayList<>();
         Student stu1;
         int id,n;
         String name,gender;
         float score;
         Scanner cin = new Scanner(System.in);
         System.out.print("Enter Number of Student : ");
         n = cin.nextInt();
         for(int i=0;i<n;i++){
                  System.out.print("Enter Id        :  ");  id=cin.nextInt();
                  System.out.print("Enter Name  :  "); cin.nextLine(); name=cin.nextLine();
                  System.out.print("Enter Gender: "); gender=cin.next();
                  System.out.print("Enter Score   : "); score=cin.nextFloat();
                  stu1 = new Student(id, name, gender, score);
                  list.add(stu1);
         }
         for(Student st : list){
                  System.out.println(st.toString());
         }
    }   
}
