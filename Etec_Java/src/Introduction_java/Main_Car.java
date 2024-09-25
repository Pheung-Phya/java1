
package Introduction_java;

public class Main_Car {

    public static void main(String[] args) {
       
       Car_Obj car = new Car_Obj();
       car.set_id(10);
       car.set_name("phya");
       car.set_sex("Male");
       car.result();
        System.out.println("id = "+car.get_id());
    }
    
}
