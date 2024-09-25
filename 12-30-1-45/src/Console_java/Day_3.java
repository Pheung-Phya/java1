
package Console_java;

import java.util.Scanner;

public class Day_3 {
    public static void main(String[] args) {
     String gender;
     Scanner cin = new Scanner(System.in);
     
        System.out.print("Enter Your Gender [Male or Female] : ");
        gender = cin.next();
        if(gender.equalsIgnoreCase("male")){
            System.out.println("So, You are Man");
        }else{
            System.out.println("So, You are Female");
        }
    }
}
