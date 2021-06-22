package array;

import java.util.ArrayList;
import java.util.Scanner;

public class deleteAll {

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
		a.clear();
		System.out.println(a);
		sc.close();
	}

}
