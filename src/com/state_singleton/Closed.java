package com.state_singleton;

public class Closed implements State {

    private Closed() {};
    static public Closed instance;
    public static State getInstance() {
        if (Closed.instance == null) Closed.instance = new Closed();
        return Closed.instance;
    }
    @Override
    public void edit(Contract contract, String information) {
//      this does nothing because it is already closed
    }

    @Override
    public String read(Contract contract) {
//      this does nothing because it is already closed
        return contract.getInformation();
    }

    @Override
    public void confirm(Contract contract) {
//      this does nothing because it is already closed
    }

    @Override
    public void close(Contract contract) {
//        this does nothing because it is already closed
    }
}
