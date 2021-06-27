package linked_List;

public class LinkedList1Demo {

	public static void main(String[] args) {
		LinkedList1<Integer> li = new LinkedList1<>();
		li.add(2);
		li.add(5);
		li.add(5);
		li.add(5);
		li.add(5);
		System.out.println(li);
		li.add(2);
		System.out.println(li);
		li.addFirst(6);
		System.out.println(li);
		li.removeFirst();
		System.out.println(li);
		li.removeLast();
		System.out.println(li);
		li.remove(2);
		System.out.println(li);
	}
}
