package chapter_005;

interface Iterator {
	boolean hasMoreElements();

	Object nextElement();
}

class ToDoList_002 {
	private ToDo_002[] toDoList_002;
	private int index = 0;

	ToDoList_002(int size) {
		toDoList_002 = new ToDo_002[size];
	}

	Iterator iterator() {
		class Iter implements Iterator {
			int index = 0;

			@Override
			public boolean hasMoreElements() {
				return index < toDoList_002.length;
			}

			@Override
			public Object nextElement() {
				return toDoList_002[index++];
			}
		}
		return new Iter();
	}

	void add(ToDo_002 item) {
		toDoList_002[index++] = item;
	}
}
