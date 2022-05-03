package com.state_singleton;

public interface State {

    Contract contract = null;

    void edit(String information);
    String read();

    void confirm();

    void close();
}
