package com.state;

public class Contract {

    private String information;
    private static Contract instance;

    public static Contract getInstance() {
        if (Contract.instance == null) Contract.instance = new Contract("");
        return Contract.instance;
    }
    private State state;

    private Contract(String information) {
        this.information = information;
        this.state = new Created(this);
    }

    protected void changeState(State state) {
        this.state = state;
    }

    public String read() {
        return this.state.read();
    }

    public void edit(String information) {
        this.state.edit(information);
    }

    public void confirm() {
        this.state.confirm();
    }

    public void close() {
        this.state.close();
    }

    protected void setInformation(String information) {
        this.information = information;
    }

    protected String getInformation() {
        return information;
    }

    protected State getState() {
        return this.state;
    }
}
