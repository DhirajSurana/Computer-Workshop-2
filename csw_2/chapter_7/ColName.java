package chapter_7;

import java.util.Scanner;

public class ColName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no");
		int num = sc.nextInt();
		String result = findColName(num);
		System.out.println("Corresponding column is " + result);
		sc.close();
	}

	private static String findColName(int num) {
		StringBuilder sb = new StringBuilder();
		while (num > 0) {
			int temp = num % 26;
			if (temp == 0) {
				sb.append('Z');
				num = (num / 26) - 1;
			} else {
				sb.append((char) ((temp - 1) + 'A'));
				num /= 26;
			}
		}
		return sb.reverse().toString();
	}

}
