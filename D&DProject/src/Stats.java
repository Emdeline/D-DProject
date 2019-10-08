import java.util.Random;

import java.util.Scanner;

import sun.applet.Main;

import java.util.ArrayList;

public class Stats {

	public static void stat() {
		
		ArrayList <DandD> stat = new ArrayList <DandD>();
		
		
		System.out.println("Your stats are: ");		
		int statNumber = (int) (Math.random() * 26);
		System.out.println(" Strength = " + statNumber);
			
		int statNumber1 = (int) (Math.random() * 26);
		System.out.println(" Charisma = " + statNumber1);
			
		int statNumber2 = (int) (Math.random() * 26);
		System.out.println(" Wisdom = " + statNumber2);
			
		int statNumber3 = (int) (Math.random() * 26);
		System.out.println(" Intelligence = " + statNumber3);
		
		int statNumber4 = (int) (Math.random() * 26);
		System.out.println(" Consitution = " + statNumber4);
			
		int statNumber5 = (int) (Math.random() * 26);
		System.out.println(" Dexterity = " + statNumber5);
		
			
	}
	
}
