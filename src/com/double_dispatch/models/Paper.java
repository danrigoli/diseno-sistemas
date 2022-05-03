package com.double_dispatch.models;

public class Paper extends Figure {

    public int play(Figure figure) {
        return - figure.play(this);
    }

    @Override
    public int play(Rock against) {
        return 1;
    }

    @Override
    public int play(Paper against) {
        return 0;
    }

    @Override
    public int play(Scissor against) {
        return -1;
    }
}