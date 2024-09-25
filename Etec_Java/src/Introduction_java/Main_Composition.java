
package Introduction_java;


public class Main_Composition {

   
    public static void main(String[] args) {
        Monitor montor = new Monitor("333", "dell", 27, "333x 22");
        Motherboard motherboard =new  Motherboard("333", "dell", 20, 10,10);
        ComputerCase computercase = new  ComputerCase("33", "dell" ,"heel");
        Main_Computer_self seft=new Main_Computer_self("33", "dell", montor, motherboard, computercase);
    }
    
}
