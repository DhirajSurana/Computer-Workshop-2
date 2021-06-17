package chapter_5;

import java.util.Scanner;

public class Smae_weight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no.");
		int x = sc.nextInt();
		int y = FindSameWeight(x);
		System.out.println(y + " is the no with same weight as " + x);
		sc.close();
	}

	public static int FindSameWeight(int x) {
		for (int i = 0; i < 32; i++) {
			if (((x >>> i) & 1) != ((x >>> i + 1) & 1)) {
				x ^= (1 << i) | (1 << (i + 1));
			}
		}
		return x + 1;

	}
}
