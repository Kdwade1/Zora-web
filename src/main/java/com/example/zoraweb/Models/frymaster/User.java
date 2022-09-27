package com.example.zoraweb.Models.frymaster;

import javax.persistence.*;

@Entity
@Table(name="user")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column
    private String profile_img;

    @Column(nullable = false,unique = true)
    private String email;

    @Column(nullable= false)
    private long zipcode;

    @Column(nullable = true)
    private String address;

    @Column(nullable = true)
    private String city;

    @Column(nullable = true)
    private String state;

    @Column
    private String verificationCode;

    @Column
    private boolean enable;


    public User(User user) {
    }

    public User(long id, String username, String password, String profile_img, String email, long zipcode, String address, String city, String state, String verificationCode, boolean enable) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.profile_img = profile_img;
        this.email = email;
        this.zipcode = zipcode;
        this.address = address;
        this.city = city;
        this.state = state;
        this.verificationCode = verificationCode;
        this.enable = enable;
    }

    public User(String username, String password, String profile_img, String email, long zipcode, String address, String city, String state, String verificationCode, boolean enable) {
        this.username = username;
        this.password = password;
        this.profile_img = profile_img;
        this.email = email;
        this.zipcode = zipcode;
        this.address = address;
        this.city = city;
        this.state = state;
        this.verificationCode = verificationCode;
        this.enable = enable;
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

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }
}
