package bitwise_Operators;

import java.util.Scanner;

public class Parity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Enter a number");
		x = sc.nextInt();
		int count = 0;
		while (x != 0) {
			count += x & 1;
			x = x >> 1;
		}
		if (count % 2 == 0) {
			System.out.println("parity: 0");
		} else {
			System.out.println("parity: 1");
		}
		sc.close();

	}

}
