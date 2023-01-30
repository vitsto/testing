package org.example;

public class User {
    private final String login;
    private final String email;

    public User(String login, String email) {
        this.login = login;
        this.email = email;
    }

    public User() {
        this("", "");
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

}
