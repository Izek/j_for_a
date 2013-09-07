package chapter_005;

public class ToDo_002 {

	private String name;
	private String desc;

	ToDo_002(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}

	String getName() {
		return name;
	}

	String getDesc() {
		return desc;
	}

	@Override
	public String toString() {
		return "Name = " + getName() + ", Desc = " + getDesc();
	}
}
