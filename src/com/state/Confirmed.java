package com.state;

public class Confirmed implements State {

    private final Contract contract;
    public Confirmed(Contract contract) {
        this.contract = contract;
    }

    @Override
    public void edit(String information) {
        // once confirmed it can't be edited
    }

    @Override
    public String read() {
        return this.contract.getInformation();
    }

    @Override
    public void confirm() {
        // this does nothing because it is already confirmed
    }

    @Override
    public void close() {
        this.contract.changeState(new Closed(this.contract));
    }
}
