import java.util.Random;

import java.util.Scanner;

import sun.applet.Main;

import java.util.ArrayList;

public class Stats {
	static int statNumber = (int) (Math.random() * 26);
	static int statNumber1 = (int) (Math.random() * 26);
	static int statNumber2 = (int) (Math.random() * 26);
	static int statNumber3 = (int) (Math.random() * 26);
	static int statNumber4 = (int) (Math.random() * 26);
	static int statNumber5 = (int) (Math.random() * 26);


	public static void stat() {
		
		ArrayList <DandD> stat = new ArrayList <DandD>();
		
		System.out.println(" ");
		System.out.println("Your stats are: ");		
		System.out.println(" Strength = " + statNumber);
			
		System.out.println(" Charisma = " + statNumber1);
			
		System.out.println(" Wisdom = " + statNumber2);
			
		System.out.println(" Intelligence = " + statNumber3);
		
		System.out.println(" Constitution = " + statNumber4);
			
		System.out.println(" Dexterity = " + statNumber5);
		
		
		
			
	}
	
}
