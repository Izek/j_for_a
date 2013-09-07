package chapter_005;

public class NSMCDemo_002 {

	public static void main(String[] args) {
		ToDoList_001 toDoList = new ToDoList_001();

		toDoList.add(new ToDo_001("#1", "Do laundry."));
		toDoList.add(new ToDo_001("#2", "Buy groceries."));
		toDoList.add(new ToDo_001("#3", "Vacuum apartment."));
		toDoList.add(new ToDo_001("#4", "Write report."));
		toDoList.add(new ToDo_001("#5", "Wash car."));

		while (toDoList.hasMoreElements())
			System.out.println(toDoList.nextElement());
	}
}
