
package Poli;
public class Main {
    public static void main(String[] args) {
       People temp ;
       Staff obj = new Staff(1, "hello", "male", 999);
       temp=obj;
        System.out.println(temp.output());
    }
    
}
