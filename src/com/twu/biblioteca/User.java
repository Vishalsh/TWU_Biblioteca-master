package com.twu.biblioteca;


public class User {

    private String name;

    private String username;

    private String password;

    private String email;

    private String phone_number;

    private String status;

    public User(String name, String username, String password, String email, String phone_number, String status) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone_number = phone_number;
        this.status = status;
    }

    public String getName() {
        return this.name;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phone_number;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

