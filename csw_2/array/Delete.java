package array;

import java.util.ArrayList;
import java.util.Scanner;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		ArrayList<Double> a = new ArrayList<>();
		System.out.println("enter the no of elements you want to add");
		int n = sc.nextInt();
		System.out.println("enter elements into the list");
		for (int i = 0; i < n; i++) {
			a.add(sc.nextDouble());
		}
		System.out.println(a);
		System.out.println("enter the no you want to delete");
		double remove = sc.nextInt();
		if (a.contains(remove)) {
			DeleteElement(a, remove);
		} else {
			System.out.println("Inavalid operation");
		}
		sc.close();

	}

	public static void DeleteElement(ArrayList<Double> a, double remove) {
		while (a.contains(remove) != false) {
			int index = a.indexOf(remove);
			a.remove(index);
		}
		System.out.println(a);
	}

}
