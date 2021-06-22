package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Prime2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no.");
		int n = sc.nextInt();
		ArrayList<Integer> out = prime(n);
		System.out.println(out);
		sc.close();

	}

	private static ArrayList<Integer> prime(int n) {

		if (n <= 1) {
			return new ArrayList<Integer>();
		}

		// declaring boolean list and resulant arraylist
		ArrayList<Integer> result = new ArrayList<Integer>();
		ArrayList<Boolean> bool = new ArrayList<Boolean>(Collections.nCopies(n + 1, true));

		// set 0 and 1 to false
		bool.set(0, false);
		bool.set(1, false);

		// for loop to iterate all numbers < n
		for (int i = 2; i < n; i++) {
			if (bool.get(i)) {
				result.add(i);
				for (int j = i; j < bool.size(); j += i) {
					bool.set(j, false);
				}
			}
		}
		return result;
	}
}
