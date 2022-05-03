package com.state;

public class Closed implements State {

    private final Contract contract;

    public Closed(Contract contract) {
        this.contract = contract;
    }
    @Override
    public void edit(String information) {
//      this does nothing because it is already closed
    }

    @Override
    public String read() {
//      this does nothing because it is already closed
        return null;
    }

    @Override
    public void confirm() {
//      this does nothing because it is already closed
    }

    @Override
    public void close() {
//        this does nothing because it is already closed
    }
}
