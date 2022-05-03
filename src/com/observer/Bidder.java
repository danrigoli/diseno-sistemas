package com.observer;

public abstract class Bidder implements Observer {

    private final String name;

    public Bidder(String name) {
        this.name = name;
    }

    @Override
    public double update(Product product) {
        if (this.equals(product.getBuyer())) {
            return 0;
        } else {
            System.out.println("DEBUG: " + product.getCurrentBid());
            return bid(product.getCurrentBid());
        }
    }

    public String getName() {
        return name;
    }

    public abstract double bid(double current);

}
