package linked_List;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length");
		int length = sc.nextInt();
		LinkedList1<Integer> list = new LinkedList1<>();
		System.out.println("Enter elements in sorted order");
		for (int i = 0; i < length; i++) {
			list.add(sc.nextInt());
		}

		removeDulicates(list);
		sc.close();

	}

	private static void removeDulicates(LinkedList1<Integer> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i) == list.get(i + 1)) {
				list.remove(i);
				i--;
			}
		}
		System.out.println(list);
	}

}
