package chapter_6;

import java.util.ArrayList;
import java.util.Scanner;

public class SwapElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<>();
		System.out.println("enter the no of elements you want to add in list 1");
		int n = sc.nextInt();
		System.out.println("enter elements into the list");
		for (int i = 0; i < n; i++) {
			a.add(sc.nextInt());
		}
		System.out.println(a);
		System.out.println("enter the elements you want to swap");
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		if (a.contains(s1) && a.contains(s2)) {
			int index1 = a.indexOf(s1);
			int index2 = a.indexOf(s2);
			int temp = a.set(index1, s2);
			int garbage = a.set(index2, temp);
			System.out.println(garbage);
			System.out.println(a);
		} else {
			System.out.println("swaping cannot be performed");
		}
		sc.close();
	}

}
