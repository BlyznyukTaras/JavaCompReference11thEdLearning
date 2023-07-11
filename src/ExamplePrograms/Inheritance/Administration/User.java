package src.ExamplePrograms.Inheritance.Administration;

public class User {
    String username;
    String password;
    boolean isLogin = false;
    public User(String user, String pw) {
        username = user;
        password = pw;
    }
    public User(User obj) {
        username = obj.username;
        password = obj.password;
    }
    public void login() {
        if (!isLogin) {
            isLogin = true;
            System.out.println("You have successfully logged into the system");
        }
        else System.out.println("There is no need to login again");
    }
    public void logout() {
        if (isLogin) {
            isLogin = false;
            System.out.println("You have successfully logged out of the system");
        }
        else System.out.println("There is no need to logout again");
    }
}
