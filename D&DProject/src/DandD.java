
public class DandD
	{
	//costum constructor 
	private static String Stat;
	private static int StatNumber;
	private static String Mod;
	private static int ModNumber;
	private static String Enemy;
	private static String WinOrLose;
	private static String ChoiceOfAttack;
	
	public DandD(String S, int SN, String M, int MN, String E, String WL, String CA)
		{
			Stat = S;
			StatNumber = SN;
			Mod = M;
			ModNumber = MN;
			Enemy = E;
			WinOrLose = WL;
			ChoiceOfAttack = CA;
		}

	public static int getStatNumber() {
		return StatNumber;
	}

	public static void setStatNumber(int statNumber) {
		StatNumber = statNumber;
	}

	public static int getModNumber() {
		return ModNumber;
	}

	public static void setModNumber(int modNumber) {
		ModNumber = modNumber;
	}

	public static String getStat() {
		return Stat;
	}

	public static void setStat(String stat) {
		Stat = stat;
	}

	public static String getMod() {
		return Mod;
	}

	public static void setMod(String mod) {
		Mod = mod;
	}

	public static String getEnemy() {
		return Enemy;
	}

	public static void setEnemy(String enemy) {
		Enemy = enemy;
	}

	public static String getWinOrLose() {
		return WinOrLose;
	}

	public static void setWinOrLose(String winOrLose) {
		WinOrLose = winOrLose;
	}

	public static String getChoiceOfAttack() {
		return ChoiceOfAttack;
	}

	public static void setChoiceOfAttack(String choiceOfAttack) {
		ChoiceOfAttack = choiceOfAttack;
	}
	
	
	
}
