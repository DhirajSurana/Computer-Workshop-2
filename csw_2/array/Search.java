package array;

import java.util.ArrayList;
import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<>();
		System.out.println("enter the no of elements you want to add");
		int n = sc.nextInt();
		System.out.println("enter elements into the list");
		for (int i = 0; i < n; i++) {
			a.add(sc.nextInt());
		}
		System.out.println(a);
		System.out.println("enter the no you want to search");
		int search = sc.nextInt();
		boolean result = a.contains(search);
		System.out.println(result ? "List contains " + search : "List doesn't contain " + search);
		sc.close();
	}

}
