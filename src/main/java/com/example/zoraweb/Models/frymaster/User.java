package com.example.zoraweb.Models.frymaster;

import javax.persistence.*;

@Entity
@Table(name="user")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column
    private String profile_img;

    @Column(nullable = false)
    private String email;



    public User(long id, String username, String password, String profile_img, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.profile_img = profile_img;
        this.email = email;
    }

    public User(String username, String password, String profile_img, String email) {
        this.username = username;
        this.password = password;
        this.profile_img = profile_img;
        this.email = email;
    }

    public User(User user) {

    }

    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getusername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfile_img() {
        return profile_img;
    }

    public void setProfile_img(String profile_img) {
        this.profile_img = profile_img;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
