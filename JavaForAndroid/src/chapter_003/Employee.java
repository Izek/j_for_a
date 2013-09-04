package chapter_003;

public class Employee {
	String name;

	Employee(String name) {
		setName(name);
	}

	void setName(String name) {
		if (name == null) {
			System.out.println("name cannot be null");

			return;
		} else {
			this.name = name;
		}
	}

	public static void main(String[] args) {
		Employee john = new Employee(null);
		
		john.setName(null);
	}
}
