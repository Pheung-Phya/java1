package Introduction_java;


import javax.swing.*;


public class Main_JoptionPane {
    public static void main(String[] args){
        
        int x,y;
        x=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter value x : "));
        y=Integer.parseInt(JOptionPane.showInputDialog("Enter value y : "));
        int sum = x+y;
        JOptionPane.showMessageDialog(null,"Sum is = "+sum,"Sum of two integer",JOptionPane.PLAIN_MESSAGE);
    }
}
