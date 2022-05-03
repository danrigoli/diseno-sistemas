package com.state;

public interface State {

    Contract contract = null;

    void edit(String information);
    String read();

    void confirm();

    void close();
}
