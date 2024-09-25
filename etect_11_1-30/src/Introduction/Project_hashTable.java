//package Introduction;
//
//import java.util.*;
//
//class Teacher {
//    private int id;
//    private String name;
//    private String position;
//    private float salary;
//
//    public Teacher(int id, String name, String position, float salary) {
//        this.id = id;
//        this.name = name;
//        this.position = position;
//        this.salary = salary;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getPosition() {
//        return position;
//    }
//
//    public float getSalary() {
//        return salary;
//    }
//    
//    @Override
//    public String toString() {
//        return id + "\t" + name + "\t" + position + "\t" + salary;
//    }
//}
//
//public class Project_hashTable {
//
//    public static void main(String[] args) {
//        
//        Hashtable<Integer, Teacher> ht = new Hashtable<>();
//
//       
//        Teacher t1 = new Teacher(12, "mama", "C++", 999.24f);
//        Teacher t2 = new Teacher(13, "papa", "C#", 1000.24f);
//        Teacher t3 = new Teacher(14, "nana", "C", 808.24f);
//
//        // Adding Teacher objects to the Hashtable
//        ht.put(t1.getId(), t1);
//        ht.put(t2.getId(), t2);
//        ht.put(t3.getId(), t3);
//
//        // Iterating over the Hashtable and printing the details of each Teacher
//        for (Map.Entry<Integer, Teacher> entry : ht.entrySet()) {
//            int key = entry.getKey();
//            Teacher teacher = entry.getValue();
//            System.out.println(key + " Details");
//            System.out.println(teacher);
//        }
//
//       
//        System.out.println(ht.containsKey(14)); // true
//
//      
//        System.out.println(ht.contains(t2)); // true
//
//        
//        System.out.println(ht.get(t1.getId())); // Teacher details for t1
//
//     
//        System.out.println(ht.size()); // 3
//    }
//}
