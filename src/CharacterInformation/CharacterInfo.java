package CharacterInformation;
import java.util.Random;
public class CharacterInfo {
    public static void getAllInfo(){
        System.out.println("Level: 1");
        System.out.println("Alignment: " + alignment());
    }

    public static String alignment(){
        Random rand = new Random();
        int chosen = rand.nextInt(9)+1;
        return switch (chosen) {
            case 1 -> "Lawful Good";
            case 2 -> "Lawful Neutral";
            case 3 -> "Lawful Evil";
            case 4 -> "Neutral Good";
            case 5 -> "True Neutral";
            case 6 -> "Neutral Evil";
            case 7 -> "Chaotic Good";
            case 8 -> "Chaotic Neutral";
            case 9 -> "Chaotic Evil";
            default -> "Error With Alignment";
        };
    }
}
