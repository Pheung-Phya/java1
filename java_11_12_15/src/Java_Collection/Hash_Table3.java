
package Java_Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Sample{
        private String word,speech,desc;
        public void Input(){
                  Scanner cin = new Scanner(System.in);
                  System.out.print("Enter Word           : "); word=cin.next();
                  System.out.print("Enter Speech       : ");  speech=cin.next();
                  System.out.print("Enter Description : ");  cin.nextLine();desc = cin.nextLine();
        }
        public void Output(){
                  System.out.printf("%-15s %-10s %-15s\n",word,speech,desc);  
        } 
        String getWord(){
                 return word;
        }
}

public class Hash_Table3 {
    public static void main(String[] args) {
         HashMap<Integer,Sample> hm = new HashMap<>();
         Sample sam;
         boolean f=true;
         int i,n=0;
         int option;
         Scanner cin = new Scanner(System.in);
         do{
                  System.out.println("[1]. Input Word      ");
                  System.out.println("[2]. Output Word   ");
                  System.out.println("[3]. Search Word  ");
                  System.out.println("[4]. Update Word  ");
                  System.out.println("[5]. Delete Word   ");
                  System.out.println("[6]. For Exit ");
                  System.out.println("----------------------");
                  System.out.print("Choose one option => ");
                  option=cin.nextInt();
                  switch(option){
                          case 1->{
                                   System.out.print("How many word do you want to enter : ");
                                   n=cin.nextInt();
                                   for(i=0;i<n;i++){
                                            System.out.println("Word number "+(i+1));
                                            sam = new Sample();
                                            sam.Input();
                                            hm.put(i, sam);
                                   }
                          }
                          case 2->{
                                   for(Map.Entry<Integer,Sample> m: hm.entrySet()){
                                            m.getValue().Output();
                                   }
                          }
                          case 3->{
                                   String search;
                                   System.out.print("Enter Word to Search : ");
                                   search=cin.next();
                                   for(i=0;i<hm.size();i++){
                                            if(search.equalsIgnoreCase(hm.get(i).getWord())){
                                                    hm.get(i).Output();
                                            }
                                   }
                          }
                          case 4->{
                                   String update;
                                   System.out.print("Enter Word to update : ");
                                   update=cin.next();
                                   for(i=0;i<hm.size();i++){
                                            if(update.equalsIgnoreCase(hm.get(i).getWord())){
                                                    sam = new Sample();
                                                    sam.Input();
                                                    hm.replace(i, sam);    
                                                    
                                                    System.out.println("Update Success.!");
                                                    break;
                                            }
                                   }
                          }
                          case 5->{
                                   String delete;
                                   System.out.print("Enter word to delete : ");
                                   delete=cin.next();
                                   for(i=0;i<hm.size();i++){
                                            if(delete.equalsIgnoreCase(hm.get(i).getWord())){                                                   
                                                    hm.remove(i,hm.get(i));
                                                    System.out.println("Delete Success");
                                                    break;
                                            }
                                   }
                          }
                          case 6->{
                                    System.out.println("Good bye.!");
                                    f=false;
                          }
                  }
             
         }while(f);
        
    }   
}
    