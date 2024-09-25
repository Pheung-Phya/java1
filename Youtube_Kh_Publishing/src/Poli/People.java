
package Poli;

import javax.swing.JTextArea;

abstract public  class People {
    long id;
    String name;
    String gender;

    public String output(){
        String st=id+"\t"+name+"\t"+gender;
        return st;
    }
    abstract public void output(JTextArea txt);
    public People() {
    }

    public People(long id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }
    
}
