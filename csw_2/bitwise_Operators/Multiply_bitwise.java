package bitwise_Operators;

import java.util.Scanner;

public class Multiply_bitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two no.s");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = Multiply(x, y);
		System.out.println(z + " is the product of " + x + " and " + y);
		sc.close();

	}

	public static int Multiply(int x, int y) {
		int count = 0;
		int r = 0;
		for (int i = 0; i < 32; i++) {
			System.out.println(count);
			if (x == 0) {
				break;
			} else if (((x >> i) & 1) == 1) {
				r += (y << i);
				count++;
			}
		}
		return r;
	}
}
