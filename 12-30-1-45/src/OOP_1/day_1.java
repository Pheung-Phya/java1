
package OOP_1;

import java.util.Scanner;

class Test{
    private int x;
    private int y;
    private int z;
    public void Input(){
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter value x : ");  x=cin.nextInt();
        System.out.print("Enter value y : ");  y=cin.nextInt();
        System.out.print("Enter value z : ");  z=cin.nextInt();
    } 
     private int sum(){
        return x+y;
    }
    private int sum1(){
        return x+y+z;
    }
    public void Output(){
        System.out.println("x = "+x);
    }
    public void setX(int x){
        if(x>=0){
            this.x=x;
        }else{
            System.out.println("x can not be zero.");
        }
    }
}

public class day_1 {
    public static void main(String[] args) {
        Test t = new Test();
        t.Input();
        
        t.setX(-1);
        t.Output();
    }   
}
