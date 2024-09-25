package Java_Collection;
import java.util.Hashtable;
import java.util.Map;

public class Hash_Table1 {
        public static void main(String[] args) {
                 Hashtable<Integer,String> ht = new Hashtable<>();
                 Hashtable<Integer,String> ht_copy = new Hashtable<>();
                 ht.put(1, "Apple");
                 ht.put(2, "Peach");
                 ht.put(3, "Banana");                 
                 ht_copy=(Hashtable<Integer, String>)ht.clone();
                 ht.clear();
                 System.out.println(ht);
                 System.out.println(ht_copy);
               
        }    
}
