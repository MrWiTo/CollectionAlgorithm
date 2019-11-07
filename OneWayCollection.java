public class OneWayCollection {
	int size;
	Number pointer;

	public OneWayCollection(String[] tab) {
		size = tab.length;

		pointer = new Number(Integer.parseInt(tab[0]), null);
		Number tmp = pointer;

		for (int i = 1; i < tab.length; i++) {
			Number tmp1 = new Number(Integer.parseInt(tab[i]), null);
			tmp.setNext(tmp1);
			tmp = tmp1;
		}
		
		tmp.setNext(pointer);
	}

	public void add() {
		Number nVal = new Number(pointer.value - 1, pointer.next);
		pointer.next = nVal;
		movePointer(pointer.value);
		size++;
	}

	public void movePointer(int var) {
		for (int i = 0; i < var; i++)
			pointer = pointer.next;
	}

	public void delete() {
		Number tmp = pointer.next;
		pointer.next = tmp.next;
		movePointer(tmp.value);
		size--;
	}

	public void showCollection() {
		for (int i = 0; i < this.size; i++) {
			System.out.print(pointer.value + " ");
			movePointer(1);
		}
	}
}