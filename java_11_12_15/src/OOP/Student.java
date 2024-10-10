
package OOP;
public class Student {
        private int id;
        private String name;
        private String gender;
        private float score;
        
        public Student(int id, String name, String gender, float score) {
            this.id = id;
            this.name = name;
            this.gender = gender;
            this.score = score;
        }
        
        public Student() {
                  id=0;
                  name=gender="N/A!";
                  score=0.0f;
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

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public void setScore(float score) {
            this.score = score;
        }

        @Override
        public String toString() {
            return "Student{" + "id=" + id + ", name=" + name + ", gender=" + gender + ", score=" + score + '}';
        }
        
}
