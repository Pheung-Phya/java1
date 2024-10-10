package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.management.ListenerNotFoundException;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.event.AncestorListener;

public class Pass extends JFrame implements ActionListener{
    // declare object here
    JPasswordField jp;
    JLabel l,ll;
    JCheckBox c;
    JTextField jjp;
    JButton b;
    
    // sex m & f
    JRadioButton m,f;    
    ButtonGroup btg;     // for select one of two
    JButton bn;
    
    public Pass(){
        
        
        
        // Useername
        ll= new JLabel("Username");
        ll.setBounds(20, 20, 200, 40);
        ll.setFont(new Font("", Font.PLAIN, 30));
        ll.setForeground(Color.MAGENTA);
        ll.setLayout(null);
        ll.setVisible(true);
        
        
        // box name
         jjp= new JTextField();
        jjp.setBounds(200, 20, 300, 50);
        jjp.setFont(new Font("", Font.BOLD, 30));
        jjp.setLayout(null);
        jjp.setVisible(true);
        
        
        c= new JCheckBox();
        c.setBounds(560, 145, 250, 200);
        c.setSize(18, 17);
        c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if(c.isSelected()){
                    jp.setEchoChar((char)0);
                }
               }
        });
        c.setVisible(true);
        
        
        
        // string password
        l= new JLabel("Password");
        l.setBounds(20, 130, 200, 40);
        l.setFont(new Font("", Font.PLAIN, 30));
        l.setForeground(Color.red);
        l.setLayout(null);
        l.setVisible(true);
       
        // Password box
        jp= new JPasswordField();
        jp.setBounds(200, 130, 300, 50);
        jp.setFont(new Font("", Font.BOLD, 30));
//      jp.setEchoChar('#'); // ពេលសរសេរចេញ#​មិនបង្ហាញអក្សរវាជា Password

        
        m=new JRadioButton("Male");
        m.setBounds(120, 250, 200, 20);
        f=new JRadioButton("Female");
        f.setBounds(400, 250, 200, 20);
        btg=new ButtonGroup();
        bn=new JButton("Submit");
        bn.setBounds(320, 350, 80, 25);
        bn.addActionListener((ActionListener) this);
        btg.add(m);
        btg.add(f);
        f.setSelected(true);   // set sellect F , f is female
        
        btg.add(m);
        btg.add(f);
        
        


        b= new JButton("Sign Up");
        b.setBounds(320, 500, 150, 30);
        b.setForeground(Color.WHITE);
        b.setFont(new Font("", Font.BOLD, 20) {
        });
        b.setBackground(Color.GREEN);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if(jp!=null){
                    JOptionPane.showConfirmDialog(null, "ជោគជ័យ");
                }
            }  
        });
        
        //Add other 
        add(ll);
        add(jjp);
        add(jp);
        add(l);
        add(c);
        add(b);
        this.add(bn);
        this.add(m);
        this.add(f);
        
        // limmit Our Jframe
        this.setSize(700, 700);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.LIGHT_GRAY); //making background
        this.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        new Pass();
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        if(m.isSelected()){
            JOptionPane.showConfirmDialog(null, "You are Male");
        }
        if(f.isSelected()){
            JOptionPane.showConfirmDialog(null, "You are Female");
        }
    }
    
}
