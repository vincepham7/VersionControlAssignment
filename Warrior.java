/*
 * Vincent Pham
 * 
 * 
 */

public class Warrior extends HeroClasses {
	
	
	public Warrior(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	//Creating method to override HeroClasses
	@Override
	public void swingsWeapon() {
		System.out.println("Warrior swings sword for thier weapon!");
	}
}
