package com.example.lab5.models;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;
    @Column(name = "first_name", nullable = false)
    private String first_name;
    @Column(name = "last_name", nullable = false)
    private String last_name;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "email",unique = true,nullable = false)
    private String email;
    @Column(name = "registration_date",nullable = false)
    private Date registration_date;

    public User() {}
    public User(String first_name,String last_name, String password, String email,Date registration_date) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.password = password;
        this.email = email;
        this.registration_date = registration_date;
    }

    public Long getId() {
        return user_id;
    }
    public void setId(Long id) {
        this.user_id = id;
    }

    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String name) {
        this.first_name = name;
    }

    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String name) {
        this.last_name = name;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public Date getRegistration_date() {
        return registration_date;
    }
    public void setRegistration_date(Date registration_date) {
        this.registration_date = registration_date;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", registration_date=" + registration_date +
                '}';
    }
}