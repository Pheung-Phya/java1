
package Java_Collection;

public class Student {
        int id;
        String name,gender;
        float score;
        
    public Student() {
    }        
    public Student(int id, String name, String gender, float score) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.score = score;
    }
    void Output(){
        System.out.printf("%-10d %-10s %-10s %-10.2f\n",id,name,gender,score);
    }
        
}
