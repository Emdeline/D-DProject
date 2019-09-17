import java.util.Scanner;

public class Introduction
	{

		public static void introduce()
			{
				System.out.println("Hello! What is your name?");
				Scanner userName = new Scanner(System.in);
				String name = userName.nextLine();
				System.out.println("Nice to meet, " + name + " I am the Dungeon Master (DM). Do you know how to play Dungeons and Dragons? Type in 1 for no or 2 for yes.");
				Scanner userInput = new Scanner(System.in);
				int know = userInput.nextInt();
				
				if (know == 1)
					{
						System.out.println("Okay here is a quick overveiw");
						System.out.println("You have to choose a class, race, and background. ");
						System.out.println("Based on you choice of class, race, and background you get modifiers on your hit points.");
						System.out.println("Hit points deal with your characters Strength, Charisma, Wisdom, Intelligance, Cinsitiution, and Dexterity.");
						System.out.println("For now we are just generating your character later we will actually get into the combat story.");
						System.out.println("So lets get started.");
					}
				else if (know == 2)
					{
						System.out.println("Great lets get this campaign started!");
					}
				
			}

	}
