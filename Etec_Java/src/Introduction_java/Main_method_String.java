
package Introduction_java;


public class Main_method_String {

    
    public static void main(String[] args) {
        priInformation("Hello world");
        priInformation(" ");
        priInformation("\t   \n");
        
        String a = ("hello\n".repeat(2));
        System.out.println(a);
        
    }
    public static void priInformation(String string){
        int length = string.length();
        System.out.printf("Length of string : %d %n", length);
        System.out.printf("First of %c %n", string.charAt(0));
        System.out.printf("Last of %c %n", string.charAt(length-1));
        if(string.isEmpty()){
            System.out.println("String is empty");
        }
        if(string.isBlank()){
            System.out.println("string is blank");
        }
        
    }
}
