package chapter_003;

public class Employee_002 {
	private String name;

	public Employee_002(String name) {
		
		setName(name);
	}

	public void setName(String empName) {
		
		name = empName; // Assign the empName argument to the name field.
	}

	public String getName() {
		return name;
	}
}
