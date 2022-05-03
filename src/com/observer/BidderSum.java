package com.observer;

public class BidderSum extends Bidder {


    public BidderSum(String name) {
        super(name);
    }

    @Override
    public double bid(double current) {
        return current + 100;
    }


}
