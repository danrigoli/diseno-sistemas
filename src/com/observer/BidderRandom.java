package com.observer;

public class BidderRandom extends Bidder {


    public BidderRandom(String name) {
        super(name);
    }

    @Override
    public double bid(double current) {
        return current * Math.random()*1.5 + 1;
    }


}
