
package Introduction;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_hash {
     ArrayList<String> list = new ArrayList<String>();

    public Array_hash() {
        int option;
        int i,n = 0;
        String value;
        Scanner cin = new Scanner(System.in);
        do{
            System.out.println("[1]. Add");
            System.out.println("[2]. View");
            System.out.println("[3]. Search]");
            System.out.println("[4]. Update");
            System.out.println("[5]. Remove");
            System.out.print("Please select one option => ");
            option=cin.nextInt();
            switch(option){
                case 1->{
                         System.out.print("How many word do you want to input : "); 
                         n=cin.nextInt();
                         for(i=0;i<n;i++){
                             System.out.print("Enter word "+(1+i)+" = ");
                             value=cin.next();
                             list.add(value);
                         }                      
                }
                case 2->{
                    System.out.println("\n===========> Output <================");
                    System.out.println(list+"\n");
                }
                case 3->{
                    String search;
                    System.out.print("Enter word to search : ");
                    search=cin.next();
                    for(i=0;i<n;i++){
                        if(search.equalsIgnoreCase(list.get(i))){
                            System.out.println("\nSearch has found is : "+list.get(i));
                        }
                    }
                }
                case 4->{
                    String update;
                    System.out.print("Enter word to update : ");
                    update=cin.next();
                    for(i=0;i<n;i++){
                        if(update.equalsIgnoreCase(list.get(i))){
                            System.out.println("You want to update this word : "+list.get(i));
                            System.out.print("Ener word for update : ");
                            update=cin.next();
                            list.set(i, update);
                            break;
                        }
                    }
                }
            }
            
        }while(true);
    }
     

    public static void main(String[] args) {
        new Array_hash();
    }
    
}
