package Skills;

public class Abilities {
    public static String [][] skills(String [][] allSkills){
        String [][] abilities = new String [18][2];
        abilities[0][0]= "Acrobatics: ";
        abilities[0][1]= String.valueOf(Main6Skills.abilityModifier(Integer.parseInt(allSkills[1][1])));

        abilities[1][0]= "Animal Handling: ";
        abilities[1][1]= String.valueOf(Main6Skills.abilityModifier(Integer.parseInt(allSkills[4][1])));

        abilities[2][0]= "Arcana: ";
        abilities[2][1]= String.valueOf(Main6Skills.abilityModifier(Integer.parseInt(allSkills[3][1])));

        abilities[3][0]= "Athletics: ";
        abilities[3][1]= String.valueOf(Main6Skills.abilityModifier(Integer.parseInt(allSkills[0][1])));

        abilities[4][0]= "Deception: ";
        abilities[4][1]= allSkills[5][1];

        abilities[5][0]= "History: ";
        abilities[5][1]= String.valueOf(Main6Skills.abilityModifier(Integer.parseInt(allSkills[3][1])));

        abilities[6][0]= "Insight: ";
        abilities[6][1]= String.valueOf(Main6Skills.abilityModifier(Integer.parseInt(allSkills[4][1])));

        abilities[7][0]= "Intimidation: ";
        abilities[7][1]= String.valueOf(Main6Skills.abilityModifier(Integer.parseInt(allSkills[5][1])));

        abilities[8][0]= "Investigation: ";
        abilities[8][1]= String.valueOf(Main6Skills.abilityModifier(Integer.parseInt(allSkills[3][1])));

        abilities[9][0]= "Medicine: ";
        abilities[9][1]= String.valueOf(Main6Skills.abilityModifier(Integer.parseInt(allSkills[4][1])));

        abilities[10][0]= "Nature: ";
        abilities[10][1]= String.valueOf(Main6Skills.abilityModifier(Integer.parseInt(allSkills[4][1])));

        abilities[11][0]= "Perception: ";
        abilities[11][1]= String.valueOf(Main6Skills.abilityModifier(Integer.parseInt(allSkills[4][1])));

        abilities[12][0]= "Performance: ";
        abilities[12][1]= String.valueOf(Main6Skills.abilityModifier(Integer.parseInt(allSkills[5][1])));

        abilities[13][0]= "Persuasion: ";
        abilities[13][1]= String.valueOf(Main6Skills.abilityModifier(Integer.parseInt(allSkills[5][1])));

        abilities[14][0]= "Religion: ";
        abilities[14][1]= String.valueOf(Main6Skills.abilityModifier(Integer.parseInt(allSkills[3][1])));

        abilities[15][0]= "Sleight of Hand: ";
        abilities[15][1]= String.valueOf(Main6Skills.abilityModifier(Integer.parseInt(allSkills[1][1])));

        abilities[16][0]= "Stealth: ";
        abilities[16][1]= String.valueOf(Main6Skills.abilityModifier(Integer.parseInt(allSkills[1][1])));

        abilities[17][0]= "Survival: ";
        abilities[17][1]= String.valueOf(Main6Skills.abilityModifier(Integer.parseInt(allSkills[4][1])));
        return abilities;
    }
}
