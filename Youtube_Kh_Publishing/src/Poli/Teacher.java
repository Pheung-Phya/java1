
package Poli;

import javax.swing.JTextArea;

public class Teacher extends Staff{
    int numberclass;
    public String output(){
        String st=super.output()+"\t"+numberclass;
        return st;
    }
    public void output(JTextArea txt){
        txt.setText(output());
    }

    public Teacher() {
    }
    public Teacher( long id, String name, String gender, float salary ,int numberclass) {
        super(id, name, gender,salary);
        this.numberclass = numberclass;
    }
    
}
