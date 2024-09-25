
package Introduction_java;

public class Dog extends Animal{
    @Override
    void speak(){
        super.speak();
        System.out.println("The dog speak woos woos!");
    }
}
