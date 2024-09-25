
package Introduction_java;

public class Main_Java_Object extends Object {

   
    public static void main(String[] args) {
        Student max = new Student("Max",21);
        System.out.println(max.toString());
    }
    
}
 class Student{
    private String name;
    private int max;

    public Student(String name,int max) {
        this.name=name;
        this.max=max;
    }
    public String toString(){
        return name+" is "+max;
    }
    
}
