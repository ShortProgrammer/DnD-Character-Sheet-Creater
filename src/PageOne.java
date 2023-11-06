import Skills.Abilities;
import Skills.Main6Skills;

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
            allSkills[i][1] = String.valueOf(Main6Skills.statRoller());
            System.out.println(allSkills[i][0] + allSkills[i][1]);
        }
        System.out.println();
        String [][] abilities= Abilities.skills(allSkills);
        for (String[] ability : abilities) {
            System.out.println(ability[0] + ability[1]);
        }
    }
}
