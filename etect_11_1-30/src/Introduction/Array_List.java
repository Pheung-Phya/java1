
package Introduction;

import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class Array_List {

    public static void main(String[] args) {
          ArrayList<String> list =new ArrayList<String>();
          list.add("hello");
          list.add("bi");
          list.add("bi");
          list.add("wellcome");
          System.out.println(list);
          //list.clear();
         //System.out.println( list.contains("hi"));
        // System.out.println(list.get(2));
        //list.set(0, "Ohaio");
//        list.remove(0);
//        list.remove("hi");
 //      System.out.println(list.size());
         Collections.sort(list);
         list.remove("bi");
          System.out.println(list);
          
//          for(int i=0;i<list.size();i++){
//              System.out.print(list.get(i));
//          }
    } 
}
