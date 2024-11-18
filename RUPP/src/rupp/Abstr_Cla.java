
package rupp;
   abstract class Animal {
    
    public abstract void sound();
    public void sleep() {
        System.out.println("Zzz");
    }
}

class Dog extends Animal {

    public Dog() {
        super();
    }
        
    // Implementation of abstract method
    public void sound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    // Implementation of abstract method
    public void sound() {
        System.out.println("Meow");
    }
}
 
public class Abstr_Cla {
        public static void main(String[] args) {
            Dog dog = new Dog();
            Cat cat = new Cat();

           dog.sleep();
           dog.sound();

            
        }
    

}
