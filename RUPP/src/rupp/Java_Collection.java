package rupp;
import java.util.*;

public class Java_Collection {
    public static void main(String[] args) {
        // List
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println("List: " + list); // Output: List: [Apple, Banana, Orange]

        // Set
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println("Set: " + set); // Output: Set: [1, 2, 3]

        // Queue
        Queue<String> queue = new LinkedList<>();
        queue.add("First");
        queue.add("Second");
        queue.add("Third");
        System.out.println("Queue: " + queue); // Output: Queue: [First, Second, Third]

        // Deque
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addLast(2);
        System.out.println("Deque: " + deque); // Output: Deque: [1, 2]

        // Map
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        System.out.println("Map: " + map); // Output: Map: {One=1, Two=2, Three=3}

        // TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("One", 1);
        treeMap.put("Two", 2);
        treeMap.put("Three", 3);
        System.out.println("TreeMap: " + treeMap); // Output: TreeMap: {One=1, Three=3, Two=2}

        // TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(2);
        System.out.println("TreeSet: " + treeSet); // Output: TreeSet: [1, 2, 3]

        // LinkedHashMap
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("One", 1);
        linkedHashMap.put("Two", 2);
        linkedHashMap.put("Three", 3);
        System.out.println("LinkedHashMap: " + linkedHashMap); // Output: LinkedHashMap: {One=1, Two=2, Three=3}
    }
}
