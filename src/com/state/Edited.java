package com.state;

public class Edited implements State{

    private final Contract contract;

    public Edited(Contract contract) {
        this.contract = contract;
    }

    @Override
    public void edit(String information) {
        this.contract.setInformation(information);
    }

    @Override
    public void confirm() {
        this.contract.changeState(new Confirmed(this.contract));
    }

    @Override
    public String read() {
        // this does nothing because it is edited not confirmed
        return null;
    }

    @Override
    public void close() {
//        this does nothing because it is edited not confirmed
    }
}
