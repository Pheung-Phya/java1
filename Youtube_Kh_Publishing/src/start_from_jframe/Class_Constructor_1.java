
package start_from_jframe;

public class Class_Constructor_1 {
    int id;
    String name;
    float java,cpp;

    public Class_Constructor_1(int id, String name, float java, float cpp) {
        this.id = id;
        this.name = name;
        this.java = java;
        this.cpp = cpp;
    }

    public Class_Constructor_1() {
    }
    float total(){
        return java+cpp;
    }
    float avg(){
        return total()/2;
    }
    void show(){
        System.out.println("Id\tName\tJava\tcpp\tAvg");
        System.out.println(id+"\t"+name+"\t"+java+"\t"+cpp+"\t"+avg());
    }
    
}
