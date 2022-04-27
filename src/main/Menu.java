package main;

import java.util.Random;
import java.util.Scanner;

public class Menu {
	String[] settings = {"Shoneys","out by the dumpster","Chili's"};
	String[] weapons = {"a Kitton Cannon","the power of God and anime","48 ducks with knives"};
	String[] villains = {"Dr. Doofenschmertz", "Brumpo Tungus", "Gary Oak"};
	Scanner scanner = new Scanner(System.in);
	public void RunAdventure() {
		String[] currentAdventure = {GetRandomArrayItem(settings),GetRandomArrayItem(weapons), GetRandomArrayItem(villains)};
		System.out.println("Greetings Traveler!");
		String userChoice = "1";
		do {
			PrintCurrentAdventure(currentAdventure);
			PrintMenu();
			userChoice = scanner.nextLine();
			switch(userChoice) {
			case "1":
				currentAdventure[0] = GetRandomArrayItem(settings);
				System.out.println("Your new location will be " + currentAdventure[0] + "!");
				break;
			case "2":
				currentAdventure[1] = GetRandomArrayItem(weapons);
				System.out.println("Your new weapon will be " + currentAdventure[1] + "!");
				break;
			case "3":
				currentAdventure[2] = GetRandomArrayItem(villains);
				System.out.println("Your new rival will be " + currentAdventure[2] + "!");
				break;
			case "4": 
				PrintConfirmedAdventure(currentAdventure);
				break;
			default:
				System.out.println("Invalid selection.  Please try again! :)");
				break;
			}
		}
		while (!userChoice.equals("4"));
	}
	
	public String GetRandomArrayItem(String[] arrayOfOptions) {
		Random generator = new Random();
		int randomIndex = generator.nextInt(arrayOfOptions.length);
		return arrayOfOptions[randomIndex];
	}
	
	public void PrintConfirmedAdventure(String[] adventureArray) {
		System.out.println("Adventure confirmed!!");
		System.out.println("Your adventure will take place at "+adventureArray[0]);
		System.out.println("You will be armed with "+adventureArray[1]);
		System.out.println("You will battle "+adventureArray[2] + " in glorious combat");
		System.out.println("HAVE FUN FECKER!");
	}
	
	public void PrintCurrentAdventure(String[] currentAdventure) {
		System.out.println("Your current adventure includes the following:");
		for (int i=0; i<currentAdventure.length;i++) {
			System.out.println(currentAdventure[i]);
		}
	}
	
	public void PrintMenu() {
		System.out.print("Press 1 to re-roll your location.  Press 2 to re-roll your weapon.  ");
		System.out.print("Press 3 to re-roll your rival.  Press 4 to confirm your adventure.  ");
		System.out.println("Please enter your selection: ");
	}
}
