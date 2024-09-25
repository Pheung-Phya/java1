
package Introduction_java;

import java.util.Scanner;


public class Car_Obj {
    private int id;
    private String name;
    private String sex;
    
    Car_Obj(int id,String name,String sex){
        this.id=id;
        this.name=name;
        this.sex=sex;
    }
    Car_Obj(){
        System.out.println("Empty constructor");
            }
    public void set_id(int id){
        this.id=id;
    }
    public void set_name(String name){
        this.name=name;
    }
    public void set_sex(String sex){
        this.sex=sex;
    }
    
    public int get_id(){
        return id;
    }
    public String get_name(){
        return name;
    }
    public String get_sex(){
        return sex;
    }
    
    public void result(){
        System.out.println("id = "+id);
        System.out.println("name = "+name);
        System.out.println("sex = "+sex);
    }
   
}
