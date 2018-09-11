package ood.quora;

import java.util.HashMap;
import java.util.List;

public class User {
    private String loginId;
    private String password;
    private String userName;
    private List<User> followers;

    public User(String loginId, String password, String userName) {
        this.loginId = loginId;
        this.password = password;
        this.userName = userName;
    }
}
