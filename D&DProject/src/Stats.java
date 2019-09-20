import java.util.Random;
import java.util.Scanner;

public class Stats {

	static void stat() {

		System.out.println("Now it's time to assign your stats ");
		System.out.println("The character hit points deal with their Strength, Charisma, Wisdom, Intelligance, Consitution, and Dexterity.");
		
		System.out.println("Remind me, do you know how stats work? 1 for no, and 2 for yes.");
		Scanner statsKnowledge = new Scanner(System.in);
		int knowStats = statsKnowledge.nextInt();
		
			if (knowStats == 1)
				{
					System.out.println(" Your hit points are (for the sake of the game for now) gonna be assinged by random, with the highest possible level of 6 and lowest level of 1.");
					System.out.println("Depending on the race and subrace you choose you can get moduals, which effect certain stats such as your magic or charisma.");
					System.out.println("Moduals can eaither effect your stats positivly or negatively.");
					System.out.println("So let see how yours panout " + ClassChoice.gameName + " the " + RaceChoice.race + " " + ClassChoice.class2);
				}	
			else if (knowStats == 2)
				{
					System.out.println("Okay then, great! Lets get rolling!");
				}
			
		int statNumber = (int) (Math.random() * 7);
		System.out.println("Strength = " + statNumber);
		
		int statNumber1 = (int) (Math.random() * 7);
		System.out.println("Charisma = " + statNumber1);
		
		int statNumber2 = (int) (Math.random() * 7);
		System.out.println("Wisdom = " + statNumber2);
		
		int statNumber3 = (int) (Math.random() * 7);
		System.out.println("Intelligence = " + statNumber3);
		
		int statNumber4 = (int) (Math.random() * 7);
		System.out.println("Cinsitution = " + statNumber4);
		
		int statNumber5 = (int) (Math.random() * 7);
		System.out.println("Dexterity = " + statNumber5);

		
			    
	}
	
}
