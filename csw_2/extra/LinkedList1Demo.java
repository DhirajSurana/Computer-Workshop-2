package extra;

public class LinkedList1Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList1 li = new LinkedList1();
		li.add(2);
		li.add(5);
		li.add(5);
		li.add(5);
		li.add(5);
		System.out.println(li);
		li.reverse();
		li.add(56);
		System.out.println(li);
		System.out.println(li.size());
	}

}
