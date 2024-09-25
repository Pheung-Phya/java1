package Console_java;

import java.util.Scanner;

public class NewMain {
    public  static void main(String[] args){
        int row,col;
        for (row=1;row<=3;row++){
            for (col=1;col<=6;col++){
                if(col>1 && col<6 && row == 2){
                    System.out.print("   ");
                }else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
}


