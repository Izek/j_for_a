package chapter_003;

class C {
	static {
		System.out.println("class initializer 1");
	}
	static int counter = 1;
	static {
		System.out.println("class initializer 2");
		System.out.println("counter = " + counter);
	}
}
