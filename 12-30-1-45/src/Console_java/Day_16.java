package Console_java;

import java.util.ArrayList;
import java.util.Scanner;

class Student{
    int id;
    String name;
    String gender;
    public Student(int id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }
    void Output(){
        System.out.printf("%-10d %-10s %-10s\n",id,name,gender);
    }
}

public class Day_16 {
    public static void main(String[] args) {
         Student s1=new Student(12,"kaka", "female");
         Student s2=new Student(13,"mama", "male");
         Student s3=new Student(14,"tata", "female");
         ArrayList<Student> list = new ArrayList<Student>();
         list.add(s1);
         list.add(s2);
         list.add(s3);
         for(int i=0;i<list.size();i++){
             list.get(i).Output();
         }
         System.out.println("============> Search <===============");
         int search;
         Scanner cin = new Scanner(System.in);
         System.out.println("Which id do you want to search : ");
         search=cin.nextInt();
         for(int i=0;i<list.size();i++){
             if(search==list.get(i).id){
                 list.get(i).Output();
             }
         }
         
         System.out.println("============> Update <===============");
         int update;
         System.out.println("Which id do you want to update : ");
         update=cin.nextInt();
         for(int i=0;i<list.size();i++){
             if(update==list.get(i).id){
                 Student s4 = new Student(200,"Moha sak", "male");
                 list.set(i, s4);
             }
         }
         
         for(int i=0;i<list.size();i++){
             list.get(i).Output();
         }
    }
}
