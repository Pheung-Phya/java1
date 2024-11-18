package PoliMorphism;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PolyMain {
        public static void main(String[] args) {
                  final double PI=3.14;
                 Scanner cin = new Scanner(System.in);
                 float total,x,y;

                 try{
                          System.out.print("Enter x : "); x=cin.nextFloat();
                          System.out.print("Enter y : "); y=cin.nextFloat();
                 }catch(InputMismatchException e){
                           System.out.println("Don't input String ");
                 }
        }   
}
