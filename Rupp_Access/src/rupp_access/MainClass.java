
package rupp_access;
//
//import com.formdev.flatlaf.themes.FlatMacLightLaf;
//import javax.swing.*;
//public class MainClass {
//    public static void main(String[] args) {
//        try {
//            UIManager.setLookAndFeel(new FlatMacLightLaf());
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        
//        // Your GUI code here
//        JFrame frame = new JFrame("FlatLaf Example");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(300, 200);
//        frame.setVisible(true);
//    }
//}

import javax.swing.*;
import javax.swing.filechooser.FileView;
import java.io.File;

public class MainClass {
    public static void main(String[] args) {
        // Create a file chooser
        JFileChooser fileChooser = new JFileChooser();

        // Set a custom FileView to change icons based on file type
        fileChooser.setFileView(new FileView() {
            @Override
            public Icon getIcon(File f) {
                if (f.isDirectory()) {
                    return UIManager.getIcon("FileView.directoryIcon");  // Default folder icon
                } else if (f.getName().endsWith(".txt")) {
                    return new ImageIcon("path/to/text-file-icon.png");  // Custom text file icon
                } else if (f.getName().endsWith(".pdf")) {
                    return new ImageIcon("path/to/pdf-file-icon.png");   // Custom PDF file icon
                } else {
                    return UIManager.getIcon("FileView.fileIcon");  // Default file icon
                }
            }
        });

        // Show the file chooser dialog
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            System.out.println("Selected file: " + selectedFile.getAbsolutePath());
        }
    }
}

