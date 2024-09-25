
package Java_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

import java.util.ArrayList;

import java.util.ArrayList;

import java.util.ArrayList;

class Student {
    private int id;
    private String name;
    private String gender;
    private double score;

    public Student(int id, String name, String gender, double score) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.score = score;
    }

    public void Input() {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter Id         : ");
        id = cin.nextInt();
        System.out.print("Enter Name   : ");
        name = cin.next();
        System.out.print("Enter Gender : ");
        gender = cin.next();
        System.out.print("Enter Score    : ");
        score = cin.nextDouble();
    }

    public void Output() {
        System.out.println(id + "\t" + name + "\t" + gender + "\t" + score);
    }

    public double getScore() {
        return score;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class Array_List {
    public static void main(String[] args) {
        Student s1 = new Student(104, "Oarith", "male", 90.1);
        Student s2 = new Student(102, "Nara", "male", 80.1);
        Student s3 = new Student(103, "Zith", "female", 90.90);

        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        // Sorting the list by name
      Collections.sort(list, Comparator.comparing(Student::getId).thenComparing(Student::getName));
 //           Collections.sort(list, Comparator.comparing(Student::getId).reversed());
        // Printing the sorted list using an iterator
//             Collections.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student s1, Student s2) {
//                return s2.getName().compareTo(s1.getName()); // Sort descending by name
//            }
//        });
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            Student stu = iterator.next();
            stu.Output();
        }
    }
}
