import java.util.Scanner;

public class ClassChoice
	{

		public static void classChoice()
		
			{
				// have to choose name
				
				System.out.println("Okay, so lets start out with makeing a name that you want to be called thought out the campaign. So what is your players name?");
				Scanner gameNameInput = new Scanner(System.in);
				String gameName = gameNameInput.nextLine();
				System.out.println("Thats an awesome name! " + gameName);
				
				// have to choose a trait
				
				System.out.println(gameName + ", lets start with choosing your class.");
				
				System.out.println("Enter the corresponding number for the class of your choice. "
						+ "1 Fighter"
						+ "2 Barbarian"
						+ "3 Paladin"
						+ "4 Bard"
						+ "5 Sorcerer"
						+ "6 Warlock"
						+ "7 Rogue"
						+ "8 Cleric"
						+ "9 Druid"
						+ "10 Monk"
						+ "11 Ranger"
						+ "12 Wizard");
				
				Scanner classChoice1 = new Scanner(System.in);
				int class1 = classChoice1.nextInt();
				
				if (class1 == 1)
					{
						System.out.println("YAY I see an espiering Fighter!");
						System.out.println("A Fighter is a master of martial combat, skilled with a variety of weapns and armor. OOOOO fancy!");
					}
				else if (class1 == 2)
					{
						System.out.println("YAY I see a verocious Barbarian in our mists!");
						System.out.println("A Barbarian is a fierce warrior of primitive background who can enter a battle rage. YAY!! Sounds like fun.");
					}
				else if (class1 == 3)
					{
						System.out.println("YAY I see a couragious Paladin over here!");
						System.out.println("A Paladin is a holy warrior bound to a sacred oath. I wonder what is your oath, but thats a later conversation");
					}
				else if (class1 == 4)
					{
						System.out.println("OOOOO Nice a Bard, now you can sing though out the campign!");
						System.out.println("A Bard is an inspiring magician whose power echos the music of creation. Now that is music to my ears.");
					}
				else if (class1 == 5)
					{
						System.out.println("A fancy Sorcerer hmmm, that is nice spell caseting right there.");
						System.out.println("A Sorcerer is a spellcaster who draws on inherent magic from a gift or a bloodline. Family ties am I right.");
					}
				else if (class1 == 6)
					{
						System.out.println ("YAY! A wonderful Warlock, now that is some power!");
						System.out.println("A Warlock is a weilder of magic that is derived from a bargain with an extraplanar entity. Now those are some wonderful communication skills.");
					}
				else if (class1 == 7)
					{
						System.out.println("Theres a scrappy Rogue right next to me. Nice choice " + gameName);
						System.out.println("A Rogue is a scounderal who uses stealth and trickery to overcome obstacles and enemies. Sounds like my kind of person!");
					}
				else if (class1 == 8)
					{
						System.out.println("Cleric, you are *I (the DM) bows towards you*");
						System.out.println("A Cleric is a priestly champion who wields divine magic in service of a higer power.");
					}
				else if (class1 == 9)
					{
						System.out.println("One of the earth, a good-natured Druid!");
						System.out.println("A Druid is a priest of the Old Faith, weilding the powers of nature - moonlight and plant growth, fire, and lighting. They can also adopted animal forms! Okay, the is AWESOME! Nature is the best isn't it!");
					}
				else if (class1 == 10)
					{
						System.out.println("A chill Monk, GREAT CHOICE!");
						System.out.println("A Monk is a master of martial arts, harnessing the power of the body in pursuit of physical and spiritual perfection. Knowing yourself and your moloral code, dang I wish!");
					}
				else if (class1 == 11)
					{
						System.out.println("YAY I see a roaming Rnager, over the hills!");
						System.out.println("A Ranger is a warrior who ises martial prowess and nature magic to combat threats on the edges of civilization. A protector of nature, umm yes please!");
					}		
				else if (class1 == 12)
					{
						System.out.println( gameName + ", you are a Wizard! I bet you are going to make one of, if not, the best Wizards I have ever seen!");
						System.out.println("A Wizard is a scholarly magic - user capable of manipulating the structures of reality. That is the coolest thing I think I have ever heard!");
						
					}
				System.out.println("All we know about you so far is that your name is " + gameName + " and that your class is " + classChoice1);
				// defining the class
				
						}
					
			}
	

				

					
			

	
