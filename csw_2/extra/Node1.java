package extra;

public class Node1 {

	int value;
	Node1 next;

	public Node1() {
		value = 0;
		next = null;
	}

	public Node1(int value) {
		this.value = value;
	}

	public Node1(int value, Node1 next) {
		this.value = value;
		this.next = next;
	}
}
