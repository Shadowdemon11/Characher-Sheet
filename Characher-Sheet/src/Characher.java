
public class Characher {
public String Name = "No name";
public int Strength = 5;
public int Dexterity = 5;
public int Constitution = 5;
public int Intelligence = 5;
public int Wisdom = 5;
public int Charisma = 5;
public String charclass = "Barbarian";
public String race = "Human";
public String Gender = "M";
public int health = 1;
public int mana = 10;
public int exp = 0;
public int level = 1;
// add an inventory that is an array
// add gold
// equip slots
	public void addName(String name, String gender) {
		Name = name;
		Gender = gender;
	}
	public void addStats(int Strength,int Dexterity,int Constitution,int Intelligence,int Wisdom,int Charisma) {
		this.Strength = this.Strength + Strength;
		this.Dexterity = this.Dexterity + Dexterity;
		this.Constitution = this.Constitution + Constitution;
		this.Intelligence = this.Intelligence + Intelligence;
		this.Wisdom = this.Wisdom + Wisdom;
		this.Charisma = this.Charisma + Charisma;
		health = Constitution;
		mana = Intelligence + Wisdom;
		
	}

	public void expSystem(int monsterexp) {
		exp = monsterexp + exp;
		if(exp >= 100){
			//exp = monsterexp + exp;
			level = 2;
		}
		else if(exp >= 200){
			level = 3;
		}
		else if(exp >= 300){
			level = 4;
		}
		else if(exp >= 400){
			level = 5;
		}
		else if(exp >= 500){
			level = 6;
		}
		else if(exp >= 600){
			level = 7;
		}
		else if(exp >= 700){
			level = 8;
		}
		else if(exp >= 800){
			level = 9;
		}
		else if(exp >= 900){
			level = 10;
		}
		else if(exp >= 1000){
			level = 11;
		}
		else if(level == 11){
			
		}
	}
	
	public void raceChoose(String pickedRace) {
		if(pickedRace == "Dwarves") {
			race = pickedRace;
			//Strength = Strength;
			//Dexterity = Dexterity;
			Constitution = Constitution + 2;
			//Intelligence = Intelligence;
			Wisdom = Wisdom + 2;
			Charisma = Charisma - 2;
			
		}
		else if(pickedRace == "Elves") {
			race = pickedRace;
			//Strength = Strength;
			Dexterity = Dexterity + 2;
			Constitution = Constitution - 2;
			Intelligence = Intelligence + 2;
			//Wisdom = Wisdom;
			//Charisma = Charisma;
		}
		else if(pickedRace == "Gnomes") {
			race = pickedRace;
			Strength = Strength - 2;
			//Dexterity = Dexterity + 2;
			Constitution = Constitution + 2;
			//Intelligence = Intelligence + 2;
			//Wisdom = Wisdom;
			Charisma = Charisma + 2;
		}
		else if(pickedRace == "Half-elves") {
			race = pickedRace;
			//Strength = Strength + 2;
			//Dexterity = Dexterity + 2;
			//Constitution = Constitution;
			Intelligence = Intelligence + 2;
			//Wisdom = Wisdom;
			//Charisma = Charisma;
		}
		else if(pickedRace == "Half-orcs") {
			race = pickedRace;
			Strength = Strength + 2;
			//Dexterity = Dexterity + 2;
			//Constitution = Constitution;
			//Intelligence = Intelligence + 2;
			//Wisdom = Wisdom;
			//Charisma = Charisma;
		}
		else if(pickedRace == "Halflings") {
			race = pickedRace;
			Strength = Strength - 2;
			Dexterity = Dexterity + 2;
			//Constitution = Constitution;
			//Intelligence = Intelligence + 2;
			//Wisdom = Wisdom;
			Charisma = Charisma + 2;
		}
		else if(pickedRace == "Humans") {
			race = pickedRace;
			//Strength = Strength + 2;
			//Dexterity = Dexterity + 2;
			Constitution = Constitution + 2;
			//Intelligence = Intelligence + 2;
			//Wisdom = Wisdom;
			//Charisma = Charisma;
		}
		else{
			
		}
	}
	
	public void classChoose(String pickedClass) {
		if(pickedClass == "Barbarian") {
			charclass = pickedClass;
		}
		else if(pickedClass == "Bard") {
			charclass = pickedClass;
		}
		else if(pickedClass == "Cleric") {
			charclass = pickedClass;
		}
		else if(pickedClass == "Druid") {
			charclass = pickedClass;
		}
		else if(pickedClass == "Fighter") {
			charclass = pickedClass;
		}
		else if(pickedClass == "Monk") {
			charclass = pickedClass;
		}
		else if(pickedClass == "Paladin") {
			charclass = pickedClass;
		}
		else if(pickedClass == "Ranger") {
			charclass = pickedClass;
		}
		else if(pickedClass == "Rogue") {
			charclass = pickedClass;
		}
		else if(pickedClass == "Sorcerer") {
			charclass = pickedClass;
		}
		else if(pickedClass == "Wizard") {
			charclass = pickedClass;
		}
		else {
			
		}
	}

}
