
package Console_java;
import java.util.Hashtable;
import java.util.Map;

public class Day_19 {
    public static void main(String[] args) {
        Hashtable<String,Day_19_class> ht = new Hashtable<>();
        Day_19_class obj1=new Day_19_class("Apple", "n", "Use for eating");
        Day_19_class obj2=new Day_19_class("Book", "n", "Use for reading");
        Day_19_class obj3=new Day_19_class("Car", "n", "use for riding");
        ht.put("1", obj1);
        ht.put("2", obj2);
        ht.put("3", obj3);
        for(Map.Entry map:ht.entrySet()){
            String key = (String) map.getKey();
            Day_19_class value = (Day_19_class) map.getValue();
            value.Output();
        }
        
    }    
}
