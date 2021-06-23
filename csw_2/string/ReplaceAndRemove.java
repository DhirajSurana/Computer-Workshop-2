package string;

import java.util.Scanner;

public class ReplaceAndRemove {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		int length = sc.nextInt();
		char[] s = new char[length];
		for (int i = 0; i < s.length; i++) {
			s[i] = sc.next().charAt(0);
		}
		int size = replaceAndRemove(length, s);
		System.out.println(size);
		sc.close();
	}

	public static int replaceAndRemove(int size, char[] s) {
		int writeldx = 0, aCount = 0;
		for (int i = 0; i < size; i++) {
			if (s[i] != 'b') {
				s[writeldx++] = s[i];
				if (s[i] == 'a') {
					++aCount;
				}
			}
		}
		int curldx = writeldx - 1;
		writeldx = writeldx + aCount - 1;
		final int finalSize = writeldx + 1;
		while (curldx >= 0) {
			if (s[curldx] == 'a') {
				s[writeldx--] = 'd';
				s[writeldx--] = 'd';
			} else {
				s[writeldx--] = s[curldx];
			}
			--curldx;
		}
		return finalSize;
	}
}
