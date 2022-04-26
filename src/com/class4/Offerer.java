package com.class4;


import java.util.ArrayList;
import java.util.List;

public class Offerer implements Subject {

    private List<Observer> observers;
    private Product product;
    public Offerer(Product product)
    {
        this.product = product;
        observers = new ArrayList<Observer>();
    }


    public void registerBidder(Observer observer) {
        this.observers.add(observer);
    }

    public void removeBidder(Observer observer) { this.observers.remove(observer); }

    public void updateOffer(Bidder buyer, double price) {
        if (product.getCurrentBid() <= 1000) {
            product.setCurrentBid(price);
            product.setBuyer(buyer);
            System.out.println("Atencion! Se puso un nuevo precio de " + product.getCurrentBid() + " por " + buyer.getName());
            this.notifyObservers();
        } else {
            System.out.println("Vendido! " + product.getBuyer().getName());
        }
    }

    public void notifyObservers() {
        for (Observer ob : observers) {
            ob.update(product.getBuyer(), product.getCurrentBid() );
        }
    }

    public List<Observer> getObservers() {
        return observers;
    }

}
