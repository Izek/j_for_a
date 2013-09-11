package chapter_006;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Employee_002 {
	private String name;

	Employee_002(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}
}

public class TypeSafety {
	public static void main(String[] args) {
		List employees = new ArrayList();
		employees.add(new Employee_002("John Doe"));
		employees.add(new Employee_002("Jane Smith"));
		employees.add("Jack Frost");
		Iterator iter = employees.iterator();
		while (iter.hasNext()) {
			Employee_002 emp = (Employee_002) iter.next();
			System.out.println(emp.getName());
		}
	}
}