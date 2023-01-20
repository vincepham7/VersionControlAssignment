/*
 * Vincent Pham
 * 
 * 
 */

public class HeroClasses {
	
	//Variable
	private String name;
	
	//Setters & Getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//Constructor
	public HeroClasses(String name) {
		super();
		this.name = name;
	}

	public void swingsWeapon() {
		System.out.println("Hero swings weapon!");
	}

}
