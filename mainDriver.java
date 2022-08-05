import java.util.Scanner;

public class mainDriver { //main method uses scanner
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
      	//creating and initalizing variables that will be used to represent user input later on 
      int pokeHealth = 0;
      int pokeAttack = 0;
      int pokeDefense = 0;
      String pokemonName = new String(); //an intro method explaining to the user what to input to show the Assistant a pocketMonster(Input objects parameters with user input)
      System.out.println("Welcome to professor Pratham's Laboratory,My name is Ronnie and I am his assistant. I can see you are an aspiring trainer, with many pokemon by your side");
      System.out.println("Our professor has brought his own legendary Pokemon of special status from a faraway land.");
      System.out.println("If you show us your pokemon, we will be able to tell you whether or not you have brought a worthy opponent for battle");
      
		 //sets their option as an int to use in if statements
		
		int moveForward = 0;
		while(moveForward == 0) {
			System.out.println("With that being said, enter 1 if you have brought a regular pokemon, and 2 if you have brought a Legendary pokemon instead");
			int typeOfCreature = input.nextInt();
		if (typeOfCreature == 1) {
			System.out.println("What is the name of your pokemon"); //asked for name outside of if statements as whether it is legendary or not, name will remain same
			pokemonName = input.next();
			//asks for stats and parameters and stores them in variables initialized earlier
			System.out.println("Please input the attack stat of your pokemon");
			pokeAttack = input.nextInt();
			System.out.println("Please input the health stat of your pokemon");
			pokeHealth = input.nextInt();
			System.out.println("Please input the Defense stat of your pokemon");
			pokeDefense = input.nextInt();
      // uses these newly inputted values to create a pocketMonster object, representing the user's pokemon,
			//and uses the checkStats() command to show the user his pokemon's strength
			
			PocketMonster userMonster = new PocketMonster(pokeHealth,pokeDefense , pokeAttack , pokemonName);
			System.out.println("Now, our crew here at the professors laboratory will check the pokemon " + pokemonName + " you have shown us, and see if it can match up against the professors Legendary pokemon!");
			userMonster.checkStats();
		}//if the user selects option 2, it uses another if statement for legendaryPocketMonster information and initializes new variables
		else if (typeOfCreature == 2) {
			System.out.println("What is the name of your first pokemon"); //asked for name outside of if statements as whether it is legendary or not, name will remain same
			pokemonName = input.next();
			int legPokeAttack = 0;
			int legPokeHealth = 0;
			int legPokeDefense = 0;
			String whereYouCaught = new String();
			System.out.println("Please input the attack stat of your legendary pokemon");
			legPokeAttack = input.nextInt();
			System.out.println("Please input the health stat of your legendary pokemon");
			legPokeHealth = input.nextInt();
			System.out.println("Please input the Defense stat of your legendary pokemon");
			legPokeDefense = input.nextInt();
			System.out.println("Where did you capture this magnificent Legendary Pokemon");
			whereYouCaught = input.next();
			//from here, it takes all the new parameters for the LegendaryPocketMonster class, and creates an object with the user input information
			LegendaryPocketMonster userLegend = new LegendaryPocketMonster(legPokeAttack, legPokeDefense, legPokeHealth,2, pokemonName, whereYouCaught);
			System.out.println("Now, our crew here at the professors laboratory will check the pokemon " + pokemonName + " you have shown us, and see if it can match up against the professors Legendary pokemon!");
			userLegend.checkLegendStats();
			//it uses the checkLegendStats to display the strength of the user's legendary pokemon back  to them
		}
		else {
			//if user does not select 1 or 2 at the start, this will display and let the user know his pokemon can not be checked
		 System.out.println("Oh,I am afraid you have not selected an option that allows us to check a pokemon of yours");
		}
		System.out.println("----------------");
		System.out.println("Thank you for coming here today, please enter 1 if you want to continue showing pokemon, or hit 2 for me to call Professor Prat, so he can show you a real pokemon!");
		int newDecision = input.nextInt();
			if(newDecision != 1 ) {
				
				 moveForward = moveForward + 1;
			}
		}
		
		//this is where the professor shows the user his own legendary pokemon,
		//which is an object of the ProfessorsLegendaryMonster class. and displays facts about his legendary pokemon to the user
		
		System.out.println("------------------------------------------------------------------");
		System.out.println("*Professor Pratham Walks in*");
		System.out.println("Now that you have had the chance to show Assistant Ronnie the pokemon you have brought. I think it is time we show you how a real Legendary looks" );
		System.out.println("BEHOLD, THE MIGHTY POWER OF A REAL GOD");
		ProfessorsLegendaryMonster beast = new ProfessorsLegendaryMonster(140, 180, 150 , 2, "Articuno" , "Coronet", "specs", "FrostbiteFingers");
		beast.displayLegendaryFacts();
	}
}
