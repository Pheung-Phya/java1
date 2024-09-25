
package Java_Collection;
import java.util.*;


 class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    // Override equals and hashCode to compare objects by name and age
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    // Override toString for printing the object
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}


//
//public class All_Collection {
//
//    public static void main(String[] args) {
//        // Using List with Person objects
//        List<Person> personList = new ArrayList<>();
//        personList.add(new Person("Alice", 30));
//        personList.add(new Person("Bob", 25));
//        personList.add(new Person("Charlie", 35));
//        
//        System.out.println("List of Persons: ");
//        for (Person p : personList) {
//            System.out.println(p);
//        }
//        
//        // Using Set with Person objects (no duplicates)
//        Set<Person> personSet = new HashSet<>();
//        personSet.add(new Person("Alice", 30));
//        personSet.add(new Person("Bob", 25));
//        personSet.add(new Person("Alice", 30)); // Duplicate will not be added
//        
//        System.out.println("\nSet of Persons (no duplicates): ");
//        for (Person p : personSet) {
//            System.out.println(p);
//        }
//        
//        // Using Queue with Person objects
//        Queue<Person> personQueue = new LinkedList<>();
//        personQueue.add(new Person("Alice", 30));
//        personQueue.add(new Person("Bob", 25));
//        personQueue.add(new Person("Charlie", 35));
//        
//        System.out.println("\nQueue of Persons (FIFO): ");
//        while (!personQueue.isEmpty()) {
//            System.out.println(personQueue.poll()); // Retrieve and remove from queue
//        }
//        
//        // Using Map with Person objects as values
//        Map<String, Person> personMap = new HashMap<>();
//        personMap.put("ID1", new Person("Alice", 30));
//        personMap.put("ID2", new Person("Bob", 25));
//        personMap.put("ID3", new Person("Charlie", 35));
//        
//        System.out.println("\nMap of Persons (Key-Value Pairs): ");
//        for (Map.Entry<String, Person> entry : personMap.entrySet()) {
//            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
//        }
//    }
//}



public class All_Collection {

    public static void main(String[] args) {
        // 1. List (ArrayList)
        List<Person> personList = new ArrayList<>();
        System.out.println("List CRUD Operations:");
        
        // CREATE
        personList.add(new Person("Alice", 30));
        personList.add(new Person("Bob", 25));
        System.out.println("After Create: " + personList);
        
        // READ
        Person firstPerson = personList.get(0);
        System.out.println("Read First Person: " + firstPerson);
        
        // UPDATE
        personList.get(1).setAge(26);
        System.out.println("After Update: " + personList);
        
        // DELETE
        personList.remove(0); // Remove by index
        System.out.println("After Delete: " + personList);
        
        // 2. Set (HashSet)
        Set<Person> personSet = new HashSet<>();
        System.out.println("\nSet CRUD Operations:");
        
        // CREATE
        personSet.add(new Person("Alice", 30));
        personSet.add(new Person("Bob", 25));
        System.out.println("After Create: " + personSet);
        
        // READ
        boolean containsBob = personSet.contains(new Person("Bob", 25));
        System.out.println("Read (Contains Bob): " + containsBob);
        
        // UPDATE (Since sets can't update directly, remove and re-add the updated object)
        personSet.remove(new Person("Bob", 25));
        personSet.add(new Person("Bob", 26)); // Re-add updated Bob
        System.out.println("After Update: " + personSet);
        
        // DELETE
        personSet.remove(new Person("Alice", 30)); // Remove by object
        System.out.println("After Delete: " + personSet);
        
        // 3. Queue (LinkedList)
        Queue<Person> personQueue = new LinkedList<>();
        System.out.println("\nQueue CRUD Operations:");
        
        // CREATE
        personQueue.add(new Person("Alice", 30));
        personQueue.add(new Person("Bob", 25));
        System.out.println("After Create: " + personQueue);
        
        // READ
        Person firstInQueue = personQueue.peek();
        System.out.println("Read First in Queue: " + firstInQueue);
        
        // UPDATE (Queue doesn't support direct update; we remove and re-add)
        personQueue.remove();
        personQueue.add(new Person("Alice", 31)); // Re-add updated Alice
        System.out.println("After Update: " + personQueue);
        
        // DELETE
        personQueue.poll(); // Remove the first element
        System.out.println("After Delete: " + personQueue);
        
        // 4. Map (HashMap)
        Map<String, Person> personMap = new HashMap<>();
        System.out.println("\nMap CRUD Operations:");
        
        // CREATE
        personMap.put("ID1", new Person("Alice", 30));
        personMap.put("ID2", new Person("Bob", 25));
        System.out.println("After Create: " + personMap);
        
        // READ
        Person personByID = personMap.get("ID1");
        System.out.println("Read (Person with ID1): " + personByID);
        
        // UPDATE
        personMap.put("ID2", new Person("Bob", 26)); // Replace Bob with updated version
        System.out.println("After Update: " + personMap);
        
        // DELETE
        personMap.remove("ID1");
        System.out.println("After Delete: " + personMap);
    }
}

