
package Console_java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Day_4 {

    public static void main(String[] args) {
       float s1,s2,s3,total,avg;
       String grade="F";
        Scanner cin = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.00");
        System.out.print("Enter Score1 : ");    s1=cin.nextFloat();
        System.out.print("Enter Score2: ");    s2=cin.nextFloat();
        System.out.print("Enter Score3 : ");    s3=cin.nextFloat();
        total=s1+s2+s3;
        avg=total/3;
        if(avg<50){
            grade="F";
        }else if(avg<=60){
            grade="E";
        }else if(avg<=70){
            grade="D";
        }else if(avg<=80){
            grade="C";
        }else if(avg<=90){
            grade="B";
        }else if(avg<=100){
            grade="A";
        }
        System.out.println("==========================");
        System.out.println("Total Score = "+df.format(total));
        System.out.println("Average      = "+df.format(avg));
        System.out.println("Got Grade   = "+grade);
    }
    
}
