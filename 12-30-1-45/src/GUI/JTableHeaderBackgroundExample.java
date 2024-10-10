package GUI;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import javax.swing.table.JTableHeader;

public class JTableHeaderBackgroundExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Create frame
            JFrame frame = new JFrame("JTable Header Background Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
            
            // Create table model
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Column 1");
            model.addColumn("Column 2");
            model.addRow(new Object[]{"Data 1", "Data 2"});
            model.addRow(new Object[]{"Data 3", "Data 4"});

            // Create table
            JTable table = new JTable(model);
            
            // Create custom header renderer
            DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer() {
                @Override
                public Component getTableCellRendererComponent(JTable table, Object value, 
                                                               boolean isSelected, boolean hasFocus, int row, int column) {
                    // Call the superclass to set default properties
                    Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                    // Set background color
                    c.setBackground(Color.BLUE);
                    c.setForeground(Color.WHITE); 
                    return c;
                }
            };
            JTableHeader header = table.getTableHeader();
            header.setDefaultRenderer(headerRenderer);

            // Add table to scroll pane
            JScrollPane scrollPane = new JScrollPane(table);
            frame.add(scrollPane);
            frame.setVisible(true);
        });
    }
}
