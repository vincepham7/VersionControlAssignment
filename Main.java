/*
 * Vincent Pham
 * 
 * 
 */


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		HeroClasses heroClass;
		String hname = null;
		
		
		do {
			System.out.println("Enter the name of your Hero: ");
			hname = scanner.nextLine();
			if (hname == null || hname.length() < 1) {
				System.out.println("You must enter a name. ");
			}

		} while (hname == null || hname.length() < 1);

		{
			System.out.println("Which hero would you like to pick?");
			System.out.println("1 for Warrior or 2 for Guardian");
			int pick = scanner.nextInt();

			// Demonstrating polymorphism for either Warrior or Guardian Class
			if (pick == 1) {
				heroClass = new Warrior(hname);
				heroClass.swingsWeapon();
			}

			else if (pick == 2) {
				heroClass = new Guardian(hname);
				heroClass.swingsWeapon();
			} else {
				heroClass = new HeroClasses(null);
				System.out.println("Your pick was invalid!");
			}
			
			System.out.println("You've chosen " + hname + " as your hero's name!");;

		}

	}
}
