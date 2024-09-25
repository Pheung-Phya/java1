
package OOP;

import java.util.Scanner;

class Person{
    protected String id,name,sex,address,dob;
    public Person() {
        id="unknown";
        name="unknown";
        sex="unknown";
        address="unknown";
        dob="unknown";
    }
    public Person(String id, String name, String sex, String address, String dob) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.address = address;
        this.dob = dob;
    } 
    void Input(){
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter ID          : ");   id=cin.next();
        System.out.print("Enter Name    : ");   name=cin.next();
        System.out.print("Enter Sex        : ");    sex = cin.next();
        System.out.print("Enter Address : ");   address = cin.next();
        System.out.print("Enter DOB       : ");    dob=cin.next();
    }
    void Output(){
        System.out.printf("%-10s %-10s %-10s %-10s",id,name,sex,address,dob);
    }
}

class Student extends Person{
   protected float s1,s2,s3;
    public Student() {
        s1=0.0f;
        s2=0.00f;
        s3=0.0f;
    }
    public Student(float s1, float s2, float s3, String id, String name, String sex, String address, String dob) {
        super(id, name, sex, address, dob);
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }
    float Total(){
        return s1+s2+s3;
    }
    void Input() {
        Scanner cin = new Scanner(System.in);
        super.Input(); 
        System.out.print("Enter Score1   : ");   s1 = cin.nextFloat();
        System.out.print("Enter Score2   : ");   s2 = cin.nextFloat();
        System.out.print("Enter Score3   : ");   s3 = cin.nextFloat();
    }
    void Output() {
        super.Output();
        System.out.printf("%-10.2f %-10.2f %-10.2f %-10.2f\n",s1,s2,s3,Total());
    }  
}

class Employee extends Person{
   private float salary;
    public Employee() {
       salary=0.0f;
    }
    public Employee(String id, String name, String sex, String address, String dob,float salary) {
        super(id, name, sex, address, dob);
        this.salary=salary;
    }
    void Input() {
        Scanner cin = new Scanner(System.in);
        super.Input(); 
        System.out.print("Enter Salary   : ");   salary = cin.nextFloat();   
    }
    void Output() {
        super.Output();
        System.out.printf("%-10.2f\n",salary);
    }  
}


public class day_4 {
    public static void main(String[] args) {
           Student stu[]= new Student[10];
           Employee emp[]=new Employee[10];
           int i,op1,op2,j,n=0;
           Scanner cin = new Scanner(System.in);
           
           do{
               System.out.println("[1]. Table Student");
               System.out.println("[2] Table Employee");
               System.out.println("[3] Exit Program");
               System.out.println("---------------------------------------");
               System.out.print("Please Select One Option => ");
               op1=cin.nextInt();
               switch(op1){
                   case 1->{
                       boolean t=true;
                        while(t){
                            System.out.println("[1]. Input");
                            System.out.println("[2]. Output");
                            System.out.println("[3]. Search");
                            System.out.println("[4]. Update");
                            System.out.println("[5]. Back to Table");
                            System.out.println("===================");
                            System.out.print("Choose one option ==> ");
                            op2=cin.nextInt();
                            switch(op2){
                                case 1->{
                                    System.out.print("How many student do you want to input : ");
                                    n=cin.nextInt();
                                    for(i=0;i<n;i++){
                                        stu[i]=new Student();
                                        stu[i].Input();
                                    }
                                }
                                case 2->{
                                    for(i=0;i<n;i++){
                                        stu[i].Output();
                                    }
                                }
                                case 5->{
                                    t=false;
                                }
                            }
                        }
                   }
                   case 2->{
                       
                   }
                   case 3->{
                       System.out.println("==========> Good Bye..!!");
                       System.exit(1);
                   }
                   default->{
                       System.out.println("Please Choose again..!");
                    }
               }
               
           }while(true);
    }
}
