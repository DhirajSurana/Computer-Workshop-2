package chapter_5;

import java.util.Scanner;

public class Subtraction_bitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x");
		int x = sc.nextInt();
		System.out.println("Enter y");
		int y = sc.nextInt();
		int z = Subtract(x, y);
		System.out.println("x-y= " + z);
		sc.close();
	}

	public static int Subtract(int x, int y) {
		while (y != 0) {
			int borrow = (~x) & y;
			x ^= y;
			y = borrow << 1;
		}
		return x;
	}

}
