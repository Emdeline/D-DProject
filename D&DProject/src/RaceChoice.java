import java.util.Scanner;

public class RaceChoice
	{
		static int race1;
		static String race;
		public static void raceChoice()
			{
			System.out.println(" ");

				System.out.println("Now its time to choose your race!");
				System.out.println("The races you can choose from are as follows. You know the drill.");
				System.out.println(" ");

				System.out.println(" (1) Dwarf");
				System.out.println(" (2) Elf");
				System.out.println(" (3) Gnome");
				System.out.println(" (4) Halfing");
				System.out.println(" (5) Dragonborn");
				System.out.println(" (6) Tiefling");
				System.out.println(" (7) Half-Orc");
				System.out.println(" (8) Half-Elf");
				System.out.println(" (9) Human");

				System.out.println(" ");

				Scanner fred = new Scanner(System.in);
				int race1 = fred.nextInt();
				
				
		//Dwarf choice
				
				if (race1 == 1)
					{
				System.out.println(" ");
						System.out.println("You have chosen to be a Dwarf. That means you have two options...");
						
				System.out.println(" ");
						System.out.println("You can either be:");
						System.out.println("(1) Hill Dwarf");
						System.out.println("(2) Mountian Dwarf");
						
				System.out.println(" ");
						Scanner dwarf = new Scanner(System.in);
						int dwarfChoice = dwarf.nextInt();
						
							
						if (dwarfChoice == 1)
								{
				System.out.println(" ");

									System.out.println("Cool a Hill Dwarf");
									race = "Hill Dwarf";
								}
							
							else if (dwarfChoice == 2)
								{
				System.out.println(" ");

									System.out.println("YAY! A Mountain Dwarf, I like the mountains better anyways.");
									race = "Mountian Dwarf";
								}
				System.out.println(" ");

					}
				
				
		//Elf choice
				
				else if (race1 == 2)
					{
				System.out.println(" ");
						System.out.println("You have chosen to be an Elf. That means you have three options...");
						
						System.out.println(" ");
								System.out.println("You can either be:");
								System.out.println(" (1) Sun Elf");
								System.out.println(" (2) Night Elf");
								System.out.println(" (3) Winter Elf ");
								
						System.out.println(" ");
								Scanner elf = new Scanner(System.in);
								int elfChoice = elf.nextInt();
								
									
								if (elfChoice == 1)
										{
						System.out.println(" ");

											System.out.println("A bright Sun Elf");
											race = "Sun Dwarf";
										}
									
									else if (elfChoice == 2)
										{
						System.out.println(" ");

											System.out.println("A mysterious Night Elf");
											race = "Night Elf";
										}
									else if (elfChoice == 3)
									{
					System.out.println(" ");

										System.out.println("A bright, fluffy, and cold Winter Elf");
										race = "Winter Elf";
									}
					}
			
				
		//GnomeChoice
			
				else if (race1 == 3)
					{
				System.out.println(" ");
						System.out.println("You have chosen to be a Gnome. That means you have three options...");
						
						System.out.println(" ");
								System.out.println("You can either be:");
								System.out.println(" (1) Desert Gnome");
								System.out.println(" (2) Cliff Gnome");
								System.out.println(" (3) Redcap Gnome ");
								
						System.out.println(" ");
								Scanner gnome = new Scanner(System.in);
								int gnomeChoice = gnome.nextInt();
								
									
								if (gnomeChoice == 1)
										{
						System.out.println(" ");

											System.out.println("A Desert Gnome, you must enjoy the heat.");
											race = "Desert Gnome";
										}
									
									else if (gnomeChoice == 2)
										{
						System.out.println(" ");

											System.out.println("A high flying Cliff Elf");
											race = "Cliff Gnome";
										}
									else if (gnomeChoice == 3)
									{
					System.out.println(" ");

										System.out.println("A Redcap Gnome, a nice garden is AMAZING!");
										race = "Redcap Gnome";
									}

					}
				
		//Halfling Choice
				
				else if (race1 == 4)
					{
				System.out.println(" ");
						System.out.println("You have chosen to be a Halfling. That means you have three options...");
						
						System.out.println(" ");
								System.out.println("You can either be:");
								System.out.println(" (1) Lightfoot Halfling");
								System.out.println(" (2) Stout Halfling");
								System.out.println(" (3) Burly Halfling");
								
						System.out.println(" ");
								Scanner halfling = new Scanner(System.in);
								int halflingChoice = halfling.nextInt();
								
									
								if (halflingChoice == 1)
										{
						System.out.println(" ");

											System.out.println("A Lightfoot Halfling, you are fast very very fast!");
											race = "Lightfoot Halfling";
										}
									
									else if (halflingChoice == 2)
										{
						System.out.println(" ");

											System.out.println("A Shadowfoot Halfling. Man you need to wear a bell!");
											race = "Shadowfoot Halfling";
										}
									else if (halflingChoice == 3)
									{
					System.out.println(" ");

										System.out.println("A Burly Halfling, wow you pack a punch.");
										race = "Burly Halfling";
									}

					}
			
		//Dragonborn choice
				
				else if (race1 == 5)
					{
				System.out.println(" ");
						System.out.println("You have chosen to be a Dragonborn");	
						
						race = "Dragonborn";

					}
				
		//Tiefling choice
				
				else if (race1 == 6)
					{
				System.out.println(" ");
						System.out.println("You have chosen to be a Tiefling");	
						
						race = "Tiefling";

					}
				
		//Half-Orc choice
				
				else if (race1 == 7)
					{
				System.out.println(" ");
						System.out.println("You have chosen to be a Half-Orc");		
						
						race = "Half-Orc";

					}
				
		//Half-Elf choice
				
				else if (race1 == 8)
					{
				System.out.println(" ");
						System.out.println("You have chosen to be a Half-Elf");	
						
						race = "Half-Elf";

					}
				
		//Human choice
				
				else if (race1 == 9)
					{
				System.out.println(" ");
						System.out.println("You have chosen to be a Human");	
						
						race = "Human";

					}
			}

	}
