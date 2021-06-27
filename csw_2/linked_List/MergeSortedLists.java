package linked_List;

import java.util.Scanner;

public class MergeSortedLists {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of list 1");
		int length1 = sc.nextInt();
		System.out.println("enter the length of list 2");
		int length2 = sc.nextInt();
		System.out.println("Enter elements in list 1 in sorted manner");
		Node1<Integer> list1Head = null;
		Node1<Integer> list2Head = null;
		Node1<Integer> current = null;
		Node1<Integer> temp = null;
		for (int i = 0; i < length1; i++) {
			if (i == 0) {
				list1Head = new Node1<Integer>(sc.nextInt());
				current = list1Head;
			} else {
				temp = new Node1<Integer>(sc.nextInt());
				current.next = temp;
				current = temp;
			}
		}
		System.out.println("Enter elements in list 2 in sorted manner");
		for (int i = 0; i < length2; i++) {
			if (i == 0) {
				list2Head = new Node1<Integer>(sc.nextInt());
				current = list2Head;
			} else {
				temp = new Node1<Integer>(sc.nextInt());
				current.next = temp;
				current = temp;
			}
		}
		System.out.println("List 1");
		temp = list1Head;
		while (temp != null) {
			System.out.print(temp.value + " ");
			temp = temp.next;
		}
		System.out.println();
		System.out.println("List 2");
		temp = list2Head;
		while (temp != null) {
			System.out.print(temp.value + " ");
			temp = temp.next;
		}

		Node1<Integer> resultListHead = mergeSortedLists(list1Head, list2Head);
		temp = resultListHead;
		while (temp != null) {
			System.out.print(temp.value + " ");
			temp = temp.next;
		}
		sc.close();
	}

	private static Node1<Integer> mergeSortedLists(Node1<Integer> list1Head, Node1<Integer> list2Head) {
		if (list1Head == null) {
			return list2Head;
		}
		if (list2Head == null) {
			return list1Head;
		}
		Node1<Integer> head = new Node1<Integer>(0);
		Node1<Integer> temp = head;
		Node1<Integer> head1 = list1Head;
		Node1<Integer> head2 = list2Head;
		while (head1.next != null || head2.next != null) {
			if (head1.value > head2.value) {
				temp.value = head2.value;
				head2 = head2.next;
			} else {
				temp.value = head1.value;
				head1 = head1.next;
			}
		}
		if (head1.next != null) {
			temp.next = head1;
		}
		if (head2.next != null) {
			temp.next = head2;
		}
		return head;
	}
}
