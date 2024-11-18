
package MulthiLevel;
public class MainMulthi {
    public static void main(String[] args) {
         Person p = new Person(101,"Nana","Male");
         p.Output();
         System.out.println("");
         
         Staff s = new Staff(102,"Ning" ,"Female", 500);
         s.Output();
         System.out.println("");
         
         Teacher t = new Teacher(103, "Nong", "Male", 550, "Database");
         t.Output();
    }   
}
