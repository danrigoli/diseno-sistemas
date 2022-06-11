package com.state_singleton;

public interface State {

    static State instance = null;

    static State getInstance(){
        return instance;
    };

    void edit(Contract contract, String information);
    String read(Contract contract);

    void confirm(Contract contract);

    void close(Contract contract);
}
