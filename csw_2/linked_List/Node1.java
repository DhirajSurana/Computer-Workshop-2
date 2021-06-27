package linked_List;

public class Node1<T> {

	T value;
	Node1<T> next;

	public Node1(T value) {
		this.value = value;
		next = null;
	}

	public Node1(T value, Node1<T> next) {
		this.value = value;
		this.next = next;
	}
}
