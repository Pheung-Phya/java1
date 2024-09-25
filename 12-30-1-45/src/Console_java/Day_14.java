
package Console_java;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class Day_14 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
          list.add("hello");
          list.add("wellcome");
          list.add("hello world");
          list.add("Halo");
          list.add("Toka");
          System.out.println(list);
          String a="Toka";
          System.out.println(list.contains(a));
          System.out.println(list.contains("hi"));
          list.set(0, "Cambodia");
          System.out.println(list);
    }  
}
