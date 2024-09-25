
package Introduction_java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tes_collection {

    
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("welcom");
        list.add("home");
        list.add("dont");
        Iterator<String> itr = list.iterator();
    //    Iterator itr = list.iterator();
        while(itr.hasNext()){
//            String element = itr.next();
//            if(element.equals("home"))
            System.out.println(itr.hasNext());
        }
//        List<String> list = new ArrayList<>();
//list.add("Apple");
//list.add("Banana");
//list.add("Orange");
//
//Iterator<String> itr = list.iterator();
//while(itr.hasNext()) {
//    String element = itr.next();
//    if (element.equals("Apple")) {
//        System.out.println(element);
//        break; // Once "Apple" is found, exit the loop
//    }
//}

       
    }
    
}
