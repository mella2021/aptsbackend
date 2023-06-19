package com.mella.Amusementpark.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table (name="Customer")
public class Customer {
    @Id
    @
    private String username;
    private String email;
    private String phone;
    private String password;

    public Customer() {

    }

    public Customer(String email, String phone, String password) {
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
