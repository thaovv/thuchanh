package com.demo.thuchanh.Etities;

public class User {
    private long id;
    private String email;
    private String password;
    private String phone;
    private boolean active;

    public User(){

    }

    public User(String email, long id, String phone, boolean active, String password) {
        this.email = email;
        this.id = id;
        this.phone = phone;
        this.active = active;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
