
package Controller;
// UserController.java
import Model.User;
import View.UserView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserController {
    private final User model;
    private final UserView view;

    public UserController(User model, UserView view) {
        this.model = model;
        this.view = view;

        this.view.addSaveListener(new SaveListener());
        this.view.addDeleteListener(new DeleteListener());
        this.view.addUpdateListener(new UpdateListener());
        this.view.addLoadListener(new LoadListener());
    }
    class SaveListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            model.setId(Integer.parseInt(view.getId()));
            model.setName(view.getName());
            model.setEmail(view.getEmail());
            
        }
    }

    class DeleteListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Delete logic goes here
        }
    }

    class UpdateListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Update logic goes here
        }
    }

    class LoadListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
                view.setId(String.valueOf(model.getId()));
                view.setName(model.getName());
                view.setEmail(model.getEmail());
        }
    }
}

