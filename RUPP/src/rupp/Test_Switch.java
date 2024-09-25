
package rupp;

import java.util.Scanner;


public class Test_Switch {

    
    public static void main(String[] args) {
        
        Scanner cin = new Scanner(System.in);
        int code;
        System.out.print("Enter Code : ");
        code=cin.nextInt();
        
        switch(code){
            case 1->{
                System.out.println("Number 1 : ");
                break;
            }
            case 2->{
                System.out.println("Number 2 : ");
                break;
            }
            case 3->{
                System.out.println("Number 3 : ");
                break;
            }
            case 4->{
                System.out.println("Number 4 : ");
                break;
            }
            default->{
                System.out.println("Wrong option:");
            }
        }
        
        
        
    }
    
}
