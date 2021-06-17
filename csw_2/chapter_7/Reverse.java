package chapter_7;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String s = sc.nextLine();
		char[] out = reverseSentence(s.toCharArray());
		System.out.println(out);
		sc.close();
	}

	private static char[] reverse(char[] s, int start, int end) {
		for (int i = start, j = end - 1; i < j; j--, i++) {
			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;
		}
		return s;
	}

	private static char[] reverseSentence(char[] s) {
		char[] res = reverse(s, 0, s.length);
		int i = 0;
		int j = i;
		for (i = 0; i < res.length - 1; i++) {
			if (res[i] == ' ') {
				reverse(res, j, i);
				j = i + 1;
			}
		}
		reverse(res, j, res.length);
		return res;

	}
}
