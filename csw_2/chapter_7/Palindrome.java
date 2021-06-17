package chapter_7;

import java.util.Scanner;

public class Palindrome {
	// A man, a plan, a canal, Panama.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String sen = sc.next();
		System.out.println(checkPalindrome(sen) ? "is a palindrome" : "not a palindrome");
		sc.close();
	}

	private static boolean checkPalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			while (Character.isLetterOrDigit(s.charAt(i))) {
				i++;
			}
			while (Character.isLetterOrDigit(s.charAt(j))) {
				j--;
			}
			if (Character.isLowerCase(s.charAt(i)) != Character.isLowerCase(s.charAt(i))) {
				return false;
			}
		}
		return true;
	}

}
