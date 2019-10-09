
public class Mods
	{
		public static void mods()
			{
				
			}
		public static void main(String[] args)
			{
				switch(RaceChoice.race)
				{
					case "Hill Dwarf" :
						System.out.println("Since you chose to be a Hill Dwarf, you get a +2 Strength");
						Stats.statNumber += 2;
						break;
					case "Mountain Dwarf" :
						System.out.println("Since you chose to be a Hill Dwarf, you get a +2 Strength, and a +1 Chrisma.");
						Stats.statNumber1 ++;
						Stats.statNumber += 2;
						break;
					case "Sun Elf" :
						System.out.println("Since you chose to be a Sun Elf, you get a +3 Intelligence, and a +2 Constiturion.");
						Stats.statNumber3 += 3;
						Stats.statNumber4 += 2;
						break;
					case "Night Elf" :
						System.out.println("Since you chose to be a Night Elf, you get a +3 Intelligence, and a +2 Charisma.");
						Stats.statNumber3 += 3;
						Stats.statNumber1 += 2;
						break;
					case "Winter Elf" :
						System.out.println("Since you chose to be a Winter Elf, you get a +3 Intelligence, and a +2 Dexterity.");
						Stats.statNumber3 += 3;
						Stats.statNumber5 += 2;
						break;
					case "Desert Gnome" :
						System.out.println("Since you chose to be a Desert Gnome, you get a -1 Intelligence, and a +2 Dexterity.");
						Stats.statNumber3 --;
						Stats.statNumber5 += 2;
						break;
					case "Cliff Gnome" :
						System.out.println("Since you chose to be a Cliff Gnome, you get a +2 Wisdom, and a +3 Dexterity.");
						Stats.statNumber2 += 2;
						Stats.statNumber5 += 3;
						break;
					case "RedCap Gnome" :
						System.out.println("Since you chose to be a RedCap, you get a -2 Intelligence, and a -1 Dexterity.");
						Stats.statNumber3 -= 2;
						Stats.statNumber5 --;
						break;
						
				}
			}

	}
// races are Hill Dwarf(DONE), Mountain Dwarf(DONE), Sun Elf(DONE), Night Elf(DONE), Winter Elf(DONE), Desert Gnome(DONE), Cliff Gnome(DONE), RedCap Gnome(DONE),
// 			 Lightfoot Halfling, Stout Halfling, Burly Halfling,  Dragonborn, Tiefling, Half-Orc, Half-Elf, Human
// stats are Strength: statNumber; Charisma: statNumber1; Wisdom: statNumber2; Intelligence: statNumber3; Constitution: statNumber4; Dexterity: statNumber5.