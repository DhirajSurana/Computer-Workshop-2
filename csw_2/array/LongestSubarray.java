package array;

import java.util.Scanner;

public class LongestSubarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of the array");
		int length = sc.nextInt();
		int[] arr = new int[length];
		System.out.println("Enter elements");
		for (int i = 0; i < length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
		int output = longestSubArray(arr);
		System.out.println();
		System.out.println("largest subarray length is:" + output);
		sc.close();

	}

	public static int longestSubArray(int[] arr) {
		if (arr.length == 0) {
			return -1;
		}
		int length = 1;
		int maxLength = 1;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				length++;
				maxLength = Math.max(maxLength, length);
			} else {
				length = 1;
			}
		}
		return maxLength;
	}

}
