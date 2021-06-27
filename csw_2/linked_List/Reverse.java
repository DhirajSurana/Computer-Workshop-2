package linked_List;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the length of the list");
		int length = sc.nextInt();
		System.out.println("Enter elements");
		LinkedList1<Integer> list = new LinkedList1<>();
		for (int i = 0; i < length; i++) {
			list.add(sc.nextInt());
		}
		System.out.println("list before reversing");
		System.out.println(list);
		list.reverse(2, 5);
		System.out.println("List after reversing form 2 to 5");
		System.out.println(list);
		sc.close();
	}
}
