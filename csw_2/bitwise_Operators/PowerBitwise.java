package bitwise_Operators;

import java.util.Scanner;

public class PowerBitwise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter X");
		double x = sc.nextInt();
		System.out.println("Enter Y");
		int y = sc.nextInt();
		System.out.println("X^Y=" + (int) Power(x, y));
		sc.close();
	}

	public static double Power(double x, int power) {
		double result = 1.0;
		while (power != 0) {
			if ((power & 1) != 0) {
				result *= x;
			}
			x *= x;
			power >>>= 1;
		}
		return result;
	}
}
