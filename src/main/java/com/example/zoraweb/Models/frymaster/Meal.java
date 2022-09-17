package com.example.zoraweb.Models.frymaster;

import javax.persistence.*;

@Entity
@Table(name="meal")
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private long stock;
    @ManyToOne
    @JoinColumn(name="entree_id")
    Entrees entrees;

    @ManyToOne
    @JoinColumn(name = "fry_id")
    Fries fry;

    @ManyToOne
    @JoinColumn(name="user_id")
    User user;

    public Meal() {
    }

    public Meal(long id, long stock, Entrees entrees, Fries fry, User user) {
        this.id = id;
        this.stock = stock;
        this.entrees = entrees;
        this.fry = fry;
        this.user = user;
    }

    public Meal(long stock, Entrees entrees, Fries fry, User user) {
        this.stock = stock;
        this.entrees = entrees;
        this.fry = fry;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getStock() {
        return stock;
    }

    public void setStock(long stock) {
        this.stock = stock;
    }

    public Entrees getEntrees() {
        return entrees;
    }

    public void setEntrees(Entrees entrees) {
        this.entrees = entrees;
    }

    public Fries getFry() {
        return fry;
    }

    public void setFry(Fries fry) {
        this.fry = fry;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
