package extra;

public class LinkedList1 {

	static Node1 head;
	Node1 current;
	static int length = 0;

	// insert
	public boolean add(int value) {
		addLast(value);
		return true;
	}

	// insert at first
	public boolean addFirst(int value) {
		Node1 newNode = new Node1(value, head);
		head = newNode;
		return true;
	}

	// insert at last
	public boolean addLast(int value) {
		if (length == 0) {
			head = new Node1(value);
			current = head;
			length++;
			return true;

		} else {
			Node1 temp = new Node1(value);
			current.next = temp;
			current = temp;
			length++;
			return true;
		}
	}

	// delete from first
	public int removeFirst() {
		if (head == null) {
			throw new NullPointerException();
		}
		int removed = head.value;
		head = head.next;
		length--;
		return removed;

	}

	// delete from last
	public int removeLast() {
		if (head == null) {
			throw new NullPointerException();
		}

		Node1 temp = head;
		Node1 last = head;

		int removed = head.value;

		while (temp.next != null) {
			last = temp;
			removed = temp.value;
			temp = temp.next;
		}

		last.next = null;
		length--;
		return removed;
	}

	// replace
	public int replace(int index, int value) {

		if (index < 0 || index > length) {
			throw new ArrayIndexOutOfBoundsException(" index " + index + " does not exist");
		}

		Node1 temp = head;
		int data = 0;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
			value = temp.value;
		}
		temp.value = value;
		return data;

	}

	// size
	public int size() {
		return length;
	}

	// reverse
	public void reverse() {
		Node1 temp = null;
		Node1 curr = head;
		Node1 nex = head;
		while (curr != null) {
			nex = curr.next;
			curr.next = temp;
			temp = curr;
			curr = nex;
		}
		current = head;
		head = temp;
	}

	@Override
	public String toString() {
		return print() + "]";
	}

	// to print the list
	private String print() {
		String s = "[";
		Node1 temp = head;
		int count = 0;
		while (temp != null) {
			if (length == 1) {
				return s + temp.value;
			} else {
				if (count == length - 1) {
					s += temp.value;
				} else {
					s += temp.value + ",";
				}
				count++;
				temp = temp.next;
			}
		}
		return s;
	}

}
