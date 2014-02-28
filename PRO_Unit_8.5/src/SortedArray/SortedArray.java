package SortedArray;
public class SortedArray {

	private int[] array;
	private int numElements = 0;

	public SortedArray(int size) {

		array = new int[size];

		for (int i = 0; i < size; i++) {
			array[i] = -1;
		}

	}

	public String put(int num) {

		int cont = numElements - 1;
		while (cont >= 0 && num >= array[cont]) {
			array[cont + 1] = array[cont];
			cont--;

		}
		array[cont + 1] = num;
		numElements++;

		return "";

	}
	
	public void removeElementAt(int pos) {
		if (pos < 0 || pos > numElements - 1) {
			return;
		}
		for (int i = pos; i < numElements - 1; i++) {
			array[i] = array[i + 1];
		}
		array[numElements - 1] = -1;
		numElements--;
	}

	public String toString() {

		String s = "";
		String s2 = "";

		for (int i = numElements-1; i >= 0; i--) {
			s = array[i] + ", ";
			s2 = s2.concat(s);

		}
		return s2;
	}

	public int getNumElements() {
		return numElements;
	}

	public int getSize() {
		return array.length;
	}

	public int getElementAt(int position) {
		int Element = array[position];
		return Element;
	}

	public boolean isEmpty() {

		boolean empty = true;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == -1)
				continue;
			else {
				empty = false;
				break;
			}

		}
		return empty;

	}

	public boolean isFull() {

		boolean full = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == -1) {
				full = false;
				break;
			} else {
				full = true;
			}
		}
		return full;

	}

}
