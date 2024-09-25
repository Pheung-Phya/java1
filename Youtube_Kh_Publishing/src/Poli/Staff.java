
package Poli;

import java.text.DecimalFormat;
import javax.swing.JTextArea;


public class Staff extends People{
    float salary;
 
    public String output(){
        DecimalFormat fm = new DecimalFormat("$ ###,#00.0");
        String st=super.output()+"\t"+fm.format(salary);
        return st;
    }

    public void output(JTextArea txt) {
        txt.setText(output());
    }
    
    public Staff() {
    }
    public Staff( long id, String name, String gender,float salary) {
        super(id, name, gender);
        this.salary = salary;
    }

    
     
    
    
}
