import java.util.ArrayList;
import java.util.Arrays;

public class playerChar extends Character{

    private String playName;
    private Races playRace;
    private Classes playClass;
    private int[] generatedStats;

    private int profBonus;
    private int dex;
    private int str;
    private int con;
    private int intel;
    private int wis;
    private int cha;
    
    private ArrayList<String> skills;
    private boolean[] skillProfs;

	public playerChar(String playName, Races playRace, Classes playClass, int[] generatedStats, int profBonus) {
		this.playName = playName;
		this.playRace = playRace;
		this.playClass = playClass;
		this.generatedStats = generatedStats;
		this.profBonus = profBonus;
		String allSkills[] = new String[] {"athletics","acrobatics","sleightOfHand","stealth","arcana","history","investigation", "nature",
				"religion","animalHandling","insight","medicine","perception","survival","deception","intimidation","performance","persuasion"};
		skills = new ArrayList<String>(Arrays.asList(allSkills));
		skillProfs = new boolean[18];
	}
	
	public playerChar(String playName, Races playRace, Classes playClass, int profBonus, int dex, int str, int con,
			int intel, int wis, int cha) {
		this.playName = playName;
		this.playRace = playRace;
		this.playClass = playClass;
		this.profBonus = profBonus;
		this.dex = dex;
		this.str = str;
		this.con = con;
		this.intel = intel;
		this.wis = wis;
		this.cha = cha;
		String[] allSkills = new String[] {"athletics","acrobatics","sleightOfHand","stealth","arcana","history","investigation", "nature",
				"religion","animalHandling","insight","medicine","perception","survival","deception","intimidation","performance","persuasion"};
		skills = new ArrayList<String>(Arrays.asList(allSkills));
		skillProfs = new boolean[18];
	}

	public Classes getPlayClass() {
		return playClass;
	}

	public void setPlayClass(Classes playClass) {
		this.playClass = playClass;
	}

	public String getPlayName() {
		return playName;
	}

	public void setPlayName(String playName) {
		this.playName = playName;
	}

	public Races getPlayRace() {
		return playRace;
	}

	public void setPlayRace(Races playRace) {
		this.playRace = playRace;
	}

	public int[] getGeneratedStats() {
		return generatedStats;
	}

	public void setGeneratedStats(int[] generatedStats) {
		this.generatedStats = generatedStats;
	}

	public int getProfBonus() {
		return profBonus;
	}

	public void setProfBonus(int profBonus) {
		this.profBonus = profBonus;
	}

	public int getDex() {
		return dex;
	}

	public void setDex(int dex) {
		this.dex = dex;
	}

	public int getStr() {
		return str;
	}

	public void setStr(int str) {
		this.str = str;
	}

	public int getCon() {
		return con;
	}

	public void setCon(int con) {
		this.con = con;
	}

	public int getIntel() {
		return intel;
	}

	public void setIntel(int intel) {
		this.intel = intel;
	}

	public int getWis() {
		return wis;
	}

	public void setWis(int wis) {
		this.wis = wis;
	}

	public int getCha() {
		return cha;
	}

	public void setCha(int cha) {
		this.cha = cha;
	}

	public void genStats() {
    	generatedStats = new int[] {rollDice.sum3D6(),rollDice.sum3D6(),rollDice.sum3D6(),rollDice.sum3D6(),rollDice.sum3D6(),rollDice.sum3D6()};
		System.out.println("Generated: ");
        for(int i = 0; i < generatedStats.length; i ++) {			
			System.out.println("[" + i + "] " + generatedStats[i]);
		}
		
    }

    public void assignAllStats(int[] allStats){
    	setStr(allStats[1]);
    }
    
    public void setSkillProf(String skill, boolean prof) {
    	for(String s : skills) {
    		if(s.equalsIgnoreCase(skill)) skillProfs[skills.indexOf(skill)] =  prof;
    	}
    }
    
    
}