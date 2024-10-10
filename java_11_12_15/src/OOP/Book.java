
package OOP;
import java.util.Scanner;
public class Book {
        private int code;
        private String title,subject;
        private float price;
        public Book(){
                code=0;
                title=subject="N/A!";
                price=0.0f;
        }
        public Book(int code,String title,String subject,float price){
                this.code=code;
                this.title=title;
                this.subject=subject;
                this.price=price;
        }
        public void Input(){
                Scanner cin = new Scanner(System.in);
                System.out.print("Enter Book Code : "); code = cin.nextInt();
                System.out.print("Enter Book Tittle : "); title = cin.next();
                System.out.print("Enter Book Subject : "); subject=cin.next();
                System.out.print("Enter Book Price : "); price=cin.nextFloat();
        }
        public void Output(){
                System.out.printf("%-10d %-10s %-10s %-10.2f\n",code,title,subject,price);
        }

    public void setCode(int code) {
        this.code = code;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public int getCode() {
        return code;
    }
    public String getTitle() {
        return title;
    }
    public String getSubject() {
        return subject;
    }
    public float getPrice() {
        return price;
    }
            
}
