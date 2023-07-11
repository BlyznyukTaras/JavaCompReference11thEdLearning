package src.ExamplePrograms.Inheritance.Administration;

public class Admin extends User {
    int adminLevel;
    public Admin(User obj, int admLvl) {
        super(obj);
        adminLevel = admLvl;
    }
    public Admin(Admin obj) {
        super(obj);
        adminLevel = obj.adminLevel;
    }
    public void logoutUser(User user) {
        if (user.isLogin) {
            user.isLogin = false;
            System.out.println("This user was successfully logged out");
        }
        else System.out.println("There is no need to do that");
    }
    public void showUserInfo(User user) {
        System.out.println("User's name: " + user.username + ", password: " + user.password);
    }
}
