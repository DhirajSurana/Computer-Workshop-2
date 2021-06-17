package chapter_16;

import java.util.Scanner;

public class AllPermutations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// System.out.println("Enter length of the array");
		// int length = sc.nextInt();
		// char ar[] = new char[length];
		System.out.println("Enter a word");
		// for (int i = 0; i < length; i++) {
		String s = sc.nextLine();
		permute(s, "");
		// ar[i] = s.charAt(i);
		// }
		// printPermutations(ar);
		sc.close();
	}

	public static void printPermutations(char[] ar) {
		String s = Integer.toString(ar[0]);
		for (int i = 1; i < ar.length; i++) {
			s += ar[i];
		}
		permute(s, "");
	}

	public static void permute(String s, String ansSoFar) {
		if (s.length() == 0) {
			System.out.println(ansSoFar);
		}
		for (int i = 0; i < s.length(); i++) {
			char now = s.charAt(i);
			String rem = s.substring(0, i) + s.substring(i + 1);
			permute(rem, ansSoFar + now);
		}
	}

}
