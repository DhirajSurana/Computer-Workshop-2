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
		System.out.println(hasCycle(list.head()));
		sc.close();
	}

	public static Node1<Integer> hasCycle(Node1<Integer> head) {
		Node1<Integer> fast = head, slow = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				int cycleLen = 0;
				do {
					++cycleLen;
					fast = fast.next;
				} while (slow != fast);

				Node1<Integer> cycleLenAdvancedlter = head;

				while (cycleLen-- > 0) {
					cycleLenAdvancedlter = cycleLenAdvancedlter.next;
				}
				Node1<Integer> iter = head;

				while (iter != cycleLenAdvancedlter) {
					iter = iter.next;
					cycleLenAdvancedlter = cycleLenAdvancedlter.next;
				}

				return iter;
			}
		}
		return null;
	}
}
