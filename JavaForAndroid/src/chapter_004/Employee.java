package chapter_004;

public class Employee implements Cloneable {

	String name;
	int age;

	Employee(String name, int age) {
	
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employee e1 = new Employee("John Doe", 46);
		Employee e2 = (Employee) e1.clone();
		
		Employee e3 = e1;
		
		System.out.println(e1 == e2); // Output: false
		System.out.println(e1.name == e2.name); // Output: true
	
		System.out.println(e1 == e3); // Output: ?
		
	}
}