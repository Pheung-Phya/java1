
package Introduction;

class Employee{
    private String name;
    private int code;
    
    static int add(int a,int b){
        return a+b;
    }
    static int add(int a,int b ,int c){
        return a+b+c;
    }
    void add(){
        System.out.println("Hello world");
    }
    
    public Employee(){
        System.out.println("Default Constructor");
    }
    public Employee(String name){
        System.out.println("Constructor with param name");
    }
    public Employee(String name,int code){
        System.out.println("Constructor with param name and code");
    }
    
}

class Overloading{
    public static void main(String[] args){
        Employee emp = new Employee("",0);
        System.out.println("a + b = "+Employee.add(10, 20));
    }
}
