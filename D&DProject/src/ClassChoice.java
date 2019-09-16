import java.util.Scanner;

public class ClassChoice
	{

		public static void main(String[] args)
			{
				// have to choose name
				
				System.out.println("Okay, so lets start out with makeing a name that you want to be called thought out the campaign. So what is your players name?");
				Scanner gameNameInput = new Scanner(System.in);
				String gameName = gameNameInput.nextLine();
				System.out.println("Thats an awesome name! " + gameName);
				
				// have to choose a trait
				
				System.out.println(gameName + ", lets start with choosing your class.");
				
				System.out.println("You can choose a class whose main trait is either Strength, Charisma, Wisdom, or Intelligence");
				System.out.println("So which trait do you want as your main trait? Enter 1 in for Strength, 2 for Charisma, 3 for Wisdon, or 4 for Intelligence");
				Scanner traitChoice = new Scanner(System.in);
				int trait = traitChoice.nextInt(); 
				
				if (trait == 1)
					{
						System.out.println("You have chosen Strength as your main trait! YAY, that means, " + gameName + ", you can choose to be either a Fighter, a Barbarian, or a Paladin.");
						System.out.println("Enter 1 for a Fighter, 2 for a Barbarian, or 3 for a Paladin?");
						Scanner strengthClassChoice = new Scanner(System.in);
						int strength = strengthClassChoice.nextInt();
						
							if (strength == 1)
								{
									System.out.println("YAY I see an espiering Fighter!");
									System.out.println("A Fighter is a master of martial combat, skilled with a variety of weapns and armor. OOOOO fancy!");
								}
							else if (strength == 2)
								{
									System.out.println("YAY I see a verocious Barbarian in our mists!");
									System.out.println("A Barbarian is a fierce warrior of primitive background who can enter a battle rage. YAY!! Sounds like fun.");
								}
							else if (strength == 3)
								{
									System.out.println("YAY I see a couragious Paladin over here!");
									System.out.println("A Paladin is a holy warrior bound to a sacred oath. I wonder what is your oath, but thats a later conversation");
								}
					}
				else if (trait == 2)
					{
						System.out.println("You have chossen Charisma as your main trait! YAY, that means, " + gameName + ", you can choose to be either a Bard, a Sorcerer, or a Warlock.");
						
						System.out.println("You have chosen Charisma as your main trait! YAY, that means, " + gameName + ", you can choose to be either a Bard, a Sorcerer, or a Warlock.");
						System.out.println("Enter 1 for a Bard, 2 for a Sorcerer, or 3 for a Warlock?");
						Scanner charismaClassChoice = new Scanner(System.in);
						int charisma = charismaClassChoice.nextInt();
						
							if (charisma == 1)
								{
									System.out.println("");
									System.out.println("A Fighter is a master of martial combat, skilled with a variety of weapns and armor. OOOOO fancy!");
								}
							else if (charisma == 2)
								{
									System.out.println("YAY I see a verocious Barbarian in our mists!");
									System.out.println("A Barbarian is a fierce warrior of primitive background who can enter a battle rage. YAY!! Sounds like fun.");
								}
							else if (charisma == 3)
								{
									System.out.println("YAY I see a couragious Paladin over here!");
									System.out.println("A Paladin is a holy warrior bound to a sacred oath. I wonder what is your oath, but thats a later conversation");
					}
				else if (trait == 3)
					{
						System.out.println("You have chossen Wisdom as your main trait! YAY, that means, " + gameName + ", you can choose to be either a Rogue, a Cleric, a Druid, a Monk, or a Ranger.");
						
						System.out.println("Enter 1 for a Rogue, 2 for a Cleric, 3 for a Monk, or 4 for a Ranger?");
						Scanner wisdomClassChoice = new Scanner(System.in);
						int wisdom = wisdomClassChoice.nextInt();
						
							if (wisdom == 1)
								{
									System.out.println("Theres a scrappy Rogue right next to me. Nice choice " + gameName);
									System.out.println("A Rogue is a scounderal who uses stealth and trickery to overcome obstacles and enemies. Sounds like my kind of person!");
								}
							else if (wisdom == 2)
								{
									System.out.println("Cleric, you are *I (the DM) bows towards you*");
									System.out.println("A Cleric is a priestly champion who wields divine magiv in service of a higer power.");
								}
							else if (wisdom == 3)
								{
									System.out.println("One of the earth, a good-natured Druid!");
									System.out.println("A Druid is a priest of the Old Faith, weilding the powers of nature - moonlight and plant growth, fire, and lighting. They can also adopted animal forms! Okay, the is AWESOME! Nature is the best isn't it!");
								}
							else if (wisdom == 4)
								{
									System.out.println("YAY I see a roaming Rnager, over the hills!");
									System.out.println("A Ranger is a warrior who ises martial prowess and nature magic to combat threats on the edges of civilization. A protector of nature, umm yes please!");
								}
					
							
				else if (trait == 4)
					{
						System.out.println("You have chossen Intelligence as your main trait! YAY, that means, " + gameName + ", you are a Wizard! I bet you are going to make one of, if not, the best Wizards I have ever seen!");
						System.out.println("A Wizard is a scholarly magic - user capable of manipulating the structures of reality. That is the coolest thing I think I have ever heard!");
						
					}
				
				// defining the class
				
				
				

			}

	}
