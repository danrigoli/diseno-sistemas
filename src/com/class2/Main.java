package com.class2;

import com.class2.models.Figure;
import com.class2.models.Paper;
import com.class2.models.Rock;
import com.class2.models.Scissor;

public class Main {

    public static void main(String[] args) {

        Figure figure = new Paper();
        Figure scissor = new Scissor();

        switch (figure.play(scissor)) {
            case 1: System.out.println("Gano el 1");
            break;
            case 0: System.out.println("Empate");
            break;
            case -1: System.out.println("Gano el 2");
        }
    }
}
