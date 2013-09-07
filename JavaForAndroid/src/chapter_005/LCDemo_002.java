package chapter_005;

public class LCDemo_002 {

	public static void main(String[] args) {
		ToDoList_002 toDoList = new ToDoList_002(5);
		toDoList.add(new ToDo_002("#1", "Do laundry."));
		toDoList.add(new ToDo_002("#2", "Buy groceries."));
		toDoList.add(new ToDo_002("#3", "Vacuum apartment."));
		toDoList.add(new ToDo_002("#4", "Write report."));
		toDoList.add(new ToDo_002("#5", "Wash car."));
		Iterator iter = toDoList.iterator();
		while (iter.hasMoreElements())
			System.out.println(iter.nextElement());
	}
}
