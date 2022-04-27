package main;
import java.util.Random;

public class Greeting {
	String[] settings = {"Shoneys","out by the dumpster","Chili's"};
	String[] weapons = {"a Kitton Cannon","the power of God and anime","48 ducks with knives"};
	String[] villains = {"Dr. Doofenschmertz", "Brumpo Tungus", "Gary Oak"};
	public void RunAdventure() {
		String[] currentAdventure = {GetRandomArrayItem(settings),GetRandomArrayItem(weapons), GetRandomArrayItem(villains)};
		System.out.println("Greetings Traveler!");
		System.out.println("Your current location is "+currentAdventure[0]);
		System.out.println("Your current weapon is "+currentAdventure[1]);
		System.out.println("Your current rival is "+currentAdventure[2]);
	}
	
	public String GetRandomArrayItem(String[] arrayOfOptions) {
		Random generator = new Random();
		int randomIndex = generator.nextInt(arrayOfOptions.length);
		return arrayOfOptions[randomIndex];
	}
}
