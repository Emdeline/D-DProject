
public class CampaignPt1Pojos
	{
		private static String Enemy;
		private static String ChoiceOfAttack;
		
		public CampaignPt1Pojos(String E, String CA)
			{
				
				Enemy = E;
				ChoiceOfAttack = CA;
			}

		public static String getEnemy()
			{
				return Enemy;
			}

		public static void setEnemy(String enemy)
			{
				Enemy = enemy;
			}

		public static String getChoiceOfAttack()
			{
				return ChoiceOfAttack;
			}

		public static void setChoiceOfAttack(String choiceOfAttack)
			{
				ChoiceOfAttack = choiceOfAttack;
			}

	}
