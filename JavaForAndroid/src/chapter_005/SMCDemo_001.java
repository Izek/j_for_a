package chapter_005;

public class SMCDemo_001 {
	public static void main(String[] args) {
		EnclosingClass_001.EnclosedClass.accessEnclosingClass(); // Output: 1
		EnclosingClass_001.EnclosedClass ec = new EnclosingClass_001.EnclosedClass();
		ec.accessEnclosingClass2(); // Output: 1
	}
}
