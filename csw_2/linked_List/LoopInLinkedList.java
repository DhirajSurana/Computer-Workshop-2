package linked_List;

import java.util.Scanner;

public class LoopInLinkedList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList1<Integer> list = new LinkedList1<>();
		System.out.println("enter the length");
		int length = sc.nextInt();
		for (int i = 0; i < length; i++) {
			list.add(sc.nextInt());
		}
		System.out.println(checkLoop(list));
		sc.close();
	}

	private static boolean checkLoop(LinkedList1<Integer> list) {
		Node1<Integer> slow = list.head();
		Node1<Integer> fast = list.head().next;
		while (slow.next != null) {
			if (fast == slow) {
				return true;
			} else {
				slow = slow.next;
				fast = fast.next.next;
			}
		}
		return false;
	}
}
