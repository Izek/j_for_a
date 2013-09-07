package chapter_004.ex0051;

abstract class Fish extends Animal {

	public Fish(String species, String description) {
		super(species, description);
	}

	@Override
	void eat() {
		System.out.println("eats krill, algae");

	}

	@Override
	void move() {
		System.out.println("swims through the water");

	}

}
