
package Form_1;
import java.util.ArrayList;

public class List_Stu {
        private int id;
        private String name,gender;
        private float score;

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

        public List_Stu(int id, String name, String gender, float score) {
            this.id = id;
            this.name = name;
            this.gender = gender;
            this.score = score;
        }
        static ArrayList<List_Stu> list_stu = new ArrayList<>();
        
}
