
package Calculator;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

public class MyInput {
    public void InputNumber(JTextField txt,KeyEvent evt){
        if(!Character.isDigit(evt.getKeyChar()) ){
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }
   public void InputNumber(JTextField txt,KeyEvent evt,int len){
        if(!Character.isDigit(evt.getKeyChar())){
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }else{
          if (txt.getText().length() >= len || txt.getText().length() == len ) {
                Toolkit.getDefaultToolkit().beep();
                evt.consume();
            }
        }        
    }
//   public void InputFloat(JTextField txt,KeyEvent evt){
//       if(evt.getKeyChar()==46){
//           if(txt.getText().indexOf(46)!=-1){
//               Toolkit.getDefaultToolkit().beep();
//               evt.consume();
//           }
//       }
//   }
   public void InputChar(JTextField txt, KeyEvent evt) {
    char c = evt.getKeyChar();

    // Allowing only alphabetic characters, backspace, and delete
   // && c != KeyEvent.VK_BACK_SPACE
    if (!Character.isLetter(c)  && c != KeyEvent.VK_DELETE) {
        evt.consume(); // Prevent the character from being added to the text field
        Toolkit.getDefaultToolkit().beep(); // Emit a beep to indicate invalid input
    }
}

   public void InputFloat(JTextField txt, KeyEvent evt) {
    char c = evt.getKeyChar();
    // Allowing only numeric characters, backspace, and delete
    if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_DELETE) {
        // Allowing decimal point if it's not already in the text
        if (c == '.' && txt.getText().indexOf('.') == -1) {
            return;
        }
        // Disallowing any other characters
        evt.consume();
        Toolkit.getDefaultToolkit().beep();
    }
}

   
    
}
