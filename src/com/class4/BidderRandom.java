package com.class4;

public class BidderRandom extends Bidder {


    public BidderRandom(String name) {
        super(name);
    }

    @Override
    public double bid(double current) {
        return current + 150;
    }


}
