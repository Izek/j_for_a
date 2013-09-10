package chapter_005.ex0035.logging;

class NullDevice implements Logger {
	@SuppressWarnings("unused")
	private String dstName;

	NullDevice(String dstName) {
	}

	@Override
	public void connect() {
		// return true;
	}

	@Override
	public void disconnect() {
		// return true;
	}

	@Override
	public void log(String msg) {
		// return true;
	}
}