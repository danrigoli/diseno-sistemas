package com.double_dispatch.models;

public abstract class Figure {

    public abstract int play(Figure figure);

    public abstract int play(Rock against);

    public abstract int play(Paper against);

    public abstract int play(Scissor against);
}
