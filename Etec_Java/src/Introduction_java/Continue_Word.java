
package Introduction_java;

import java.util.Scanner;


public class Continue_Word {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.print("Input n : ");
        int n = scaner.nextInt();
        String text="";
        for(int i=0;i<n;i++){
            System.out.print("word-"+(i+1)+" : ");
            String word=scaner.next();
            text+=word + " ";
        }
        System.out.println(text);
    }
    
}
