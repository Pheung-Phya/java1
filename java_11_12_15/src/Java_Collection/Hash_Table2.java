
package Java_Collection;
import java.util.Hashtable;
import java.util.Map;

public class Hash_Table2 {
    public static void main(String[] args) {
         Hashtable <String,Student> ht = new Hashtable<>();
         ht.put("A", new Student(101, "Narith", "Male", 90));
         ht.put("B", new Student(102, "Satan", "Male", 80));
         ht.put("C", new Student(103, "Rasmach", "Male", 85));
         ht.put("D", new Student(104, "Chilong", "Female", 70));
         
        for(Map.Entry<String,Student> m : ht.entrySet()){
                  String key = m.getKey();
                  Student stu = m.getValue();
                  System.out.println(key + " : "+stu.id +" "+stu.name+" "+stu.gender+" "+stu.score);  
                 // stu.Output();
        }
         
         
    }  
}
