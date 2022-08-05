//this class is a subclass of a legendaryPocketMonster, one that represents a legendaryPocketMonster that is also owned by the professor
public class ProfessorsLegendaryMonster extends LegendaryPocketMonster {

	public String helditem;
	public String Ability;
	public ProfessorsLegendaryMonster(int a, int d, int h, double boost, String name, String cap, String item, String Ability) {
		//constructor with parameters
		super(a, d, h, boost, name,cap);
		this.helditem = item;
		this.Ability = Ability;
	}
	public void displayLegendaryFacts() {
		//creates total stats for convenience , displays facts of a legendary pokemon, but this time from the point of view of the professor.
		int totalStats = legAttack + legDefense + legHealth;
		System.out.println("This pokemon " + name + " is my pride of joy!");
		System.out.println("I found " + name + " and raised it, while studying every part of the creature for science!");
		System.out.println("I got the best of this beast at " + placeOfCapture);
		System.out.println("The total power level of this pokemon is " + totalStats );
		System.out.println("The Ability of " + name + " is " + Ability);
		System.out.println("After Studying this pokemon extensively ,I calculated that the item " + helditem + " is the best for " + name + "'s performance");
	}
	
}

