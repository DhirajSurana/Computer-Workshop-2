package string;

import java.util.Scanner;

public class ColumnNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the column");
		String col = sc.next();
		int colno1 = findColifAis1(col);
		int colno2 = findColifAis0(col);
		System.out.println("column no. if A is 1: " + colno1);
		System.out.println("column no. if A is 0: " + colno2);
		sc.close();

	}

	private static int findColifAis1(String col) {
		int rv = 0;
		for (int i = 0; i < col.length(); i++) {
			rv = rv * 26 + col.charAt(i) - 'A' + 1;
		}
		return rv;
	}

	private static int findColifAis0(String col) {
		int rv = 0;
		for (int i = 0; i < col.length(); i++) {
			if (i == 0) {
				rv = rv * 26 + col.charAt(i) - 'A' + 0;
			} else {
				rv = 26 + rv * 26 + col.charAt(i) - 'A' + 0;
			}
		}
		return rv;
	}

}
