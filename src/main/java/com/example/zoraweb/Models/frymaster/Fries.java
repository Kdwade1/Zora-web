package com.example.zoraweb.Models.frymaster;

import javax.persistence.*;

@Entity
@Table(name="fries")

public class Fries {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    String fry_type;

    @Column
    private String fry_img;

    @Column
    private double price;

    @Column
    private long quantity;

    @Column
    private String size;




    public Fries() {
    }

    public Fries(long id, String fry_type, String fry_img, double price, long quantity, String size) {
        this.id = id;
        this.fry_type = fry_type;
        this.fry_img = fry_img;
        this.price = price;
        this.quantity = quantity;
        this.size = size;
    }

    public Fries(String fry_type, String fry_img, double price, long quantity, String size) {
        this.fry_type = fry_type;
        this.fry_img = fry_img;
        this.price = price;
        this.quantity = quantity;
        this.size = size;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFry_type() {
        return fry_type;
    }

    public void setFry_type(String fry_type) {
        this.fry_type = fry_type;
    }


    public String getFry_img() {
        return fry_img;
    }

    public void setFry_img(String fry_img) {
        this.fry_img = fry_img;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
