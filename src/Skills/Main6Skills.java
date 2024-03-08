package Skills;

import java.util.Random;

public class Main6Skills {
    public static int statRoller(){
        int rollTotal = 0;
        int[] rolls = new int[4];
        Random rand = new Random();

        for (int i = 0; i < rolls.length; i++) {
            rolls[i] = rand.nextInt(6)+1;
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

    public static int abilityModifier(int total){
        int points = 0;
        if(total == 1 || total == 0){
            points = -5;
        }
        else if(total == 2 || total == 3){
            points = -4;
        }
        else if(total == 4 || total == 5){
            points = -3;
        }
        else if(total == 6 || total == 7){
            points = -2;
        }
        else if(total == 8 || total == 9){
            points = -1;
        }
        else if(total == 12 || total == 13){
            points = 1;
        }
        else if(total == 14 || total == 15){
            points = 2;
        }
        else if(total == 16 || total == 17){
            points = 3;
        }
        else if(total == 18 || total == 19){
            points = 4;
        }
        return points;
    }
}
