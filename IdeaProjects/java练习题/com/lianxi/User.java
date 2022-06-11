package com.lianxi;

public class User {

    private String name;
    private String password;
    private int number;

    public User() {
    }

    public User(String name, String password, int number) {
        this.name = name;
        this.password = password;
        this.number = number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", number=" + number +
                '}';
    }
}
