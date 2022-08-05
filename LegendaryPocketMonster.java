//Creating all nessecary variables for the class
public class LegendaryPocketMonster {
public int legAttack;
public int legDefense;
public int legHealth;
public double megaboost;
public String name;
public String placeOfCapture;
	public LegendaryPocketMonster(int a, int d, int h, double boost, String name, String cap) {
		//Constructor initializes all the variables from the class and sets the parameters
		this.legAttack = a;
		this.legDefense = d;
		this.legHealth = h;
		this.megaboost = boost;
		this.name = name;
		this.placeOfCapture = cap;
		
	}
	public void displayLegendaryFacts() {
		//method for displaying facts about the mysterious legendary pokemon, if one so chooses to be brought in
		int totalStats = legAttack + legDefense + legHealth;
		System.out.println("This legendary Pokemon " + name + " is a sight to behold! ");
		System.out.println("What a rare find, this pokemon is rarely seen even at" + placeOfCapture);
		System.out.println("The total power level of this pokemon is " + totalStats );
		
	}
	public void checkLegendStats() {
		//this is the method to check the stats of the legendary pokemon brought in 
		int totalStats = legAttack + legDefense + legHealth;
		System.out.println("This legendary pokemon is so intimidating, checking the stats will be a challenge!");
		//Since legendary pokemon are stronger, the cutoff for this pokemon is much higher to be considered strong
		if(totalStats >= 350) {
			System.out.println("This legendary pokemon is more than ready to meet the Professor's ace in battle");
			
		}
		else {
			System.out.println("This pokemon is suspiciously weak for a legendary Pokemon");
		}
	}
}
