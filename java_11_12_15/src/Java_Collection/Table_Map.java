
package Java_Collection;
import java.util.Hashtable;
import java.util.HashMap;

public class Table_Map {
    public static void main(String[] args) {
       
        Hashtable<String, String> hashtable = new Hashtable<>();
        
   
        hashtable.put("1", "Apple");
        hashtable.put("2", "Banana");
        hashtable.put("3", "Cherry");

        // Uncommenting the following line would throw a NullPointerException
        // hashtable.put(null, "Mango");  // Hashtable does not allow null keys
        // hashtable.put("4", null);      // Hashtable does not allow null values

        System.out.println("Hashtable:");
        for (String key : hashtable.keySet()) {
            System.out.println(key + " : " + hashtable.get(key));
        }

      
        HashMap<String, String> hashmap = new HashMap<>();
        
        // Adding key-value pairs to HashMap
        hashmap.put("1", "Apple");
        hashmap.put("2", "Banana");
        hashmap.put("3", "Cherry");
        hashmap.put(null, "Mango");  // HashMap allows null key
        hashmap.put("4", null);      // HashMap allows null values

        System.out.println("\nHashMap:");
        for (String key : hashmap.keySet()) {
            System.out.println(key + " : " + hashmap.get(key));
        }

        // Demonstrating thread-safety difference
        System.out.println("\nThread-safety demonstration:");
        
        // Hashtable is thread-safe, so multiple threads can safely access it without synchronization.
        new Thread(() -> {
            synchronized (hashtable) {
                System.out.println("Thread 1 accessing Hashtable");
                hashtable.put("5", "Grapes");
            }
        }).start();

        new Thread(() -> {
            synchronized (hashtable) {
                System.out.println("Thread 2 accessing Hashtable");
                hashtable.put("6", "Pineapple");
            }
        }).start();

        // HashMap is not thread-safe, so if accessed by multiple threads, it may lead to data inconsistency.
        new Thread(() -> {
            synchronized (hashmap) {
                System.out.println("Thread 1 accessing HashMap");
                hashmap.put("5", "Grapes");
            }
        }).start();

        new Thread(() -> {
            synchronized (hashmap) {
                System.out.println("Thread 2 accessing HashMap");
                hashmap.put("6", "Pineapple");
            }
        }).start();
    }
}
