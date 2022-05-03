package com.observer;

public class Product {

    private String name;
    private double currentBid;
    private Bidder buyer;

    public Product(String nombre, double startsAt) {
        this.name = nombre;
        this.currentBid = startsAt;
        this.buyer = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String nombre) {
        this.name = name;
    }

    public double getCurrentBid() {
        return currentBid;
    }

    public void setCurrentBid(double precio) {
        this.currentBid = precio;
    }

    public Bidder getBuyer() {
        return buyer;
    }

    public void setBuyer(Bidder buyer) {
        this.buyer = buyer;
    }

}
