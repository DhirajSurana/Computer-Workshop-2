package string;

import java.util.Scanner;

public class EncodingAndDecoding {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.next();
		String encoded = encode(s);
		System.out.println(encoded);
		if (encoded != null) {
			String ans = decode(encoded);
			System.out.println(ans);
		} else
			System.out.println("Invalid");

		sc.close();
	}

	private static String encode(String s) {
		StringBuilder sb = new StringBuilder();
		boolean valid = true;
		int count = 1;
		char ch = s.charAt(0);
		for (int i = 1; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				valid = false;
				break;
			}
			if (s.charAt(i) == ch) {
				count += 1;
			} else {
				sb.append(count);
				sb.append(ch);
				ch = s.charAt(i);
				count = 1;
			}
		}
		sb.append(count);
		sb.append(ch);
		if (valid)
			return sb.toString();
		else
			return null;

	}

	private static String decode(String s) {
		StringBuilder sb = new StringBuilder();
		int index = 0, count = 1;
		while (index < (s.length() - 1)) {
			count = s.charAt(index) - 48;
			for (int i = 0; i < count; i++) {
				sb.append(s.charAt(index + 1));
			}
			index += 2;
		}
		return sb.toString();
	}

}
