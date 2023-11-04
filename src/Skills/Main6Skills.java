package Skills;

import java.util.Random;

public class Main6Skills {
    public static int statRoller(){
        int rollTotal = 0;
        int[] rolls = new int[4];
        Random rand = new Random();

        for (int i = 0; i < rolls.length; i++) {
            rolls[i] = rand.nextInt(6);
        }

        int lowest = rolls[0];
        int placement = 0;

        for (int i = 0; i < rolls.length; i++) {
            if (i + 1 < rolls.length && lowest > rolls[i + 1]) {
                placement = i + 1;
                lowest = rolls[i + 1];
            }
        }
        rolls[placement] = 0;

        for (int roll : rolls) {
            rollTotal += roll;
        }

        return rollTotal;
    }
}
