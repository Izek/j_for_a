package chapter_002;

public class Triangle {

	public static void main(String[] args) {

		int counter = 0;
		
		int height = 40;

		System.out.println("Triangle: ");
		System.out.println();

		for (int i = 1; i <= height; i++) {

			counter = 0;

			if (i < 10)
				System.out.print(" ");
			System.out.print(i + "): ");

			for (int k = height; k > i; k--)
				System.out.print(" ");

			for (int j = 0; j < i; j++) {
				counter++;
				System.out.print("*");

				if (j != 0) {
					counter++;
					System.out.print("*");
				}
			}

			for (int k = height; k > i; k--)
				System.out.print(" ");

			System.out.println(" : (" + counter + ")");
		}
	}
}
