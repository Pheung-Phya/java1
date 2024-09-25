package Introduction_java.collection_all;
import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        // ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        System.out.println("ArrayList:");
        System.out.println(arrayList.get(0));
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        // LinkedList
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Red");
        linkedList.add("Green");
        linkedList.add("Blue");
        linkedList.add("Blue");
        System.out.println("\nLinkedList:");
        System.out.println(linkedList.get(0));
        for (String color : linkedList) {
            System.out.println(color);
        }

        // HashSet
        Set<String> hashSet = new HashSet<>();
         Set<Integer> hashSt = new HashSet<>();
         hashSt.add(1);
         hashSt.add(1);
         System.out.println();
        hashSet.add("Cat");
        hashSet.add("Dog");
        hashSet.add("Bird");
        hashSet.add("Dog");
        System.out.println("\nHashSet:");
        for (String animal : hashSet) {
            System.out.println(animal);
        }

        // TreeSet
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Zebra");
        treeSet.add("Elephant");
        treeSet.add("Lion");
        
        System.out.println("\nTreeSet:");
        for (String animal : treeSet) {
            System.out.println(animal);
        }

        // HashMap
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        System.out.println("\nHashMap:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // TreeMap
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        System.out.println("\nTreeMap:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // PriorityQueue
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(3);
        priorityQueue.offer(1);
        priorityQueue.offer(2);
        System.out.println("\nPriorityQueue:");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }

        // LinkedList (as Deque)
        Deque<String> deque = new LinkedList<>();
        deque.addFirst("First");
        deque.addLast("Last");
        System.out.println("\nDeque (LinkedList):");
        while (!deque.isEmpty()) {
            System.out.println(deque.pollFirst());
        }

        // LinkedHashMap
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "One");
        linkedHashMap.put(2, "Two");
        linkedHashMap.put(3, "Three");
        System.out.println("\nLinkedHashMap:");
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
