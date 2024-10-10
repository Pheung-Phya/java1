
package Form_1.a;

import java.util.ArrayList;

public class Register {

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getDay() {
        return day;
    }

    public String getCourse() {
        return course;
    }

    public String getTime() {
        return time;
    }

    public String getPlace() {
        return place;
    }

    public double getPrice() {
        return price;
    }

    public static ArrayList<Register> getList_register() {
        return list_register;
    }
        private int id;
        private String name,gender,day,course,time,place;
        private double price;
        public Register(int id, String name, String gender, String day, String course, String time, String place, double price) {
                this.id = id;
                this.name = name;
                this.gender = gender;
                this.day = day;
                this.course = course;
                this.time = time;
                this.place = place;
                this.price = price;
        }
        static ArrayList<Register> list_register = new ArrayList<>();
}


