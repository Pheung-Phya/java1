
package OOP;

import java.util.ArrayList;
import java.util.Scanner;

class Book{
    private int code;
    private String title;
    private String subject;
    private Float price;
    
    Book(){
        code=0;
        title="null";
        subject="unknown";
        price=0.0f;
    }

    public Book(int code, String title, String subject, Float price) {
        this.code = code;
        this.title = title;
        this.subject = subject;
        this.price = price;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
    
    public void Input(){
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter Code     : ");      code = cin.nextInt();
        System.out.print("Enter Title       : ");      cin.nextLine(); title=cin.nextLine();
        System.out.print("Enter Subject : ");       subject=cin.next();
        System.out.print("Enter Price      : ");        price = cin.nextFloat();
    }
    public void Output(){
        System.out.printf("%10d %10s %10s %10.2f\n",code,title,subject,price);
    }  
}

public class day_2 {

    public day_2() {
         Book book1 = new Book();
          Book book2 = new Book();
          ArrayList<Book> list = new ArrayList<Book>();
          
          book1.Input();
          book2.Input();
          list.add(book1);
          list.add(book2);
          
          for(int i=0;i<list.size();i++){
              list.get(i).Output();
          }
    }
    
    public static void main(String[] args) {
         new day_2();
          
    }
    
}
