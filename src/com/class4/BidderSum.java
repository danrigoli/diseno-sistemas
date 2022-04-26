package com.class4;

public class BidderSum extends Bidder {


    public BidderSum(String name) {
        super(name);
    }

    @Override
    public double bid(double current) {
        return current + 100;
    }


}
