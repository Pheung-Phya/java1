
package Java_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;

class Employee{
    private int id;
    private String name,gender;
    private double salary;

    public Employee() {
    }
    public Employee(int id, String name, String gender, double salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }
    void Input(){
         Scanner cin = new Scanner(System.in);
         System.out.print("Enter Id         : "); id=cin.nextInt();
         System.out.print("Enter Name   : "); cin.nextLine(); name=cin.nextLine();
         System.out.print("Enter Gender : "); gender=cin.next();
         System.out.print("Enter Salary   : "); salary = cin.nextDouble();
    }
    void Output(){
         System.out.printf("%-10d %-10s %-10s %-10.2f\n",id,name,gender,salary);
    }

    @Override
    public String toString() {
          return id+"\t"+name+"\t"+gender+"\t"+salary;
    }  
    
    String getName(){
         return name;
    }
    int getId(){
        return id;
    }
    double getSalary(){
        return salary;
    }
}

public class Array_List1 {
    
    
    public static void main(String[] args) {
         ArrayList<Employee> list = new ArrayList<>();
         Employee emp;
         Scanner cin = new Scanner(System.in);
         int i,n = 0,op;        
         
         do{
                    System.out.println("");
                   System.out.println("[1]. Input Information    ");
                   System.out.println("[2]. Output Information ");
                   System.out.println("[3]. Search Information");
                   System.out.println("[4]. Update Information");
                   System.out.println("[5]. Delete Information ");
                   System.out.println("[6]. Sort    Information  ");
                   System.out.println("[7]. For Exit                    ");
                   System.out.println("------------------------------");
                   System.out.print("Please Choose one => ");
                   op=cin.nextInt();
                   switch(op){
                         case 1:{
                                  System.out.print("How many employee do you want to enter : ");
                                  n=cin.nextInt(); // 2
                                  for(i=0;i<n;i++){
                                            emp = new Employee();
                                            emp.Input();
                                            list.add(emp);
                                  }
                                  break;
                         }
                         case 2:{
                                   for(i=0;i<list.size();i++){
                                            list.get(i).Output();
                                           // System.out.println(list.get(i).toString());
                                   }
                                   break;
                         }
                         case 3:{
                                   String search;
                                   System.out.print("Enter name to search : ");
                                   cin.nextLine(); search=cin.nextLine();
                                   for(i=0;i<list.size();i++){
                                            if(search.equalsIgnoreCase(list.get(i).getName())){
                                                    list.get(i).Output();
                                            }                    
                                   }
                                   break;
                         }
                         case 4:{
                                   int update;
                                   System.out.print("Enter id to update : ");
                                   update=cin.nextInt();  // 102
                                   for(i=0;i<list.size();i++){
                                            if(update==list.get(i).getId()){
                                                    emp=new Employee();
                                                    emp.Input();
                                                    list.set(i, emp);
                                                    break;
                                            }
                                   }        
                                   break;
                         }
                         case 5:{
                                   double delete;
                                   System.out.print("Enter salary to delete employee : ");
                                   delete = cin.nextDouble();
                                   for(i=0;i<list.size();i++){
                                            if(delete==list.get(i).getSalary()){
                                                    list.remove(i);
                                                    System.out.println("Delete Success.");
                                                    break;
                                            }
                                   }
                                   break;
                         }
                         case 6:{
                                   Collections.sort(list,Comparator.comparing(Employee::getId));
                                   for(i=0;i<list.size();i++){
                                            list.get(i).Output();
                                   }
                                   break;
                         }
                         
                         case 7:{
                                   System.out.println("Good Bye Lai sin here.!!!\n");
                                   System.exit(1);
                                   break;
                         }
                   }
                   
         }while(true);      
    }   
}
