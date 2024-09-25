
package rupp;


 class Animal {
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}

public class Polimophism_java {

   
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal.makeSound();
        animal1.makeSound(); // Output: Bark
        animal2.makeSound(); // Output: Meow

    }
    
}
