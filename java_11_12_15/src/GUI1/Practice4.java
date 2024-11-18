package GUI1;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Practice4 extends JFrame {
    private JTable table;
    private JScrollPane scroll;
    private DefaultTableModel model; // Use DefaultTableModel for dynamic table data
    private String[] head = {"ID", "NAME", "GENDER", "SALARY"};
    private List<String[]> dataList; // List to store data entries
    private ListSelectionListener select; // Declare ListSelectionListener

    public Practice4() {
        model = new DefaultTableModel(head, 0); // Initialize the model with headers
        dataList = new ArrayList<>(); // Initialize the list
        addInitialData(); // Populate the list with initial data
        updateTable(); // Update the table model with the initial data

        table = new JTable(model);
        table.setCellSelectionEnabled(true);

        // Initialize the selection listener
        select = new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) { // Check if the selection is adjusting
                    int row = table.getSelectedRow();
                    int col = table.getSelectedColumn();
                    if (row != -1 && col != -1) { // Ensure valid selection
                        System.out.println("Selected - row: " + row + ", col: " + col);
                        System.out.println("Value: " + table.getValueAt(row, col));

                        // Get the data from the selected row
                        String id = (String) table.getValueAt(row, 0);
                        String name = (String) table.getValueAt(row, 1);
                        String gender = (String) table.getValueAt(row, 2);
                        String salary = (String) table.getValueAt(row, 3);

                        // Perform any action with the selected data
                        System.out.println("Selected Entry: ID=" + id + ", Name=" + name + ", Gender=" + gender + ", Salary=" + salary);
                    }
                }
            }
        };

        // Attach the selection listener to the table
        table.getSelectionModel().addListSelectionListener(select);

        scroll = new JScrollPane(table);
        this.add(scroll);

        JButton addRowButton = new JButton("Add Row");
        addRowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = JOptionPane.showInputDialog("Enter ID:");
                String name = JOptionPane.showInputDialog("Enter Name:");
                String gender = JOptionPane.showInputDialog("Enter Gender:");
                String salary = JOptionPane.showInputDialog("Enter Salary:");

                // Add the new entry to the list and update the table
                if (id != null && name != null && gender != null && salary != null) {
                    String[] newRow = {id, name, gender, salary};
                    dataList.add(newRow); // Add to the list
                    updateTable(); // Update the table model
                }
            }
        });

        this.add(addRowButton, "South"); 
        this.setSize(700, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit the application when closing the window
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void addInitialData() {
        String[][] initialData = {
            {"123", "Taka", "Male", "999.99"},
            {"222", "Mina", "Female", "888.99"},
            {"341", "Tola", "Male", "777.99"}
        };
        
        // Add initial data to the list
        for (String[] row : initialData) {
            dataList.add(row);
        }
    }

    // Update the table model based on the dataList
    private void updateTable() {
        model.setRowCount(0); // Clear the existing rows in the model
        for (String[] row : dataList) {
            model.addRow(row); // Add rows from the list
        }
    }

    public static void main(String[] args) {
        new Practice4();
    }
}
