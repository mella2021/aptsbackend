package com.mella.Amusementpark.model;

<<<<<<< HEAD
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;



@AllArgsConstructor
@Data
=======
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

>>>>>>> e018898cbb62a488c6f0aea28af0e128378c84a7
@Entity
@Table (name="Customer")
public class Customer {
    @Id
<<<<<<< HEAD
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;

    @Column(name="username")
    private String username;

    @Column(name="email")
    private String email;
    @Column(name="phone")
    private String phone;
    @Column(name="password")
=======
    @
    private String username;
    private String email;
    private String phone;
>>>>>>> e018898cbb62a488c6f0aea28af0e128378c84a7
    private String password;

    public Customer() {

    }

<<<<<<< HEAD
    public Customer(String username,String email, String phone, String password) {
        this.username= username;
=======
    public Customer(String email, String phone, String password) {
>>>>>>> e018898cbb62a488c6f0aea28af0e128378c84a7
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

<<<<<<< HEAD
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

=======
>>>>>>> e018898cbb62a488c6f0aea28af0e128378c84a7
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
<<<<<<< HEAD
}
=======
}
>>>>>>> e018898cbb62a488c6f0aea28af0e128378c84a7
