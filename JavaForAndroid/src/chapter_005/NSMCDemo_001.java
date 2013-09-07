package chapter_005;

public class NSMCDemo_001 {

	public static void main(String[] args) {
		EnclosingClass_002 ec = new EnclosingClass_002();
		ec.new EnclosedClass().accessEnclosingClass(); // Output: 1
	}
}
