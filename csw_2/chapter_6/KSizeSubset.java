package chapter_6;

import java.util.Scanner;

public class KSizeSubset {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
		int length = sc.nextInt();
		int arr[] = new int[length];
		System.out.println("Enter elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter group size");
		int k = sc.nextInt();
		int n = arr.length;
		printCombination(arr, n, k);
		sc.close();
	}

	static void combinationUtil(int arr[], int n, int r, int index, int data[], int i) {
		if (index == r) {
			for (int j = 0; j < r; j++)
				System.out.print(data[j] + " ");
			System.out.println("");
			return;
		}
		if (i >= n)
			return;
		data[index] = arr[i];
		combinationUtil(arr, n, r, index + 1, data, i + 1);
		combinationUtil(arr, n, r, index, data, i + 1);
	}

	static void printCombination(int arr[], int n, int r) {
		if (r > n) {
			throw new IllegalArgumentException("group size cannot be greater than tha array length");
		}
		int data[] = new int[r];
		combinationUtil(arr, n, r, 0, data, 0);
	}

}
