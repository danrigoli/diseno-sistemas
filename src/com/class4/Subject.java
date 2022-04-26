package com.class4;

interface Subject
{
    void registerBidder(Observer observer);
    void removeBidder(Observer observer);
    void notifyObservers();
}