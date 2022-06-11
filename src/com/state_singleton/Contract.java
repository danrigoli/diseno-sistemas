package com.state_singleton;

public class Contract {

    private String information;
    private State state;

    Contract(String information) {
        this.information = information;
        this.state = Created.getInstance();
    }

    protected void changeState(State state) {
        this.state = state;
    }

    public String read() {
        return this.state.read(this);
    }

    public void edit(String information) {
        this.state.edit(this, information);
    }

    public void confirm() {
        this.state.confirm(this);
    }

    public void close() {
        this.state.close(this);
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
