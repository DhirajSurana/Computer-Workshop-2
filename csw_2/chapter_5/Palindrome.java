package chapter_5;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x");
		int x = sc.nextInt();
		int y = Reverse(x);
		System.out.println("reverse of " + x + " is " + y);
		boolean z = IsPalindrome(x);
		if (z) {
			System.out.println(x + " is a palindrome");
		} else {
			System.out.println(x + " is not a palindrome");
		}
		sc.close();
	}

	public static int Reverse(int x) {
		int r = 0;
		while (x != 0) {
			r = r * 10 + x % 10;
			x /= 10;
		}
		return r;
	}

	public static boolean IsPalindrome(int x) {
		int z = Reverse(x);
		if (z == x)
			return true;
		else
			return false;
	}

}
