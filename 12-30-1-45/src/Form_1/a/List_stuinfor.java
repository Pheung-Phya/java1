
package Form_1.a;

import java.util.ArrayList;

public class List_stuinfor {
    private int id;
    private String name;
    private String gender;
    private float score;

    public List_stuinfor() {
    }

    public List_stuinfor(int id, String name, String gender, float score) { // ផ្ទុកតម្លៃពេលបញ្ចូល
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public float getScore() {
        return score;
    }
    
    
    // ទម្រង់ MBC
    static ArrayList<List_stuinfor> list_stu= new ArrayList<>(); /// controler
    
}
