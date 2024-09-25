
package Console_java;

import java.util.Scanner;

public class Day_8 {
    
    void Revers(){
        String str;
        int leng;
        String text="";
        Scanner cin = new Scanner(System.in);
        System.out.print("Input Some String : "); str=cin.nextLine();
        leng=str.length();
        System.out.println("Length str has : "+leng);
        for(int i=leng-1;i>=0;i--){
                text +=str.charAt(i);
        }
        System.out.println(text);
    }
    
    Day_8(){
        Revers();
    }
   
    public static void main(String[] args) {
        new Day_8();
    }
}
