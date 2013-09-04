package chapter_002;

/* Fuck it!!! I'ms stacked again )-: */

import java.io.IOException;

public class OutputGradeLetter {

	public static void main(String[] args) throws IOException {

		int testMark = 0;
		char gradeLetter = 0;
		String s = "";

		System.out.println("Enter your test mark: ");

		while ((testMark = System.in.read()) != -1) {
			s += (char) testMark;
			System.out.println("s " + s);

			if (testMark == (int) '\u0013')
				break;
		}

		testMark = Integer.valueOf(s);
		System.out.print("tMark " + testMark);

		if (testMark >= 90) {
			gradeLetter = 'A';
			System.out.println("You aced the test.");
		} else if (testMark >= 80) {
			gradeLetter = 'B';
			System.out.println("You did very well on this test.");
		} else if (testMark >= 70) {
			gradeLetter = 'C';
			System.out
					.println("Not bad, but you need to study more for future tests.");
		} else if (testMark >= 60) {
			gradeLetter = 'D';
			System.out
					.println("Your test result suggests that you need a tutor.");
		} else {
			gradeLetter = 'F';
			System.out
					.println("Your test result is pathetic; you need summer school.");
		}

		System.out.println("Your grade is : " + gradeLetter);
		System.out.println("Your testmark is : " + testMark);

	}
}
