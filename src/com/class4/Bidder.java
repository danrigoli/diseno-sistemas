package com.class4;

public class Bidder implements Observer {

    private String name;

    public Bidder(String name) {
        this.name = name;
    }

    @Override
    public void update(Observer buyer, double price) {
        if (!this.equals(buyer)) System.out.println("Aumentaron la oferta a " + price);
        else System.out.println("Aumentaste la oferta a " + price);
    }

    public String getName() {
        return name;
    }


}
