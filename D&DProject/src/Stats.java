import java.util.Random;
import java.util.Scanner;

public class Stats {

	static void stat() {
		
		System.out.println(" ");
		System.out.println("Now it's time to assign your stats ");
		System.out.println("The character stats deal with their Strength, Charisma, Wisdom, Intelligance, Consitution, and Dexterity.");
		
		System.out.println(" ");
		System.out.println("Remind me, do you know how stats work?");
		System.out.println("(1) No");
		System.out.println("(2) Yes");
		
		System.out.println(" ");

		Scanner statsKnowledge = new Scanner(System.in);
		int knowStats = statsKnowledge.nextInt();
		
			if (knowStats == 1)
				{
				System.out.println(" ");

					System.out.println("Your stats are gonna be assinged at random by the DM.");
					System.out.println("With a highest possible level of 6 and a lowest level of 1.");
					System.out.println(" ");

					System.out.println("Depending on the race and subrace you choose you can get moduals, which effect certain stats such as your magic or charisma.");
					System.out.println("Moduals can eaither effect your stats positivly or negatively.");
					// Did not have time to figure this out soooo yeah sorry guys
					
				}	
			else if (knowStats == 2)
				{
					System.out.println(" ");
					System.out.println("Okay then, great! Lets get rolling!");
				}
			System.out.println(" ");

			//Stats inisilized 
			
			System.out.println("Your stats are: ");		
		int statNumber = (int) (Math.random() * 7);
		System.out.println(" Strength = " + statNumber);
		
		int statNumber1 = (int) (Math.random() * 7);
		System.out.println(" Charisma = " + statNumber1);
		
		int statNumber2 = (int) (Math.random() * 7);
		System.out.println(" Wisdom = " + statNumber2);
		
		int statNumber3 = (int) (Math.random() * 7);
		System.out.println(" Intelligence = " + statNumber3);
		
		int statNumber4 = (int) (Math.random() * 7);
		System.out.println(" Cinsitution = " + statNumber4);
		
		int statNumber5 = (int) (Math.random() * 7);
		System.out.println(" Dexterity = " + statNumber5);
		
		//Now figure out mods for race and class choice
		//Put all of this into another class
		
		System.out.println(" ");
			System.out.println("This is your character!");
		
				System.out.println(" ");
			    System.out.println("Your name is: " + ClassChoice.gameName);
				
			    System.out.println(" ");
			    System.out.println("You are a: " + RaceChoice.race);
				
			    System.out.println(" ");
			    System.out.println("From the class of: " + ClassChoice.class2);
				
			    System.out.println(" ");
			    System.out.println("And your stats are: ");
			    
	  //these are your stats, they would be finalized with the mods in place...once you figure out how those work.
			    	System.out.println(" Strength: " + statNumber);
			    	System.out.println(" Charisma: " + statNumber1);
			    	System.out.println(" Wisdom: " + statNumber2);
			    	System.out.println(" Intelligence: " + statNumber3);
			    	System.out.println(" Cinsitution: " + statNumber4);
			    	System.out.println(" Dexterity: " + statNumber5);

			    	
		System.out.println(" ");
			System.out.println("OOOOO, very exciting! You are one powerful " + ClassChoice.class2 + " " + RaceChoice.race);
			System.out.println("Now let's really get this campaign started! Alright, " + ClassChoice.gameName);

			    
	}
	
}
