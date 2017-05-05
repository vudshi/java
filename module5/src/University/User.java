package University;

import java.util.Date;

/**
 * Created by lsm on 03.05.2017.
 * Base object user. Target: authorization, active status. Logon/off history.
 */
public class User {
    private String login, password, email;
    private boolean enabled;
    private Date registered;

    public User(String login, String password, String email) {
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public Date getRegistered() {
        return registered;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", enabled=" + enabled +
                ", registered=" + registered +
                '}';
    }
}
