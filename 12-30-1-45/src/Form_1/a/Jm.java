package Form_1.a;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.desktop.OpenFilesEvent;
import java.awt.desktop.OpenFilesHandler;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import java.io.File;
import javax.swing.JOptionPane;
import jdk.jfr.consumer.EventStream;

public class Jm extends JFrame implements ActionListener{
    
    JMenuBar bar;
    JMenu file, edit,view;
    JMenuItem n,o,cut,copy,past,selAll,prop,snap;
    JTextArea text;
    
    public Jm(){
        
        bar = new JMenuBar();
        
        file=new JMenu("File");
        n=new JMenuItem("New file");
        o= new JMenuItem("Open file"); // for open file to take picture
        o.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
         JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(Jm.this); // Here
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    JOptionPane.showMessageDialog(Jm.this, "Selected file: " + selectedFile.getAbsolutePath());
                }
           }
        });
        file.add(n);
        file.add(o);
        
        edit=new JMenu("Edit");
        copy= new JMenuItem("Copy");  // making copy can work
        copy.addActionListener(this);
        past= new JMenuItem("Past");
        past.addActionListener(this); // making past can work
        cut=new JMenuItem("Cut");
        cut.addActionListener(this); // making cut can work
        selAll= new JMenuItem("Select All");  // making select all can work
        selAll.addActionListener(this);
        
        edit.add(copy);
        edit.add(past);
        edit.add(cut);
        edit.add(selAll);
        
        view= new JMenu("View");
        snap=new JMenuItem("Snap Code");
        prop=new JMenuItem("Property");
        view.add(snap);
        view.add(prop);
        // add three to MenuBar
        bar.add(file);
        bar.add(edit);
        bar.add(view);
        
        text= new JTextArea();
        text.setBounds(20, 20, 600, 100);
        text.setFont(new Font("", Font.PLAIN, 20));
        
        
        this.add(text);
        this.setJMenuBar(bar); // for show menubar at here
        this.setLayout(null);
        this.setSize(700, 700);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    public static void main(String[] args){
        new Jm();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(copy==e.getSource()){
            text.copy();
        }
        if(past==e.getSource()){
            text.paste();
        }
        if(cut==e.getSource()){
            text.cut();
        }
        if(selAll==e.getSource()){
            text.selectAll();
        }
        
       }
}


/*
package gui;
import javax.swing.*;

public class Jm {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Menu Bar Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create the File menu
        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        // Create the Help menu
        JMenu helpMenu = new JMenu("Help");
        menuBar.add(helpMenu);

        // Create the Edit menu
        JMenu editMenu = new JMenu("Edit");

        // Create menu items for the Edit menu
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");
        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem selectAllItem = new JMenuItem("Select All");

        // Add menu items to the Edit menu
        editMenu.add(copyItem);
        editMenu.add(pasteItem);
        editMenu.add(cutItem);
        editMenu.addSeparator(); // Adds a separator line
        editMenu.add(selectAllItem);

        // Add the Edit menu to the menu bar
        menuBar.add(editMenu);

        // Set the menu bar for the frame
        frame.setJMenuBar(menuBar);

        // Make the frame visible
        frame.setVisible(true);
    }
}

*/
