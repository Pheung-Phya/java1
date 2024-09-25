
package Introduction_java;




import java.awt.Frame;
import java.awt.*;
import javax.swing.*;




public class testes extends Frame{
    Label label;
    TextField txtInputA,txtInputB,txtResult;
    JButton btnsub,btnDiv, btnMul,btnsum;
   
    public testes() {
       
        label= new Label("Calulate");
        label.setBounds(230,50,260,60);
        label.setForeground(Color.white);
        label.setBackground(Color.blue);
        label.setFont(new Font("Time No Roman",Font.BOLD,30));
        add(label);
        
        label= new Label("Input A");
        label.setBounds(80,100,100,100);
        label.setForeground(Color.white);
        label.setBackground(Color.blue);
        label.setFont(new Font("Time No Roman",Font.BOLD,20));
        add(label);
        
        label = new Label("Input B");
        label.setBounds(80,160,100,100);
        label.setFont(new Font ("Time new Roman",Font.BOLD,20));
        label.setBackground(Color.BLUE);
        label.setForeground(Color.white);
        add(label);
        
        label=new Label("Result");
        label.setBackground(Color.BLUE);
        label.setBounds(80,220,100,100);
        label.setForeground(Color.white);
        label.setBackground(Color.blue);
        label.setFont(new Font ("Time new Roman",Font.BOLD,20));
        add(label);
        
        txtInputA= new TextField();
        txtInputA.setBounds(190,135,180,30);
        txtInputA.setFont(new Font ("Time New Roman",Font.BOLD,30));
        txtInputA.setBackground(Color.white);
        txtInputA.setForeground(Color.black);
        add(txtInputA);
        
        txtInputB= new TextField();
        txtInputB.setBounds(190,195, 180,30);
        txtInputB.setFont(new Font("Time new Roman",Font.BOLD,20));
        txtInputB.setBackground(Color.white);
        txtInputB.setForeground(Color.BLACK);
        add(txtInputB);
        
        txtResult= new TextField();
        txtResult.setBounds(190,255,180,30);
        txtResult.setFont(new Font("Time New Roman",Font.BOLD,20));
        txtResult.setBackground(Color.white);
        txtResult.setForeground(Color.BLACK);
        add(txtResult);
        
        
        btnsub= new JButton("SUb");
        btnsub.setBounds(80, 320, 80,30);
        btnsub.setFont(new Font("Time New Roman",Font.BOLD,20));
        btnsub.setBackground(Color.CYAN);
        btnsub.setForeground(Color.WHITE);
        add(btnsub);
        
        
        btnDiv= new JButton("Div");
        btnDiv.setBounds(180, 320, 80,30);
        btnDiv.setFont(new Font("Time New Roman",Font.BOLD,20));
        btnDiv.setBackground(Color.GREEN);
        btnDiv.setForeground(Color.WHITE);
        add(btnDiv);
        
        
        btnMul= new JButton("Mul");
         btnMul.setBounds(280, 320, 80,30);
        btnMul.setFont(new Font("Time New Roman",Font.BOLD,20));
         btnMul.setBackground(Color.MAGENTA);
         btnMul.setForeground(Color.WHITE);
        add( btnMul);
        
        btnsum= new JButton("sum");
        btnsum.setBounds(380, 320, 80,30);
        btnsum.setFont(new Font("Time New Roman",Font.BOLD,20));
        btnsum.setBackground(Color.ORANGE);
        btnsum.setForeground(Color.WHITE);
        add(  btnsum);
        
         
        
  
        
        setSize(550,400);
        setLocationRelativeTo(this);
        setBackground(Color.BLUE);
        setLayout(null);
        setVisible(true);
        
        
    }
    public static void main(String[] args) {
        new testes();
    }
    
    
    
}
