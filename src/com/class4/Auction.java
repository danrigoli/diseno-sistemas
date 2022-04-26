package com.class4;

import java.util.List;

public class Auction {

    public static void main(String[] args) {

        Product product = new Product("Coca");
        Offerer offerer = new Offerer(product);
        int i = 0;
        Bidder bidderA = new Bidder("Menem");
        Bidder bidderB = new Bidder("Juan");
        Bidder bidderC = new Bidder("Manuel");

        offerer.registerBidder(bidderA);
        offerer.registerBidder(bidderB);
        offerer.registerBidder(bidderC);

//        List<Observer> ofertantes = offerer.getObservers();

        while (i < 10) {
            offerer.updateOffer(bidderA, product.getCurrentBid() + 100);
            offerer.updateOffer(bidderB, product.getCurrentBid() * 1.1);
            offerer.updateOffer(bidderC, product.getCurrentBid() + 150 );
            i++;
        }

        System.out.println("Precio final: " + product.getCurrentBid());

    }
}
