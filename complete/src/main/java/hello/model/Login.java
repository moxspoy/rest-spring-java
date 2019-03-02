package hello.model;

public class Login {
    private String fullName;
    private String password;
    private boolean hasAccess;

    public Login(String fullName, String password) {
        this.fullName = fullName;
        this.password = password;
        this.hasAccess = false;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setHasAccess(boolean hasAccess) {
        this.hasAccess = hasAccess;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPassword() {
        return password;
    }

    public boolean isHasAccess() {
        return hasAccess;
    }
}
