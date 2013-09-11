package chapter_006;

class Employee {
	/**
	 * Employee's name
	 * 
	 * @deprecated New version uses firstName and lastName fields.
	 */
	@Deprecated
	String name;
	String firstName;
	String lastName;
}

public class UseEmployee {
	public static void main(String[] args) {
		TypeSafety emp = new TypeSafety();
		emp.name = "John Doe";
	}
}