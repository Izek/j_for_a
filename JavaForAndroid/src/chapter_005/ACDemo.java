package chapter_005;

abstract class Speaker {
	abstract void speak();
}

public class ACDemo {
	public static void main(final String[] args) {
		new Speaker() {
			String msg = (args.length == 1) ? args[0] : "nothing to say";

			@Override
			void speak() {
				System.out.println(msg);
			}
		}.speak();
	}
}
//