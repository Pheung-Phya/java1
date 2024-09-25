
package Introduction_java.collection_all;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.*;


public class Collection_10 {

  
    public static void main(String[] args) {
     


     
        /*    List<String> myList = new ArrayList<>();
        myList.add("apple");
        myList.add("banana");
        myList.add("orange");
        System.out.println("List: " + myList);*/

        // Set Example
        Set<Integer> mySet = new HashSet<>();
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(2); // Adding duplicate element, which will not be added
        System.out.println("Set: " + mySet);

        // Queue Example
        Queue<String> myQueue = new LinkedList<>();
        myQueue.add("first");
        myQueue.add("second");
        myQueue.add("third");
        System.out.println("Queue: " + myQueue);

        // Map Example
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("one", 1);
        myMap.put("two", 2);
        myMap.put("three", 3);
        System.out.println("Map: " + myMap);

        // ArrayList Example
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");
        System.out.println("ArrayList: " + arrayList);

        // LinkedList Example
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("orange");
        System.out.println("LinkedList: " + linkedList);

        // HashSet Example
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("orange");
        System.out.println("HashSet: " + hashSet);

        // HashMap Example
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("apple", 1);
        hashMap.put("banana", 2);
        hashMap.put("orange", 3);
        System.out.println("HashMap: " + hashMap);
        
        
        Vector<String> myVector = new Vector<>();

        // Adding elements to the Vector
        myVector.add("apple");
        myVector.add("banana");
        myVector.add("orange");

        // Accessing elements by index
        System.out.println("First element: " + myVector.get(0)); // Output: apple
        System.out.println("Second element: " + myVector.get(1)); // Output: banana

        // Iterating over the Vector
        System.out.println("All elements:");
        for (String fruit : myVector) {
            System.out.println(fruit);
        }

        // Removing an element
        myVector.remove("banana");

        // Size of the Vector after removal
        System.out.println("Size after removal: " + myVector.size()); // Output: 2
    }
}
