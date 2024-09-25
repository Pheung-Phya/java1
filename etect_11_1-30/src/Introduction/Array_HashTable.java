
package Introduction;

import java.util.Hashtable;
import java.util.Map;
public class Array_HashTable {

    public static void main(String[] args) {
        Hashtable<String,Integer> hm = new Hashtable<String,Integer>();
        hm.put("k1", 111);
        hm.put("k2", 222);
        hm.put("k3", 333);
        int a= hm.get("k1");
        
        System.out.println(a);
        
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+ "   "+m.getValue());
         }
    }
    
}



//import java.util.ArrayList;
//import java.util.Hashtable;
//import java.util.Map;
//import java.util.Scanner;
//
//class Teacher {
//    private int id;
//    private String name;
//    private String gender;
//    private float salary;
//
//    public Teacher() {
//        id = 0;
//        name = "null";
//    }
//
//    public Teacher(int id, String name, String gender, float salary) {
//        this.id = id;
//        this.name = name;
//        this.gender = gender;
//        this.salary = salary;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void Input() {
//        Scanner cin = new Scanner(System.in);
//        System.out.print("Enter ID         : ");
//        id = cin.nextInt();
//        System.out.print("Enter Name   : ");
//        cin.nextLine();
//        name = cin.nextLine();
//        System.out.print("Enter Gender : ");
//        gender = cin.nextLine();
//        System.out.print("Enter Salary   : ");
//        salary = cin.nextFloat();
//    }
//
//    public void Output() {
//        System.out.printf("%10d %10s %10s %10.2f$\n", id, name, gender, salary);
//    }
//
//    public String toString() {
//        return id + "\t\t" + name + "\t\t" + gender + "\t\t" + salary + "$";
//    }
//}
//
//public class Array_HashTable {
//
//    public static void main(String[] args) {
//        Hashtable<Integer, Teacher> teacherTable = new Hashtable<>();
//        Scanner cin = new Scanner(System.in);
//        int option;
//        do {
//            System.out.println("[1]. Add");
//            System.out.println("[2]. View");
//            System.out.println("[3]. Search");
//            System.out.println("[4]. Update");
//            System.out.println("[5]. Remove");
//            System.out.println("[6]. Insert");
//            System.out.println("[7]. Sort by ID");
//            System.out.print("Please select one option => ");
//            option = cin.nextInt();
//            switch (option) {
//                case 1 -> {
//                    System.out.print("How many Teachers do you want to input : ");
//                    int n = cin.nextInt();
//                    for (int i = 0; i < n; i++) {
//                        Teacher t = new Teacher();
//                        t.Input();
//                        teacherTable.put(t.getId(), t);
//                    }
//                }
//                case 2 -> {
//                    for (Map.Entry<Integer, Teacher> M : teacherTable.entrySet()) {
//                      //  System.out.println(M.getValue().toString());
//                        M.getValue().Output();
//                    }
//                }
//                case 3 -> {
//                    System.out.print("Enter id to search : ");
//                    int searchId = cin.nextInt();
//                    Teacher teacher = teacherTable.get(searchId);
//                    if (teacher != null) {
//                        teacher.Output();
//                    } else {
//                        System.out.println("Teacher not found.");
//                    }
//                }
//                case 4 -> {
//                    System.out.print("Enter id to update : ");
//                    int updateId = cin.nextInt();
//                    Teacher teacher = teacherTable.get(updateId);
//                    if (teacher != null) {
//                        teacher.Input();
//                        teacherTable.put(updateId, teacher);
//                    } else {
//                        System.out.println("Teacher not found.");
//                    }
//                }
//                case 5 -> {
//                    System.out.print("Enter id to delete : ");
//                    int deleteId = cin.nextInt();
//                    teacherTable.remove(deleteId);
//                }
//                case 6 -> {
//                    System.out.print("Enter id to insert : ");
//                    int insertId = cin.nextInt();
//                    if (teacherTable.containsKey(insertId)) {
//                        Teacher t = new Teacher();
//                        t.Input();
//                        teacherTable.put(insertId, t);
//                    } else {
//                        System.out.println("Teacher not found.");
//                    }
//                }
//                case 7 -> {
//                    // Create an array from the entries and sort by ID
//                    ArrayList<Map.Entry<Integer, Teacher>> entryList = new ArrayList<>(teacherTable.entrySet());
//                    entryList.sort(Map.Entry.comparingByKey());
//                    for (Map.Entry<Integer, Teacher> entry : entryList) {
//                        System.out.println(entry.getValue().toString());
//                    }
//                }
//            }
//        } while (true);
//    }
//}
