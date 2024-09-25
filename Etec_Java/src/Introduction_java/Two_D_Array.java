
package Introduction_java;

import java.util.ArrayList;


public class Two_D_Array {

    
    public static void main(String[] args) {
        ArrayList<ArrayList<ArrayList<String>>> obj = new ArrayList();
        ArrayList<ArrayList<String>> car = new ArrayList();
        ArrayList<String> c = new ArrayList();
        c.add("a");
        c.add("b");
        car.add(c);
        obj.add(car);
        System.out.println(obj);
    }
    
}
