import java.util.Scanner;

public class Introduction
	{

		public static void main(String[] args)
			{
				System.out.println("Hello! What is your name?");
				Scanner userName = new Scanner(System.in);
				String name = userName.nextLine();
				System.out.println("Nice to meet, " + name + "I am the Dungeon Master (DM). Do you know how to play Dungeons and Dragons? Type in 1 for no or 2 for yes.");
				Scanner userInput = new Scanner(System.in);
				int know = userInput.nextInt();
				
				if (know == 1)
					{
						System.out.println("Okay here is a quick overveiw");
						System.out.println(" Okay so you have four characters to choose from. Make your choice wisely you will be using this character for the rest game.");
						System.out.println("You can choice to be a Wizard, Cleric, Fighter, ");
					}
				else if (know == 2)
					{
						System.out.println("Great lets get this campaign started!");
					}
				
			}

	}
