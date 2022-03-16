package com.class1;

import com.class1.models.Figure;
import com.class1.models.Paper;
import com.class1.models.Rock;
import com.class1.models.Scissor;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class RockPaperScissor {

    public Integer pick() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("1 - Rock");
            System.out.println("2 - Paper");
            System.out.println("3 - Scissors");
            System.out.print("Pick: ");
            String n = reader.readLine();
            return Integer.parseInt(n);
        } catch (Exception e) {
            System.out.println("Write a number");
            return this.pick();
        }
    }
    public void play(int choice) {
        Random random = new Random();

        try {
            Figure pcChoice = figureMapper(random.nextInt(3) + 1);
            System.out.println("PC picked " + pcChoice.getClass().getName());
            Figure userChoice = figureMapper(choice);
            System.out.println("User picked " + userChoice.getClass().getSimpleName());

            if (pcChoice.getWins() == userChoice) {
                System.out.println("You won");
            } else if (pcChoice == userChoice) {
                System.out.println("It's a tie");
                Integer recursiveChoice = this.pick();
                this.play(recursiveChoice);
            } else {
                System.out.println("You lost");
            }
        } catch (Exception e) {
            System.out.println("Write a number");
            Integer recursiveChoice = this.pick();
            this.play(recursiveChoice);
        }
    }

    public Figure figureMapper(int number) throws Exception {
        Figure figure;
        switch (number) {
            case 1:
                figure = Rock.getInstance();
                break;
            case 2:
                figure = Paper.getInstance();
                break;
            case 3:
                figure = Scissor.getInstance();
                break;
            default:
                throw new Exception("not a valid number");
        }
        return figure;
    }
}
