package chapter_5;

import java.util.*;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two positive no.s");
		System.out.println("Enter x");
		int x = sc.nextInt();
		System.out.println("Enter y");
		int y = sc.nextInt();
		int z = Div(x, y);
		System.out.println("Quotient of x/y= " + z);
		sc.close();
	}

	public static int Div(int x, int y) {
		int q = 0;
		while (x > y) {
			int k = 0;
			while ((y << k) <= x) {
				k++;
			}
			x -= (y << k - 1);
			q += Math.pow(2, (k - 1));
		}
		return q;

	}

}
