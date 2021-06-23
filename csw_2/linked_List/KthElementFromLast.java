package linked_List;

import java.util.Scanner;

public class KthElementFromLast {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of the list");
		int length = sc.nextInt();
		LinkedList1<Integer> list = new LinkedList1<>();
		System.out.println("Enter elements");
		for (int i = 0; i < length; i++) {
			list.add(sc.nextInt());
		}
		System.out.println(list);
		System.out.println("ENter the value of k");
		int k = sc.nextInt();
		list.removeKthFromLast(k);
		System.out.println(list);
		sc.close();
	}

}
