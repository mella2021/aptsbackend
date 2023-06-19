package com.mella.Amusementpark.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;



@AllArgsConstructor
@Data
@Entity
@Table (name="Customer")
public class Customer {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;

    @Column(name="username")
    private String username;

    @Column(name="email")
    private String email;
    @Column(name="phone")
    private String phone;
    @Column(name="password")
    private String password;

    public Customer() {

    }

    public Customer(String username,String email, String phone, String password) {
        this.username= username;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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