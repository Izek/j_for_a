package chapter_004;

class Vehicle_002 {
	private String make;
	private String model;
	private int year;

	Vehicle_002(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}

	void describe() {
		System.out.println(year + " " + make + " " + model);
	}
}

public class Car_002 extends Vehicle_002 {
	private int numWheels;

	Car_002(String make, String model, int year, int numWheels) {
		super(make, model, year);
	}

	void describe() {
		System.out.print("This car is a "); // Print without newline – see
		System.out.print(numWheels + "-whilled vehicle: ");									// Chapter 1.
		super.describe();
	}

	public static void main(String[] args) {
		Car_002 car = new Car_002("Ford", "Fiesta", 2009, 4);
		car.describe();
	}
}
