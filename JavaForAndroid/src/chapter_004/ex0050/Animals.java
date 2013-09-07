package chapter_004.ex0050;

public class Animals {

	public static void main(String[] args) {
		Animal[] animals = { new AmericanRobin(), new RainbowTrout(),
				new DomesticCanary(), new SockeyeSalmon() };

		for (int i = 0; i < animals.length; i++) {

			System.out.println(animals[i].toString());
			animals[i].eat();
			animals[i].move();
			System.out.println();
		}
	}
}