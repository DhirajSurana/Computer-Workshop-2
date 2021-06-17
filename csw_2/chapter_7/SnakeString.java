package chapter_7;

import java.util.Scanner;

public class SnakeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String sen = sc.nextLine();
		snakeString(sen);
		sc.close();

	}

	private static void snakeString(String sen) {
		int len = sen.length(), count = 0;
		StringBuilder s1, s2, s3;
		s1 = new StringBuilder();
		s2 = new StringBuilder();
		s3 = new StringBuilder();
		for (int i = 0; i < len; i++) {
			if (i % 2 == 0) {
				s2.append(sen.charAt(i));
			} else {
				if (count % 2 == 0) {
					s1.append(sen.charAt(i));
					count++;
				} else {
					s3.append(sen.charAt(i));
					count++;
				}
			}
		}
		s1.append(s2);
		s1.append(s3);
		System.out.println(s1.toString());

	}
}
