
package Poli;

import javax.swing.JTextArea;

public class Student extends People{
    float ca,db,java;
    public void output(JTextArea txt){  
        txt.setText(output());
    }
    public String output(){
        String st=super.output()+"\t"+ca+"\t"+db+"\t"+java;
        return st;
    }
    
    public Student() {
    }
    public Student(float ca, float db, float java, long id, String name, String gender) {
        super(id, name, gender);
        this.ca = ca;
        this.db = db;
        this.java = java;
    }
    
}
