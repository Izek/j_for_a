package chapter_005;

class EnclosingClass_001 {
	private static int i;

	private static void m1() {
		System.out.println(i);
	}

	static void m2() {
		EnclosedClass.accessEnclosingClass();
	}

	static class EnclosedClass {
		static void accessEnclosingClass() {
			i = 1;
			m1();
		}

		void accessEnclosingClass2() {
			m2();
		}
	}
}
