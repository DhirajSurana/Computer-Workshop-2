package string;

import java.util.Scanner;

public class StringToInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.next();
		int out = convertToInt(s);
		String result = convertToString(out);
		System.out.println(out + " " + result);
		sc.close();

	}

	private static String convertToString(int i) {
		StringBuilder s = new StringBuilder();
		while (i > 0) {
			s.append(i % 10);
			i /= 10;
		}
		return s.reverse().toString();
	}

	private static int convertToInt(String s) {
		int place = 1;
		int out = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			out = out + ((s.charAt(i) - 48) * place);
			place *= 10;
		}
		return out;
	}

}
