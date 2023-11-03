import java.util.Arrays;
import java.util.Random;

public class PageOne {
    public static void completePage(){
        skillStats();
    }

    //For the main 6 stats
    public static void skillStats(){
        String [][] allSkills = new String[6][2];
        String[] skillNames = new String [] {"Strength: ", "Dexterity: ", "Constitution: ", "Intelligence: ", "Wisdom: ", "Charisma: "};
        for(int i = 0; i < 6; i++){
            allSkills[i][0] = skillNames[i];
            allSkills[i][1] = String.valueOf(statRoller());
            System.out.println(allSkills[i][0] + allSkills[i][1]);
        }
    }

    private static int statRoller(){
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
