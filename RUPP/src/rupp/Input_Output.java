
package rupp;

import java.util.Scanner;


public class Input_Output {

  
    public static void main(String[] args) {
        int code=206;
        String name="phya";
        int age = 20;
        String phone = "0886853732";
        float score = 99.5f;
        System.out.printf("code : %d\n",code);
        System.out.printf("Name : %s\n",name);
        System.out.printf("age : %d\n",age);
        System.out.printf("phone : %s\n",phone);
        System.out.printf("score: %.2f\n",score);
        
       Scanner cin = new Scanner(System.in);
        System.out.print("Input Code : ");
       code = cin.nextInt();
       cin.nextLine();
        System.out.print("Input name : ");
        name = cin.nextLine();
        System.out.print("Input Age : ");
        age = cin.nextInt();
        cin.nextLine();
        System.out.print("Input phone : ");
        phone = cin.nextLine();
        System.out.print("Input Score : ");
        score = cin.nextFloat();
        
    }
    
}
