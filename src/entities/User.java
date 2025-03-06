package entities;

public class User {
    private String username;
    private String fullName;
    private Integer password;

    public User() {
    }

    public User(String username, String fullName, Integer password) {
        this.username = username;
        this.fullName = fullName;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }
}
