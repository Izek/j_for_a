package chapter_005;

class ToDoList_001 {
	private ToDoArray toDoArray;
	private int index = 0;

	ToDoList_001() {
		toDoArray = new ToDoArray(2);
	}

	boolean hasMoreElements() {
		return index < toDoArray.size();
	}

	ToDo_001 nextElement() {
		return toDoArray.get(index++);
	}

	void add(ToDo_001 item) {
		toDoArray.add(item);
	}

	private class ToDoArray {
		private ToDo_001[] toDoArray;
		private int index = 0;

		ToDoArray(int initSize) {
			toDoArray = new ToDo_001[initSize];
		}

		void add(ToDo_001 item) {
			if (index >= toDoArray.length) {
				ToDo_001[] temp = new ToDo_001[toDoArray.length * 2];
				for (int i = 0; i < toDoArray.length; i++)
					temp[i] = toDoArray[i];
				toDoArray = temp;
			}
			toDoArray[index++] = item;
		}

		ToDo_001 get(int i) {
			return toDoArray[i];
		}

		int size() {
			return index;
		}
	}
}
