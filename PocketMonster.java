//pocket monster class, representing pokemon objects that will be created
public class PocketMonster {
public int health;
public int defense;
public int attack;
public String name;
	public PocketMonster(int h, int d, int a , String name) {
		this.attack = a;
		this.defense = d;
		this.health = h;
		this.name = name;
	}
	//A method for checking the stats of any pocketMonster object that is created,whether inputted by the user or included as an example 
	public void checkStats() { //creates totalStat, which represents all the stats (ints) of the pocketmonster added together, and uses
		//- and uses if statements to indicate the strength level, and if it can compare with the professorsLegendary
		int totalStat = health + attack + defense;
		if (totalStat >= 270) {
			System.out.println("Wow, that is quite the strong pokemon you have captured, it may be able to battle with the professors Legendary Pokemon");
		}
		else if (totalStat > 150 && totalStat < 270) {
			System.out.println("This pokemon is Strong, but it could be stronger");
		}
		else {
			System.out.println("This pokemon could use a lot of training before fighting with legendary pokemon");
		}
	}
}
