
package rupp;

import java.util.Scanner;

class Person{
    private String name , gender,phone,address;
    public Person(){
        name="null";
        gender="null";
        phone="00-00-00";
        address="null";
    }

    public Person(String name, String gender, String phone, String address) {
        this.name = name;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
    }
    public void Input(){
        Scanner cin =new Scanner(System.in);
        System.out.print("Enter Name : "); 
        name=cin.nextLine();
        System.out.print("Enter Gender : "); 
        gender=cin.nextLine();
        System.out.print("Enter Phone : "); 
        phone=cin.nextLine();
        System.out.print("Enter Address : "); 
        address=cin.nextLine();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void Output(){
        System.out.print(name+"\t"+gender+"\t"+phone+"\t"+address+"\t");
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String information(){
        String st = getName()+"\t\t"+getGender()+"\t\t"+getPhone()+"\t\t"+getAddress();
        return st;
    }
    
}

class Lecture extends Person{
    private double hour,rate,salary;

    public Lecture() {
        super();
        hour=0.0;
        rate=0.0;
        salary=0.0;
    }

    public Lecture(double hour, double rate, double salary, String name, String gender, String phone, String address) {
        super(name, gender, phone, address);
        this.hour = hour;
        this.rate = rate;
        this.salary = salary;
    }

    @Override
    public void Input() {
        Scanner cin =new Scanner(System.in);
        super.Input();   
        System.out.print("Enter Hour : "); 
        hour=cin.nextDouble();
        System.out.print("Enter Rate : "); 
        rate=cin.nextDouble();
        System.out.print("Enter Salary : "); 
        salary=cin.nextDouble();
    }
    @Override
    public void Output() {
        super.Output(); 
        System.out.println(hour+"\t"+rate+"\t"+salary);
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getHour() {
        return hour;
    }

    public double getRate() {
        return rate;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String getAddress() {
        return super.getAddress(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    public double Income(){
        return salary + (hour * rate);
    }

    @Override
    public String information() {
        return super.information()+getHour()+"\t\t$"+getRate()+"\t\t$"+getSalary()+"\t\t$"+Income();
}
    
    
}

public class exam_1 {
    public static void main(String[] args) {
       
    }
    
}
