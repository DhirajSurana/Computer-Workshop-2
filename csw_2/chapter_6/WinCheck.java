package chapter_6;

import java.util.Scanner;

public class WinCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Random r = new Random();
		/*
		 * System.out.println("Enter length of the array"); int length = sc.nextInt();
		 */
		int arr[] = { 3, 3, 1, 0, 2, 0, 1 };
		// int arr[] = { 3, 2, 0, 0, 2, 0, 1 };
		// int arr[] = { 2, 4, 1, 1, 0, 2, 3 };
		// int arr[] = { 2, 3, 1, 1, 4 };

		/*
		 * int arr[] = new int[length];
		 * 
		 * for (int i = 0; i < length; i++) { arr[i] = r.nextInt(length);
		 * System.out.print(arr[i] + " "); }
		 */
		System.out.println();
		System.out.println(checkWin(arr) ? "we win" : "we lose");
		sc.close();

	}

	public static boolean checkWin(int[] arr) {
		int reachable = 0;
		for (int i = 0; i < arr.length; i++) {
			if (reachable < i) {
				return false;
			}
			reachable = Math.max(reachable, i + arr[i]);
		}
		return true;
	}

}
