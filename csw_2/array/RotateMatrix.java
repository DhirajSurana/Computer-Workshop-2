package array;

import java.util.Scanner;

public class RotateMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length");
		int length = sc.nextInt();
		int arr[][] = new int[length][length];
		System.out.println("Enter elements");
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Original Matrix");
		print(arr);
		rotate(arr);
		sc.close();

	}

	private static void rotate(int[][] arr) {
		arr = transpose(arr, new int[arr.length][arr.length]);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				int temp = arr[i][0];
				arr[i][0] = arr[i][arr.length - 1];
				arr[i][arr.length - 1] = temp;
			}
		}
		System.out.println("Rotated Matrix");
		print(arr);
	}

	private static int[][] transpose(int[][] arr, int[][] b) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				b[j][i] = arr[i][j];
			}
		}
		return b;
	}

	private static void print(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
