package com.class4;

interface Subject
{
    void registerBidder(Bidder observer);
    void removeBidder(Bidder observer);
    void notifyObservers();
}