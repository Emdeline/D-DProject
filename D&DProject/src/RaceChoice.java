import java.util.Scanner;

public class RaceChoice
	{
		static int race1;
		static String race;
		public static void raceChoice()
			{
				System.out.println("Now its time to choose your race!");
				System.out.println("The races you can choose from are as follows. You know the drill.");
				
				System.out.println(" 1 Dwarf");
				System.out.println(" 2 Elf");
				System.out.println(" 3 Gnome");
				System.out.println(" 4 Halfing");
				System.out.println(" 5 Dragonborn");
				System.out.println(" 6 Tiefling");
				System.out.println(" 7 Half-Orc");
				System.out.println(" 8 Half-Elf");
				
				Scanner fred = new Scanner(System.in);
				int race1 = fred.nextInt();
				
				if (race1 == 1)
					{
						System.out.println("You have chosen to be a Dwarf. That means you have two options...");
						System.out.println("You can either be:");
						
						System.out.println("1 Hill Dwarf");
						System.out.println("2 Mountian Dwarf");
						
						Scanner dwarf = new Scanner(System.in);
						int dwarfChoice = dwarf.nextInt();
						
							if (dwarfChoice == 1)
								{
									System.out.println("Cool a Hill Dwarf");
									race = "Hill Dwarf";
								}
							else if (dwarfChoice == 2)
								{
									System.out.println("YAY! A Mountain Dwarf, I like the mountains better anyways.");
									race = "Mountian Dwarf";
								}
							System.out.println("Nice to meet you " + ClassChoice.gameName + " the " + RaceChoice.race + " " + ClassChoice.class2);

					}
				else if (race1 == 2)
					{
						System.out.println("You have chosen to be a Elf");
						race = "Elf";
					}
				else if (race1 == 3)
					{
						System.out.println("You have chosen to be a Gnome");					
					}
				else if (race1 == 4)
					{
						System.out.println("You have chosen to be a Halfling");					
					}
				else if (race1 == 5)
					{
						System.out.println("You have chosen to be a Dragonborn");						
					}
				else if (race1 == 6)
					{
						System.out.println("You have chosen to be a Tiefling");						
					}
				else if (race1 == 7)
					{
						System.out.println("You have chosen to be a Half-Orc");						
					}
				else if (race1 == 8)
					{
						System.out.println("You have chosen to be a Half-Elf");						
					}
			}

	}
