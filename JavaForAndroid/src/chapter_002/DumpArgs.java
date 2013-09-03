package chapter_002;

/**
 * Dump all command-line arguments to standard output.
 * 
 * @author Izek Schum
 */

public class DumpArgs {
	/**
	 * Application entry point.
	 * 
	 * @param args
	 *            array of command-line arguments.
	 */

	public static void main(String[] args) {
		System.out.println("Passed arguments:");
		for (int i = 0; i < args.length; i++)
			System.out.println(args[i]);
	}
}
