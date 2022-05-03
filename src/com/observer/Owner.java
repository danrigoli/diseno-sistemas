package com.observer;


import java.util.ArrayList;
import java.util.List;

public class Owner implements Subject {

    private final List<Bidder> bidders;
    private final Product product;
    public Owner(Product product)
    {
        this.product = product;
        bidders = new ArrayList<Bidder>();
    }


    public void registerBidder(Bidder observer) {
        this.bidders.add(observer);
    }

    public void removeBidder(Bidder observer) { this.bidders.remove(observer); }

    public void updateOffer(Bidder buyer, double price) {
        if (product.getCurrentBid() < 1000) {
            product.setCurrentBid(price);
            product.setBuyer(buyer);
            this.notifyObservers();
        }
    }

    public void notifyObservers() {
        for (Bidder ob : bidders) {
            double newBid = ob.update(product);
            if (newBid != 0) this.updateOffer(ob, newBid);
        }
    }

}
