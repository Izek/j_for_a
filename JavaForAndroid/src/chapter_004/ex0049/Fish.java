package chapter_004.ex0049;

 abstract class Fish extends Animal {

	public Fish(String species, String description) {
		super(species, description);
		// TODO Auto-generated constructor stub
	}

	@Override
	void eat() {
		System.out.println("eats krill, algae");

	}

	@Override
	void move() {
		System.out.println("swims through the water");

	}

	@Override
	public String toString() {
		return "I'm a Fish";
	}
}
