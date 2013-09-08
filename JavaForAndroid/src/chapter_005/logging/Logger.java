package chapter_005.logging;

public interface Logger {
	boolean connect();

	boolean disconnect();

	boolean log(String msg);
}