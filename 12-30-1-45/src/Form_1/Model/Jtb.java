//
//package gui;
//
//import javax.swing.JFrame;
//import javax.swing.JScrollPane;
//import javax.swing.JTable;
//import javax.swing.ListSelectionModel;
//import javax.swing.event.ListSelectionEvent;
//import javax.swing.event.ListSelectionListener;
//
//public class Jtb extends JFrame{
//  
//    String col[]={"ID","Name","Salary"};
//    String data[][]={{"101","Tesla","9000"},{"102","Ford","4000"},{"103","Range","8000"}};
//    
//    JTable table;
//    JScrollPane scroll; // for scroll data
//    
//    public Jtb() {
//        
//        table=new JTable(data, col);
//        scroll=new JScrollPane(table);
//        table.setCellSelectionEnabled(true);
//        ListSelectionModel list = table.getSelectionModel();
//        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//        list.addListSelectionListener(new ListSelectionListener() {
//            @Override
//            public void valueChanged(ListSelectionEvent e) {
//                String data= null;
//                int i,j;
//                 int[] row= new int[]{table.getSelectedRow()};
//                 System.out.println("Row Select :"+row[0]+" Lenght :"+row.length);
//                 int[] col= new int[]{table.getSelectedColumn()};
//                 System.out.println("Col Select :"+row[0]+" Lenght :"+col.length);
//                 for(i=0;i<row.length;i++){
//                     for(j=0;j<col.length;j++){
//                         data=(String) table.getValueAt(row[i], col[j]);
//                         
//                     }
//                 }
//                 
//                 System.out.println("Get Select is :"+data);
//            }
//        });
//        
//        this.add(scroll);
//        this.setTitle("Jtable");
//        this.setLocationRelativeTo(null);
//        this.setSize(700, 200);
//        this.setVisible(true);
//        
//    }
//    
//
//    public static void main(String[] args) {
//        new Jtb();
//    }
//    
//}

package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Jtb extends JFrame {
  
    String col[] = {"ID", "Name", "Salary"};
    String data[][] = {{"101", "Tesla", "9000"}, {"102", "Ford", "4000"}, {"103", "Range", "8000"}};
    
    JTable table;
    JScrollPane scroll; // for scroll data
    
    public Jtb() {
        
        table = new JTable(data, col);
        scroll = new JScrollPane(table);
        table.setCellSelectionEnabled(true);
        ListSelectionModel list = table.getSelectionModel();
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int row = table.getSelectedRow();
                    int col = table.getSelectedColumn();
                    if (row != -1 && col != -1) {
                        String selectedData = (String) table.getValueAt(row, col);
                        System.out.println("Row Selected: " + row);
                        System.out.println("Column Selected: " + col);
                        System.out.println("Selected Data: " + selectedData);
                    }
                }
            }
        });
        
        //This code ខុសគ្នាត្រូវ loop show row and col
        
        this.add(scroll);
        this.setTitle("JTable Example");
        this.setLocationRelativeTo(null);
        this.setSize(700, 200);
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        new Jtb();
    }
}

