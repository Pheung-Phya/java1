
package Introduction;

class Animal {
    public int sum(int a,int b){
       return a+b;
    }
    public void Sound(){
        System.out.println("Animal Sound.");
    }
}

class Dog extends Animal{
    public int sum(int c, int d) {
        return super.sum(c, d);
    }
    public void Sound() {
        super.Sound();
        System.out.println("Dog sound wolf wolf..");
    }  
}

class Cat extends Animal{
    public void Sound(){
        super.Sound();
        System.out.println("Cat sound meow meow");
    }
}

public class Overriding {
    public static void main(String[] args) {
        
        System.out.println("Call class animal");
        Animal animal = new Animal();
        animal.Sound();
        System.out.println(animal.sum(10, 20));
        
        System.out.println("Call class Dog");
        animal = new Dog();
        animal.Sound();
        System.out.println(animal.sum(20, 30));
    }   
}
