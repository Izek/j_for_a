package chapter_005.ex0033.logging;

public interface Logger {
	boolean connect();

	boolean disconnect();

	boolean log(String msg);
}