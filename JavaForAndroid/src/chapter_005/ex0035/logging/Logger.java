package chapter_005.ex0035.logging;

public interface Logger {
	void connect() throws CannotConnectException;

	void disconnect() throws NotConnectedException;

	void log(String msg) throws NotConnectedException;
}