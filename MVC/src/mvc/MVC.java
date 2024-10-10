
package mvc;

import Controller.UserController;
import Model.User;
import View.UserView;

public class MVC {
    public static void main(String[] args) {
        User model = new User();
        UserView view = new UserView();
        UserController controller = new UserController(model,view);
        //UserController controller = new UserController(new User(), new UserView());
    }   
}
