package com.class4;

import java.util.List;

public class Auction {

    public static void main(String[] args) {

        Product product = new Product("Arrrte", 0);
        Owner offerer = new Owner(product);
        Bidder bidderA = new BidderSum("Carlos");
        Bidder bidderB = new BidderRandom("Juan");
        Bidder bidderC = new BidderMultiply("Manuel");

        offerer.registerBidder(bidderA);
        offerer.registerBidder(bidderB);
        offerer.registerBidder(bidderC);

        offerer.updateOffer(bidderA, product.getCurrentBid() + 100);

        System.out.println("Precio final: " + product.getCurrentBid());
        System.out.println("Vendido a: " + product.getBuyer().getName());


    }
}
