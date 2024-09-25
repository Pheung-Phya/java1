
package Introduction_java;


public class String_to_int {

    
    public static void main(String[] args) {
        int currentYear = 2024;
        String dateOfBirth="2003";
        int dateBirth=Integer.parseInt(dateOfBirth);
        System.out.println("I'm "+(currentYear-dateBirth)+" olds.");
        
        
        int a=10;
        float b=20.3f;
        a=(int)b;
        System.out.println("a = "+a+"\n b = "+b);
    }
    
}
