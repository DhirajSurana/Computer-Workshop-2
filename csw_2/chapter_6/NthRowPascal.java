package chapter_6;

import java.util.Scanner;

public class NthRowPascal {
	private static int memo[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter row no. ");
		int row = sc.nextInt();
		memo = new int[row + 1];
		calc(row - 1);
		sc.close();

	}

	private static void calc(int row) {
		int arr[] = new int[row + 1];
		for (int i = 0; i <= row; i++) {
			int num = fact(row);
			int deno1 = fact(i);
			int deno2 = fact(row - i);
			arr[i] = num / (deno1 * deno2);
		}
		print(arr);
	}

	private static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static int fact(int row) {
		if (row == 0) {
			return 1;
		}
		if (memo[row] != 0) {
			return memo[row];
		}
		memo[row] = row * fact(row - 1);
		return memo[row];
	}

}
