
package Form_1;

import java.util.ArrayList;

public class ModelStudent {
         int id;
         String name,gender,time,place,cours,day,phone,photo,date;
         double price;
         
        public ModelStudent(int id, String name, String gender, String time, String place, String cours, String day, String phone, String photo, String date, double price) {
            this.id = id;
            this.name = name;
            this.gender = gender;
            this.time = time;
            this.place = place;
            this.cours = cours;
            this.day = day;
            this.phone = phone;
            this.photo = photo;
            this.date = date;
            this.price = price;
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

    public String getTime() {
        return time;
    }

    public String getPlace() {
        return place;
    }

    public String getCours() {
        return cours;
    }

    public String getDay() {
        return day;
    }

    public String getPhone() {
        return phone;
    }

    public String getPhoto() {
        return photo;
    }

    public String getDate() {
        return date;
    }

    public double getPrice() {
        return price;
    }
    
    static ArrayList<ModelStudent> list = new ArrayList<>();
         
}
