package Console_java;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Day_15 {
    Day_15(){
        int i,value,n,op;
        Scanner cin = new Scanner(System.in);
        Random ran = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        do{
            System.out.println("[1]. Input value ");
            System.out.println("[2]. View value ");
            System.out.println("[3]. Search value ");
            System.out.println("[4]. Update value ");
            System.out.println("[5]. Delete value ");
            System.out.println("_________________");
            System.out.print("Select one option => ");
            op=cin.nextInt();
            switch(op){
                case 1->{
                    System.out.print("How many value do you want to input : ");
                    n=cin.nextInt();
                     for(i=0;i<n;i++){
                           value = ran.nextInt(100)+1;
                           list.add(value);
                     }
                     System.out.println("Enter value Success..!");
                }
                case 2->{
                    System.out.println(list);
                    for(i=0;i<list.size();i++){                       
                        System.out.print(list.get(i)+"    ");
                    }
                    System.out.println("");
                }
                case 3->{
                    int search;
                    System.out.println("What number do you want to search : ");
                    search=cin.nextInt();
                    for(i=0;i<list.size();i++){
                          if(search==list.get(i)){
                              System.out.println("Search has found..");
                          }
//                          if(list.contains(search)){
//                              System.out.println("Search has found..");
//                          }
                    }
                }
                case 4->{
                    int update;
                    System.out.print("Which number do you want to update : ");
                    update=cin.nextInt();
                    for(i=0;i<list.size();i++){
                        if(update==list.get(i)){
                            value = ran.nextInt(100)+1;
                            list.set(i, value);
                            System.out.println("Update Success.!");
                            break;                 
                        }
                    }
                }
            }  
        }while(true);
    }
    public static void main(String[] args) {
        new Day_15();
        
    }   
}
