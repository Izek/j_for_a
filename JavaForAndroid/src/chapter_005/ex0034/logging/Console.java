package chapter_005.ex0034.logging;

class Console implements Logger {
	@SuppressWarnings("unused")
	private String dstName;

	Console(String dstName) {
		this.dstName = dstName;
	}

	public void connect() throws CannotConnectException {
	}

	public void disconnect() throws NotConnectedException {
	}

	public void log(String msg) throws NotConnectedException {
		System.out.println(msg);
	}
}