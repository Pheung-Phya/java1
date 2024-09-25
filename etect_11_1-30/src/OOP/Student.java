
package OOP;

import java.util.Scanner;

class Student1{
    private int id;
    private String name;
    private String gender;
    private double score;
    
    public void InputData(){
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter Id          :  ");  id=cin.nextInt();
        System.out.print("Enter Name    : ");   cin.nextLine(); name = cin.nextLine();
         System.out.print("Enter Gender : ");    gender = cin.next();
          System.out.print("Enter Score  : ");      score = cin.nextDouble();
    }
        public void OutputData(){
        System.out.println(id+"\t\t"+name+"\t\t"+gender+"\t\t"+score);
    }   
}

