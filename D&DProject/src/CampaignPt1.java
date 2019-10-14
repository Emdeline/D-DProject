import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class CampaignPt1
	{
		static ArrayList <CampaignPt1Pojos> Enemy = new ArrayList <CampaignPt1Pojos>();
		
		public static void campaignpt1()
			{
				
				System.out.println("At the start of your journey you are on you way out of your home town.");
				System.out.println("About a ten miles out you come to a part of the forest that you never been to.");
				System.out.println("Hesitently, you still proceed on your journey. Then all of a sudden you are jumped by a gnome.");
				
				System.out.println(" ");
			}
		public static void loadCampaign() 
			{
				System.out.println("You have 2 choices: (1) Punch Him, (2) Run Away.");
				System.out.println("You have to roll a 6 or higher to land a punch and a 4 or lower to run away.");
				
				Enemy.add(new CampaignPt1Pojos("gome", "(1) Punch Him, (2) Run Away"));
			}	
		public static void campaignChoice()
			{
				Scanner userInput = new Scanner(System.in);
					int userFight = userInput.nextInt();
					
					int role = (int) (Math.random() * 14);
				if (userFight == 1)
					{
					System.out.println("YEAH! Let's see if your punch landed! Way to go " + ClassChoice.gameName + "!");
				
					System.out.println(" ");

							System.out.println("You roled a " + role);
					
							System.out.println(" ");
				
					
						if (role >= 8)
							{
								System.out.println("YAY! You did it, your punch landed!");
							}
						else
							{
								System.out.println("Oof, you missed. You should probably train up some more.");
									loadCampaign();
							}
					}
				else 
					{
						System.out.println("Okay, you do that " + ClassChoice.gameName + "...coward.");
						System.out.println("Let's see if you got away.");
						
						System.out.println(" ");
						
						System.out.println("You roled a " + role);
						
						System.out.println(" ");
						
						if (role <= 7)
							{
								System.out.println("Okay, you do that " + ClassChoice.gameName + ". Now what?");
								System.exit(0);
							}
						else
							{
								System.out.println("Okay, so you didn't get away from the small gnome. So, let's try again!");
								loadCampaign();
							}
					}
				
			}
//did not have time to finish please extend this figure out the array


				
			
		
	}
