package com.state_singleton;

public class Created implements State{

    private final Contract contract;

    public Created(Contract contract) {
        this.contract = contract;
    }

    @Override
    public void edit(String information) {
        this.contract.setInformation(information);
        this.contract.changeState(new Edited(this.contract));
    }

    @Override
    public void confirm() {
        this.contract.changeState(new Confirmed(this.contract));
    }

    @Override
    public String read() {
//      nothing
        return null;
    }

    @Override
    public void close() {
//      nothing
    }
}
