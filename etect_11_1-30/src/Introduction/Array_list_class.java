
package Introduction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Teacher implements Comparable<Teacher> {
    private int id;
    private String name;
    private String gender;
    private float salary;
    public Teacher(){
        id=0;
        name="null";
    }

    public Teacher(int id, String name, String gender, float salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }
    

    public int getId() {
        return id;
    }
    
    public void Input(){
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter ID         : ");   id=cin.nextInt();
        System.out.print("Enter Name   : ");   cin.nextLine(); name=cin.nextLine();
        System.out.print("Enter Gender : ");    gender = cin.nextLine();
        System.out.print("Enter Salary   : ");    salary=cin.nextFloat();
    }
    public void Output(){
        System.out.printf("%10d %10s %10s %10.2f$\n",id,name,gender,salary);
    }

    public String toString() {
        return id+"\t\t"+name+"\t\t"+gender+"\t\t"+salary+"$";
    }    
    
    public int compareTo(Teacher other) {
        return Integer.compare(this.id, other.id);
    }
}

public class Array_list_class {

    public static void main(String[] args) {
        
        ArrayList<Teacher> list=new ArrayList<Teacher>();
        Teacher t =new Teacher();
        Scanner cin = new Scanner(System.in);
        int i,n = 0,option;
        do{
             System.out.println("[1]. Add");
            System.out.println("[2]. View");
            System.out.println("[3]. Search");
            System.out.println("[4]. Update");
            System.out.println("[5]. Remove");
            System.out.println("[6]. Insert");
            System.out.println("[7]. Sort");
            System.out.print("Please select one option => ");
            option=cin.nextInt();
            switch(option){
                case 1->{
                        System.out.print("How many Teacher do you want to input : "); 
                         n=cin.nextInt();
                         for(i=0;i<n;i++){
                             t=new Teacher();
                             t.Input();
                             list.add(t);
                         }
                }
                case 2->{
                        for(i=0;i<list.size();i++){
                                System.out.println(list.get(i).toString());
                                //list.get(i).Output();
                        }
                }
                case 3->{
                        int search;
                        System.out.print("Enter id to search : ");
                        search=cin.nextInt();
                        for(i=0;i<list.size();i++){
                            if(search==list.get(i).getId()){
                                list.get(i).Output();
                            }
                        }
                }
                case 4->{
                    int update;
                    System.out.print("Enter id to update : "); 
                    update = cin.nextInt();
                    for(i=0;i<list.size();i++){
                        if(update==list.get(i).getId()){
                            t=new Teacher();
                            t.Input();
                            list.set(i, t);
                        }
                    }
                }
                case 5->{
                    int delete;
                    System.out.print("Enter id to delete : "); 
                    delete = cin.nextInt();
                    for(i=0;i<list.size();i++){
                        if(delete==list.get(i).getId()){
                            list.remove(i);
                        }
                    }
                }
                case 6->{
                    int insert;
                    System.out.print("Enter id to insert : "); 
                    insert = cin.nextInt();
                    for(i=0;i<list.size();i++){
                        if(insert==list.get(i).getId()){
                            t=new Teacher();
                            t.Input();
                            list.add(i, t);
                            break;
                        }
                    }
                }
                case 7->{  
                    Collections.sort(list);
                   for(i=0;i<list.size();i++){
                       list.get(i).Output();
                   }
                }
            }
        }while(true);
    }
    
}
