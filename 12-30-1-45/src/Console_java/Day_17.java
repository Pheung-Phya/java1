//
//package Console_java;
//
//import java.util.Hashtable;
//import java.util.Map;
//
//class Student{
//    int id;
//    String name;
//    String gender;
//    public Student(int id, String name, String gender) {
//        this.id = id;
//        this.name = name;
//        this.gender = gender;
//    }   
//}
//
//public class Day_17 {
//    public static void main(String[] args) {
//        Hashtable<String,Student> ht = new Hashtable<>();
//        Student s1=new Student(1, "Rochona", "Male");
//        Student s2=new Student(2, "Vicheka", "Male");
//        Student s3 = new Student(3, "Ousa", "Male");
//        Student s4 = new Student(4, "Cheng", "Female");
//        
//        ht.put("A", s1);
//        ht.put("B",s2);
//        ht.put("C", s3);
//        ht.put("D",s4);
//        for(Map.Entry map:ht.entrySet()){
//                  String key = (String) map.getKey();
//                  Student obj = (Student) map.getValue();
//                  System.out.println(key+" : "+obj.id+"   "+obj.name+"   "+obj.gender);
//        }
//    }    
//}
