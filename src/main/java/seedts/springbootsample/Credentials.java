package seedts.springbootsample;

public class Credentials {

    private String user;
    private String password;

    public Credentials(String username, String password) {
        user = username;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}