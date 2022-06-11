package com.state_singleton;

public class Edited implements State{

    private Edited(){};
    static private Edited instance;

    public static State getInstance() {
        if (Edited.instance == null) Edited.instance = new Edited();
        return Edited.instance;
    }

    @Override
    public void edit(Contract contract, String information) {
        contract.setInformation(information);
    }

    @Override
    public void confirm(Contract contract) {
        contract.changeState(Confirmed.getInstance());
    }

    @Override
    public String read(Contract contract) {
        // this does nothing because it is edited not confirmed
        return null;
    }

    @Override
    public void close(Contract contract) {
//        this does nothing because it is edited not confirmed
    }
}
