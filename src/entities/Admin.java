package entities;

public class Admin extends User{
    private int keyAccess;

    public Admin(int keyAccess) {
        this.keyAccess = keyAccess;
    }

    public Admin(String username, String fullName, Integer password, int keyAccess) {
        super(username, fullName, password);
        this.keyAccess = keyAccess;
    }

    public Admin() {
    }

    public int getKeyAccess() {
        return keyAccess;
    }

    public void setKeyAccess(int keyAccess) {
        this.keyAccess = keyAccess;
    }
}
