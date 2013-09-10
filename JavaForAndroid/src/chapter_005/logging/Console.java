package chapter_005.logging;

class Console implements Logger {
	@SuppressWarnings("unused")
	private String dstName;

	Console(String dstName) {
		this.dstName = dstName;
	}

	@Override
	public boolean connect() {
		return true;
	}

	@Override
	public boolean disconnect() {
		return true;
	}

	@Override
	public boolean log(String msg) {
		System.out.println(msg);
		return true;
	}
}