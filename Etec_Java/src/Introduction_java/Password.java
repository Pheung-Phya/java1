
package Introduction_java;

import javax.swing.JOptionPane;

public class Password {

    public static void main(String[] args) {
        
      String password = JOptionPane.showInputDialog(null, "Enter password : ");
       
       boolean  valid = validatePassword(password);
      if(valid){
           JOptionPane.showMessageDialog(null, "Succes!");
      }else{
           JOptionPane.showMessageDialog(null, "Your password not security!");
      }
        System.out.println(valid);
    }
    public static boolean validatePassword(String password){
        boolean isValid = validateLength(password,8) && containLetterAndDigit(password);
        return isValid;
    }
    private static boolean validateLength(String password,int minlength){
        return password.length() >= minlength;
    }
    private static boolean containLetterAndDigit(String password){
        boolean letter = false;
        boolean digit = false;
        int i,count=0;
        for(i=0;i<password.length();i++){
            char ch = password.charAt(i);
            if(Character.isAlphabetic(ch)){
                letter = true;
            }
            if((Character.isDigit(ch))){
                count++;
            }
        }
        if(count>=2){
            digit=true;
        }
        
        return letter && digit;
    }
    
}
