
package AbstracClass;
interface Bank1{
       void SignIn();
       void SignUp();
}
interface Bank2{
      void LogOut();
}

class User1 implements Bank1,Bank2{
    @Override
    public void SignIn() {
         System.out.println("SignIn function");
    }

    @Override
    public void SignUp() {
        System.out.println("SignUp function");
    }

    @Override
    public void LogOut() {
         System.out.println("LogOut function");
    }  
}
    
public class MainAbstract {
        public static void main(String[] args) {
                  User1 user = new User1();
                  user.SignIn();
                  user.SignUp();
                  user.LogOut();
                  
        }  
}
