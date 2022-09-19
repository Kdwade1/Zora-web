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

    @Column(nullable= false)
    private long zipcode;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String city;

    @Column(nullable=false)
    private String state;


    public User(User user) {
    }

    public User(long id, String username, String password, String profile_img, String email, long zipcode, String address, String city, String state) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.profile_img = profile_img;
        this.email = email;
        this.zipcode = zipcode;
        this.address = address;
        this.city = city;
        this.state = state;
    }

    public User(String username, String password, String profile_img, String email, long zipcode, String address, String city, String state) {
        this.username = username;
        this.password = password;
        this.profile_img = profile_img;
        this.email = email;
        this.zipcode = zipcode;
        this.address = address;
        this.city = city;
        this.state = state;
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

    public String getUsername() {
        return username;
    }

    public long getZipcode() {
        return zipcode;
    }

    public void setZipcode(long zipcode) {
        this.zipcode = zipcode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
