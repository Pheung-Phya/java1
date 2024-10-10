
package View;
// UserView.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class UserView extends JFrame {
    private final JTextField idField = new JTextField(5);
    private final JTextField nameField = new JTextField(20);
    private final JTextField emailField = new JTextField(20);
    private final JButton saveButton = new JButton("Save");
    private final JButton deleteButton = new JButton("Delete");
    private final JButton updateButton = new JButton("Update");
    private final JButton loadButton = new JButton("Load");

    public UserView() {
        JPanel panel = new JPanel(new GridLayout(5, 2));
        panel.add(new JLabel("ID:"));
        panel.add(idField);
        panel.add(new JLabel("Name:"));
        panel.add(nameField);
        panel.add(new JLabel("Email:"));
        panel.add(emailField);
        panel.add(saveButton);
        panel.add(deleteButton);
        panel.add(updateButton);
        panel.add(loadButton);

        this.add(panel);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    // Getters for the buttons and fields
    public String getId() { return idField.getText(); }
    public String getName() { return nameField.getText(); }
    public String getEmail() { return emailField.getText(); }

    public void setId(String id) { idField.setText(id); }
    public void setName(String name) { nameField.setText(name); }
    public void setEmail(String email) { emailField.setText(email); }

    public void addSaveListener(ActionListener listenForSaveButton) {
        saveButton.addActionListener(listenForSaveButton);
    }

    public void addDeleteListener(ActionListener listenForDeleteButton) {
        deleteButton.addActionListener(listenForDeleteButton);
    }

    public void addUpdateListener(ActionListener listenForUpdateButton) {
        updateButton.addActionListener(listenForUpdateButton);
    }

    public void addLoadListener(ActionListener listenForLoadButton) {
        loadButton.addActionListener(listenForLoadButton);
    }
}


