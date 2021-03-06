package chapter_006;

public class IIDemo_001 {
	public static void main(String[] args) {
		double temperature = 50.0; // Celsius
		if (temperature < 0.0)
			System.out.println("water has solidified");
		else if (temperature >= 100.0)
			System.out.println("water is boiling into a gas");
		else {
			// temperature > 0.0 and temperature < 100.0
			assert (temperature > 0.0 && temperature < 100.0) : temperature;
			System.out.println("water is remaining in its liquid state");
		}
	}
}