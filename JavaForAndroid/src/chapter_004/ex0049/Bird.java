package chapter_004.ex0049;

abstract  class Bird extends Animal {

	public Bird(String species, String description) {
		super(species, description);
	}

	@Override
	void eat() {
		System.out.println("eats seeds and insects");
	}

	@Override
	void move() {
		System.out.println("flies through the air");
	}

	public String toString() {
		return "I'm a Bird";
	}
}