package com.state_singleton;

public class Confirmed implements State {

    private Confirmed() {};
    static private Confirmed instance;

    public static State getInstance() {
        if (Confirmed.instance == null) Confirmed.instance = new Confirmed();
        return Confirmed.instance;
    }

    @Override
    public void edit(Contract contract, String information) {
        // once confirmed it can't be edited
    }

    @Override
    public String read(Contract contract) {
        return contract.getInformation();
    }

    @Override
    public void confirm(Contract contract) {
        // this does nothing because it is already confirmed
    }

    @Override
    public void close(Contract contract) {
        contract.changeState(Closed.getInstance());
    }
}
