
package gui;

import java.util.ArrayList;

public class StuRegis {
    private int id;
    private String name,gender,course,price,pace,time,day;

    public StuRegis() {
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

    public String getCourse() {
        return course;
    }

    public String getPrice() {
        return price;
    }

    public String getPace() {
        return pace;
    }

    public String getTime() {
        return time;
    }

    public String getDay() {
        return day;
    }

    public StuRegis(int id, String name, String gender, String course, String price, String pace, String time, String day) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.course = course;
        this.price = price;
        this.pace = pace;
        this.time = time;
        this.day = day;
    }
    
    static ArrayList<StuRegis> sturegis=new ArrayList<>();
}
