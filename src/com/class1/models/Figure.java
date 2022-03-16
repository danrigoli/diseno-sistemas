package com.class1.models;

public abstract class Figure {
    private Figure wins;

    Figure(Figure wins) {
        this.wins = wins;
    }

    public Figure getWins() {
        return wins;
    }

    public int play(Figure against) {
        if (against.getWins() == this) return -1;
        else if (this.getWins() == against) return 1;
        else return 0;
    }
}
