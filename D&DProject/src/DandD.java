
public class DandD
	{
	//costum constructor 
	private static String Stat;
	private static int StatNumber;
	private static String Mod;
	private static int ModNumber;
	
	public DandD(String S, int SN, String M, int MN)
		{
			Stat = S;
			StatNumber = SN;
			Mod = M;
			ModNumber = MN;
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
	
	
}
