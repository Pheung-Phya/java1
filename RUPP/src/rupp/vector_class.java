
package rupp;

import java.util.Scanner;
import java.util.Vector;

class Lecturer{
    private String id,name;
    private double rate,hour;

    public Lecturer(String id, String name, double rate, double hour) {
        this.id = id;
        this.name = name;
        this.rate = rate;
        this.hour = hour;
    }
   
    public Lecturer() {
    }
    public double Total(){
        return hour*rate;
    }
    
    public String toString() {
        return id+"\t"+name+"\t"+hour+"\t"+rate+"\t"+Total();
    }
    public void Input(){
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter Id       : ");  id=cin.next();
        System.out.print("Enter Name : ");  name=cin.next();
        System.out.print("Enter Hour   : ");  hour=cin.nextDouble();
        System.out.print("Enter Rate    :  "); rate = cin.nextDouble();
    }
}
public class vector_class {

    public static void main(String[] args) {
       Vector <Lecturer> list = new Vector<>();
       int n,i;
       while(true){
           System.out.println("Enter ");
           
       }
    }
    
}
