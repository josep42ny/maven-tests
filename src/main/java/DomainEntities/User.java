package DomainEntities;

import javaTesting.Resources.PasswordUtils;

public class User {

    private String name;
    private String password;
    private String salt;

    public User(String name, String password) {
        this.name = name;
        this.salt = PasswordUtils.genSalt();
        this.setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean verifyPassword(String password) {
        return PasswordUtils.verifyPassword(password, this.salt, this.password);
    }

    public void setPassword(String password) {
        this.password = PasswordUtils.saltPassword(password, this.salt);
    }

}
