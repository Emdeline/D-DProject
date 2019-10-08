
public class DandD
	{
		public static String Stat;
		public static int StatsNumber;
		public static String Mod;
		public static int ModNumber;
		public static int HitPoints;
		public static int DamageRecived;
		public static int OpponentDamage;
		public static String WinOrLose;
		public static String ChoiceOfAttack;
		
		public DandD(String S, int SN, String M, int MN, int HP, int DR, int OD, String WL, String CA)
			{
				Stat = S;
				StatsNumber = SN;
				Mod = M;
				ModNumber = MN;
				HitPoints = HP;
				DamageRecived = DR;
				OpponentDamage = OD;
				WinOrLose = WL;
				ChoiceOfAttack = CA;
			}
		
		public static String getStat()
			{
				return Stat;
			}



		public static void setStat(String stat)
			{
				Stat = stat;
			}



		public static int getStatsNumber()
			{
				return StatsNumber;
			}



		public static void setStatsNumber(int statsNumber)
			{
				StatsNumber = statsNumber;
			}



		public static String getMod()
			{
				return Mod;
			}



		public static void setMod(String mod)
			{
				Mod = mod;
			}



		public static int getModNumber()
			{
				return ModNumber;
			}



		public static void setModNumber(int modNumber)
			{
				ModNumber = modNumber;
			}



		public static int getHitPoints()
			{
				return HitPoints;
			}



		public static void setHitPoints(int hitPoints)
			{
				HitPoints = hitPoints;
			}



		public static int getDamageRecived()
			{
				return DamageRecived;
			}



		public static void setDamageRecived(int damageRecived)
			{
				DamageRecived = damageRecived;
			}



		public static int getOpponentDamage()
			{
				return OpponentDamage;
			}



		public static void setOpponentDamage(int opponentDamage)
			{
				OpponentDamage = opponentDamage;
			}



		public static String getWinOrLose()
			{
				return WinOrLose;
			}



		public static void setWinOrLose(String winOrLose)
			{
				WinOrLose = winOrLose;
			}



		public static String getChoiceOfAttack()
			{
				return ChoiceOfAttack;
			}



		public static void setChoiceOfAttack(String choiceOfAttack)
			{
				ChoiceOfAttack = choiceOfAttack;
			}



		public static void danddobjects()
			{
				
			}
		
		
		
	
	}
