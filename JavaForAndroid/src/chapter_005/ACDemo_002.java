package chapter_005;

interface Speakable {
	void speak();
}

public class ACDemo_002 {
	public static void main(final String[] args) {
		new Speakable() {
			String msg = (args.length == 1) ? args[0] : "nothing to say";

			@Override
			public void speak() {
				System.out.println(msg);
			}
		}.speak();
	}
}
