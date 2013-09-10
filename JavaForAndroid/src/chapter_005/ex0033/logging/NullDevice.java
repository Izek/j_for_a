package chapter_005.ex0033.logging;

class NullDevice implements Logger {
	@SuppressWarnings("unused")
	private String dstName;

	NullDevice(String dstName) {
	}

	public boolean connect() {
		return true;
	}

	public boolean disconnect() {
		return true;
	}

	public boolean log(String msg) {
		return true;
	}
}