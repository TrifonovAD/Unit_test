package seminars.third.tdd;

public class User {

    String name;
    String password;

    boolean isAuthenticate = false;

    boolean isAdmin;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = true;
    }

    public boolean authenticate(String name, String password) {
        if (this.name.equals(name) && this.password.equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "User: " + this.name + ", password: " + this.password + ".";
    }

}