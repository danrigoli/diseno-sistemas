package com.class4;

public class BidderMultiply extends Bidder {


    public BidderMultiply(String name) {
        super(name);
    }

    @Override
    public double bid(double current) {
        return current * 1.1;
    }


}
