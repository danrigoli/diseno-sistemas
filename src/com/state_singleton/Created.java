package com.state_singleton;

public class Created implements State{

    private Created(){};
    static private Created instance;

    public static State getInstance() {
        if (Created.instance == null) Created.instance = new Created();
        return Created.instance;
    }

    @Override
    public void edit(Contract contract, String information) {
        contract.setInformation(information);
        contract.changeState(Edited.getInstance());
    }

    @Override
    public void confirm(Contract contract) {
        contract.changeState(Confirmed.getInstance());
    }

    @Override
    public String read(Contract contract) {
//      nothing
        return null;
    }

    @Override
    public void close(Contract contract) {
//      nothing
    }
}
