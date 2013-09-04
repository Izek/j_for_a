package chapter_003;

class Conversions {

	static double c2f(double degrees) {

		return degrees * 9.0 / 5.0 + 32;
	}

	static double f2c(double degrees) {

		return (degrees - 32) * 5.0 / 9.0;
	}
}
