package src.ExamplePrograms.Inheritance.Administration;

public class RegularUser extends User {
    public RegularUser(User obj) { super(obj); }
    public void changePassword(String newPassword) {
        if (!newPassword.equals(password)) password = newPassword;
        else System.out.println("Can't change your password: similarity with the current one");
    }
}
