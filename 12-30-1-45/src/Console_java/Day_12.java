
package Console_java;

import java.util.Random;
import java.util.Scanner;

public class Day_12 {
    Scanner cin = new Scanner(System.in);
        public Day_12() {
            int arr[]=new int[20];
            int option,n = 0,i;
            
                  do{
                        System.out.println("[1]. Input   Value");
                        System.out.println("[2]. Output Value");
                        System.out.println("[3]. Search Value");
                        System.out.println("[4]. Update Value");
                        System.out.println("[5]. Delete  Value");
                        System.out.println("==============");
                        System.out.print("Select one option => ");
                        option = cin.nextInt();
                        switch(option){
                            case 1->{
                                 System.out.print("Input value n : ");
                                 n=cin.nextInt();
                                 Random ran = new Random();
                                 for( i=0;i<n;i++){
                                       arr[i]=ran.nextInt(100)+1;
                                       System.out.printf("Random arr[%d] : %d\n",i,arr[i]);
                                 }
                            }
                            case 2->{
                                  for(i=0;i<n;i++){
                                        System.out.printf("arr[%d] = %d\n",i,arr[i]);
                                  }
                            }
                            case 3->{
                                   Search(n,arr);
                            }
                            case 4->{
                                Update(n,arr);
                            }
                            case 5->{
                                    if(Delete(n,arr)){
                                        n--;
                                    }
                            }
                        }
                  }while(true);
        }    
        void Search(int n,int arr[]){
                int s;
                boolean f=false;
                System.out.print("Input value to search : ");
                s=cin.nextInt();
                for(int i=0;i<n;i++){
                    if(s==arr[i]){
                        System.out.printf("arr[%d] = %d\n",i,arr[i]);
                        f=true;
                    }
                }
                if(f){
                    System.out.println("Search has found");
                }else{
                    System.out.println("Search not found");
                }
        }
        void Update(int n,int arr[]){
                int update;
                boolean f=false;
                System.out.print("Which number do you want to update : ");
                update=cin.nextInt();
                for(int i=0;i<n;i++){
                     if(update==arr[i]){
                         System.out.print("Enter value to update ");
                         arr[i]=cin.nextInt();
                         f=true;
                         break;
                     }
                }
                if(f){
                    System.out.println("Update Success.");
                }else{
                    System.out.println("Update False");
                }
        }
        boolean Delete(int n,int arr[]){
            int del;
            System.out.print("Which number do you want to delete : ");
            del=cin.nextInt();
            for(int i=0;i<n;i++){
                if(del==arr[i]){
                    for(int j=i;j<n;j++){
                        arr[j]=arr[j+1];
                    }
                    return true;
                }
            }
            
            return false;
        }

    public static void main(String[] args) {
        new Day_12();
    }
    
}
