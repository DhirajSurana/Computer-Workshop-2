package chapter_6;

import java.util.ArrayList;
import java.util.Scanner;

public class Prime1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no.");
		int n = sc.nextInt();
		ArrayList<Integer> output = prime(n);
		System.out.println(output);
		sc.close();
	}

	public static ArrayList<Integer> prime(int n) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		if (n == 0 || n == 1) {
			return new ArrayList<Integer>();
		}
		if (n == 2) {
			al.add(2);

			return al;
		}
		if (n == 3) {
			al.add(2);
			al.add(3);
			return al;
		}

		if (n > 3) {
			al.add(2);
			al.add(3);
			for (int i = 4; i < n; i++) {
				if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
					al.add(i);
				}
			}
		}
		return al;
	}
}
//[2, 3, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]