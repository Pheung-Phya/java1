
package OOP;
import java.util.Scanner;
public class MainBook {
        Scanner cin = new Scanner(System.in);
        public MainBook(){
                  Book[] book = new Book[20];
                  boolean f=true;
                  int i,n=0;
                  int option;
                  do{
                          System.out.println("[1]. Input    ");
                          System.out.println("[2]. Output  ");
                          System.out.println("[3]. Update ");
                          System.out.println("[4]. Delete   ");
                          System.out.println("[5]. Exit       ");
                          System.out.println("=========");
                          System.out.print("Choose one => ");
                          option = cin.nextInt();
                          switch(option){
                                    case 1:{
                                            System.out.println("How many Book do you want to enter : ");
                                            n = cin.nextInt();
                                            for(i=0;i<n;i++){
                                                    System.out.println("=====> Book "+(i+1));
                                                    book[i]=new Book();
                                                    book[i].Input();
                                            }
                                            break;
                                    }
                                    case 2:{
                                            for(i=0;i<n;i++){
                                                    book[i].Output();
                                            }
                                            break;
                                    }
                                    case 3:{
                                            Update(book, n);
                                            break;
                                    }
                                    case 4:{
                                            if(Delete(book, n)){
                                                    System.out.println("Delete Success.!");
                                                    n--;
                                            }else{
                                                    System.out.println("Delete False.!");
                                            }
                                            break;
                                    }
                                    case 5:{
                                            System.out.println("Good Bye.!!!");
                                            f=false;
                                    }
                                    default:{
                                            System.out.println("Choose Again.");
                                            break;
                                    }
                          }
                  }while(f);
        }
        
        public static void main(String[] args) {
                  new MainBook();
        }  
        
        public void Update(Book b[],int n){
                 String update;
                 System.out.print("Enter Title Book to Update : ");
                 update = cin.next();
                 for(int i=0;i<n;i++){
                          if(update.equalsIgnoreCase(b[i].getTitle())){
                                   b[i].Output();
                                   System.out.println("Enter new Information for update");
                                   b[i].Input();
                                   break;
                          }
                 }
        }
        public boolean Delete(Book b[],int n){
                  int delete;
                  System.out.print("Enter Book Code to delete : ");
                  delete = cin.nextInt();
                  for(int i=0;i<n;i++){
                           if(delete==b[i].getCode()){
                                    for(int j=i;j<n;j++){
                                            b[j]=b[j+1];
                                    }
                                    return true;
                           }
                  }
                  return false;
        }
}
