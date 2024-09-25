
package AWT_1;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Pr_1 extends JFrame{
    JLabel head,name,id,pass,cpass,ct;
    JTextField tName,tId,tCt,tState,tPhone;
    JPasswordField tpass,tCpass;
    JComboBox cb_ct;
    JButton sm,cl;
    String country[]={"Cambodia","Japan","Laos","ThaiLand","USA","Canada"};
    Pr_1(){
        head = new JLabel("Registeration Form in Window Form");
        head.setBounds(100, 30,600, 70);
        head.setFont(new Font("",Font.ITALIC,30));
        head.setForeground(Color.blue);
        
        name=new JLabel("NAME : ");
        name.setBounds(100, 110, 300, 60);
        name.setFont(new Font("",Font.BOLD,25));
        tName=new JTextField();
        tName.setBounds(400, 110, 300, 60);
        tName.setFont(new Font("",Font.BOLD,25));
        
        id=new JLabel("Email_id : ");
        id.setBounds(100, 190, 300, 60);
        id.setFont(new Font("",Font.BOLD,25));
        tId=new JTextField();
        tId.setBounds(400, 190, 300, 60);
        tId.setFont(new Font("",Font.BOLD,25));
        
        pass=new JLabel("Password : ");
        pass.setBounds(100, 260, 300, 60);
        pass.setFont(new Font("",Font.BOLD,25));
        tpass=new JPasswordField();
        tpass.setEchoChar('#');
        tpass.setBounds(400, 260, 300, 60);
        tpass.setFont(new Font("",Font.BOLD,25));
        
         cpass=new JLabel("Comfirm Password : ");
        cpass.setBounds(100, 330, 300, 60);
        cpass.setFont(new Font("",Font.BOLD,25));
        tCpass=new JPasswordField();
        tCpass.setEchoChar('#');
        tCpass.setBounds(400, 330, 300, 60);
        tCpass.setFont(new Font("",Font.BOLD,25));
        
         ct=new JLabel("Country : ");
        ct.setBounds(100, 400, 300, 60);
        ct.setFont(new Font("",Font.BOLD,25));
        cb_ct=new JComboBox( country);
        cb_ct.setBounds(400, 400, 300, 60);
        cb_ct.setFont(new Font("",Font.BOLD,25));
        
         sm=new JButton("Submit");
        sm.setBounds(100, 490, 280, 60);
        sm.setFont(new Font("",Font.BOLD,25));
        cl=new JButton( "Clear");
        cl.setBounds(400, 490, 280, 60);
        cl.setFont(new Font("",Font.BOLD,25));
        
        this.add(head);
        this.add(name);
        this.add(tName);
        this.add(id);
        this.add(tId);
         this.add(pass);
        this.add(tpass);
         this.add(cpass);
        this.add(tCpass);
        this.add(ct);
        this.add(cb_ct);
        this.add(sm);
        this.add(cl);
        this.setTitle("Register Form");   
        this.setLayout(null);
        this.setSize(800, 700);
        this.setLocationRelativeTo(this);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        new Pr_1();
    }
    
}
