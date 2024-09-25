
package rupp;

import java.util.Scanner;


public class Salary_teacher {
    public static void main(String args[]){
        String name;
        float rate,hour,pay,income,tax,salary;
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter Name   : ");    name=cin.nextLine();
        System.out.print("Enter Salary : ");    salary=cin.nextFloat();
        System.out.print("Enter Hour   : ");    hour=cin.nextFloat();
        System.out.print("Enter Rate   : ");    rate=cin.nextFloat();
        income = salary + (hour * rate);
        
        if(income<=125){
            tax=0;
        }else if(income <=300){
            tax = (income-125)*0.02f;
        }else if(income <=500){
            tax = (300-125)*0.02f + (income-300)*0.04f;
        }else if(income <=1000){
            tax = (300-125)*0.02f + (500-300)*0.04f + (income-500)*0.06f;
        }else{
            tax = (300-125)*0.02f + (500-300)*0.04f + (1000-500)*0.06f + (income-1000)*0.1f;
        }
        pay = income - tax;
        System.out.println("Name : "+name);
        System.out.println("Salar : "+salary +" $");
        System.out.println("Hour : "+hour+" h");
        System.out.println("Rate : "+rate+" $");
        System.out.println("Income : "+income+" $");
        System.out.println("Tax : "+tax+" $");
        System.out.println("Paid : "+pay+" $");
    }
}
