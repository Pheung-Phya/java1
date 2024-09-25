
package Introduction_java;

import java.util.Scanner;


public class Use__Scanner {

    public static void main(String[] args) {
//        Scanner cin = new Scanner(System.in);
//        int id;
//        System.out.print("Input id : ");
//        id=cin.nextInt();
//        System.out.print("Input name : ");
//        cin.next();
//        String name;
//        name=cin.nextLine();
//        System.out.println("id = "+id+"  name = "+name);

        Scanner cin = new Scanner(System.in);
         System.out.print("Input name : ");
        String name;
        name=cin.nextLine();
        int id;
        System.out.print("Input id : ");
        id=cin.nextInt();
        cin.nextLine();
        System.out.print("input sex : ");
        String sex=cin.next();
       
        System.out.println("id = "+id+"  name = "+name+" sex = "+sex);
    }
    
}
