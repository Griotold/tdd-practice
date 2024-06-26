package org.study.tddpasswordchecker.book.ch7.userregister;

public class User {

    private String id;
    private String password;
    private String email;

    public User(String id, String pw, String email) {
        this.id = id;
        this.password = pw;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}
