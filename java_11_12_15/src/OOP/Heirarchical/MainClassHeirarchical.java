
package OOP.Heirarchical;
public class MainClassHeirarchical {
    public static void main(String[] args) {
         Student1 stu = new Student1();
         stu.Output();
         stu.Input();
         stu.Output();
         System.out.println("");
         Teacher1 tea = new Teacher1(100, 101,"Vid","Male");
         tea.Output();
    }  
}
