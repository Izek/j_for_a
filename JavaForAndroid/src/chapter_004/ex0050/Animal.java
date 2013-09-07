package chapter_004.ex0050;

public abstract class Animal {

	private String species;
	private String description;

	// public Animal() {
	// this.species = "Animal";
	// this.description = description;
	// }

	public Animal(String species, String description) {
		this.species = species;
		this.description = description;
	}

	abstract void eat();

	abstract void move();

	public String toString() {
		return "I'm a " + this.species + ".";
	}

	public String describe() {
		return description;
	}
}
