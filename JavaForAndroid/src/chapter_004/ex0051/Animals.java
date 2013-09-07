package chapter_004.ex0051;

public class Animals {

	public static void main(String[] args) {

		Census counter = new Census();

		Animal[] animals = { new AmericanRobin(), new RainbowTrout(),
				new DomesticCanary(), new SockeyeSalmon(), new RainbowTrout(),
				new AmericanRobin() };

		for (int i = 0; i < animals.length; i++) {

			System.out.println(animals[i].toString());
			animals[i].eat();
			animals[i].move();
			System.out.println();
		}
		
		System.out.println();System.out.println();

		for (int i = 0; i < animals.length; i++) {
			counter.update(animals[i].getID());
		}
		
		for (int i = 0; i < Census.SIZE; i++) {
			System.out.println((i + 1) + ") " + counter.get(i));
		}
	}
}