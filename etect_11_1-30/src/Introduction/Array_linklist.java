
package Introduction;

import java.util.LinkedList;

public class Array_linklist {

    public static void main(String[] args) {
//        LinkedList<String> list = new LinkedList<String>();
//        list.add("Hi");
//        list.add("hello");
//        list.add("wellcome");
//        System.out.println(list);
//        
//        list.addFirst("first");
//        System.out.println(list);
//        
//        list.addLast("last");
//        System.out.println(list);
//        
//        list.add(1, "index1");
//        System.out.println(list);
//        
//        list.remove(0);
//        System.out.println(list);
//        
//        System.out.println( list.indexOf("last"));
//        System.out.println(list.get(3));
        
        LinkedList list = new LinkedList();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
      
        list.addLast(4);
        list.addLast(5);
       
        
        // Convert the linked list to an array and print it
        Object[] array = list.toArray();
        for (Object i : array) {
            System.out.print(i + " ");
        }
        System.out.println(); // Output: 1 2 3 4 5
        
        list.removeFirst();
        
        list.removeLast();
       
    }
    
}
