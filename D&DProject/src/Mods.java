
public class Mods
	{
	static int mod;

		public static void mods()
			{
				System.out.println(" ");
				System.out.println("Based on your race choice you can get modules. These can either affect your stats in a negative way or a positive way.");
			// modding the stats 
				//						 Strength		   Charisma			  Wisdom		  Intelligence		Constitution		  Dexterity
				int [] tempStat = {Stats.statNumber, Stats.statNumber1, Stats.statNumber2, Stats.statNumber3, Stats.statNumber4, Stats.statNumber5};
				int [] tempMods = new int [6];
				
				switch(RaceChoice.race)
				{
					case "Hill Dwarf" :
						System.out.println("Since you chose to be a Hill Dwarf, you get a +2 Strength");
						Stats.statNumber += 2;
						tempMods[0] = 2;
						mod = tempMods[0];
						break;
						
					case "Mountain Dwarf" :
						System.out.println("Since you chose to be a Hill Dwarf, you get a +2 Strength, and a +1 Chrisma.");
						Stats.statNumber1 ++;
						Stats.statNumber += 2;
						tempMods[0] = 2;
						tempMods[1] = 1;
						break;
						
					case "Sun Elf" :
						System.out.println("Since you chose to be a Sun Elf, you get a +3 Intelligence, and a +2 Constitution.");
						Stats.statNumber3 += 3;
						Stats.statNumber4 += 2;
						tempMods[3] = 3;
						tempMods[4] = 2;
						break;
						
					case "Night Elf" :
						System.out.println("Since you chose to be a Night Elf, you get a +3 Intelligence, and a +2 Charisma.");
						Stats.statNumber3 += 3;
						Stats.statNumber1 += 2;
						tempMods[3] = 3;
						tempMods[1] = 2;
						break;
						
					case "Winter Elf" :
						System.out.println("Since you chose to be a Winter Elf, you get a +3 Intelligence, and a +2 Dexterity.");
						Stats.statNumber3 += 3;
						Stats.statNumber5 += 2;
						tempMods[3] = 3;
						tempMods[5] = 2;
						break;
						
					case "Desert Gnome" :
						System.out.println("Since you chose to be a Desert Gnome, you get a -1 Intelligence, and a +2 Dexterity.");
						Stats.statNumber3 --;
						Stats.statNumber5 += 2;
						tempMods[3] = -1;
						tempMods[5] = 2;
						break;
						
					case "Cliff Gnome" :
						System.out.println("Since you chose to be a Cliff Gnome, you get a +2 Wisdom, and a +3 Dexterity.");
						Stats.statNumber2 += 2;
						Stats.statNumber5 += 3;
						tempMods[2] = 2;
						tempMods[5] = 3;
						break;
						
					case "RedCap Gnome" :
						System.out.println("Since you chose to be a RedCap, you get a -2 Intelligence, and a -3 Charisma.");
						Stats.statNumber3 -= 2;
						Stats.statNumber1 -= 3;
						tempMods[3] = -2;
						tempMods[1] = -3;
						break;
						
					case "Lightfoot Halfling" :
						System.out.println("Since you chose to be a Lightfoot Halfling, you get a +2 Dexterity, and a -1 Strength.");
						Stats.statNumber5 += 2;
						Stats.statNumber --;
						tempMods[5] = 2;
						tempMods[0] = -1;
						break;
						
					case "Stout Halfling" :
						System.out.println("Since you chose to be a Stout Halfing, you get a +1 Dexterity, and a -1 Strength.");
						Stats.statNumber5 += 2;
						Stats.statNumber --;
						tempMods[5] = 2;
						tempMods[0] = -1;
						break;
						
					case "Burly Halfling" :
						System.out.println("Since you chose to be a Burly Halfing, you get a -1 Dexterity, and a +2 Strength.");
						Stats.statNumber5 --;
						Stats.statNumber += 2;
						tempMods[5] = -1;
						tempMods[0] = 2;
						break;
						
					case "Dragonborn" :
						System.out.println("Since you chose to be a Dragonborn, you get a +1 Charisma.");
						Stats.statNumber1 ++;
						tempMods[1] = 1;
						break;
						
					case "Tiefling" :
						System.out.println("Since you chose to be a Tiefling, you get a +2 Constitustion.");
						Stats.statNumber4 += 2;
						tempMods[4] = 2;
						break;
						
					case "Half-Orc" :
						System.out.println("Since you chose to be a Half-Orc, you get a -1 Strength and a +1 in Wisdom.");
						Stats.statNumber --;
						Stats.statNumber2 ++;
						tempMods[0] = -1;
						tempMods[2] = 1;
						break;
						
					case "Half-Elf" :
						System.out.println("Since you chose to be a Half-Elf, you get a +1 Charisma and you get a -1 Intelligence.");
						Stats.statNumber1 ++;
						Stats.statNumber3 --;
						tempMods[1] = 1;
						tempMods[3] = -1;
						break;
						
					case "Human" :
						System.out.println("Since you chose to be a Human, you get a -1 Charisma and you get a -2 Strength.");
						Stats.statNumber1 --;
						Stats.statNumber -= 2;
						tempMods[1] = -1;
						tempMods[0] = -2;
						break;	
						
				}
				// this is who you are
				System.out.println(" ");
				System.out.println("This is who you are: ");
					System.out.println("Name: " + ClassChoice.gameName);
					System.out.println("Class: " + ClassChoice.class2);
					System.out.println("Race: " + RaceChoice.race);
// stats moded printed out
			System.out.println(" ");
			System.out.println("Lastly, your new stats are:");
				System.out.println("Strength =  " + (tempStat[0] + tempMods[0]));
				System.out.println("Charisma =  "  + (tempStat[1] + tempMods[1]));
				System.out.println("Wisdom =  "  + (tempStat[2] + tempMods[2]));
				System.out.println("Intelligence =  "  + (tempStat[3] + tempMods[3]));
				System.out.println("Constitution =  "  + (tempStat[4] + tempMods[5]));
				System.out.println("Dexterity =  "  + (tempStat[5] + tempMods[5]));
			System.out.println(" ");
			
			}

	}
// stats are Strength: statNumber; Charisma: statNumber1; Wisdom: statNumber2; Intelligence: statNumber3; Constitution: statNumber4; Dexterity: statNumber5.