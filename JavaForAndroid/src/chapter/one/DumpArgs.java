package chapter.one;

public class DumpArgs {

	public static void main(String[] args) {

		System.out.println("Arguments that were passed are: ");

		for (int i = 0; i < args.length; i++) {
			System.out.print("\'" + args[i] + "\' ");
		}

		System.out.println();
	}
}
