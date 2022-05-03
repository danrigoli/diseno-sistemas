package com.observer;

interface Subject
{
    void registerBidder(Bidder observer);
    void removeBidder(Bidder observer);
    void notifyObservers();
}