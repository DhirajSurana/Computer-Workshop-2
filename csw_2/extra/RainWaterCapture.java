package extra;

import java.util.Scanner;

public class RainWaterCapture {

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
		int output = harvest(arr);
		System.out.println();
		System.out.println("Total RainWater trapped is:" + output);
		sc.close();

	}

	public static int harvest(int[] arr) {
		if (arr.length == 0) {
			return 0;
		}
		int waterTrapped = 0;
		int maxLeft = arr[0];
		int maxRight = arr[arr.length - 1];
		for (int i = 1; i < arr.length - 1; i++) {
			if (maxLeft < maxRight) {
				if (arr[i] > maxLeft) {
					maxLeft = arr[i];
				} else {
					waterTrapped += maxLeft - arr[i];
				}
			}
			if (maxLeft > maxRight) {
				if (arr[i] > maxRight) {
					maxRight = arr[i];
				} else {
					waterTrapped += maxRight - arr[i];
				}
			}

		}
		return waterTrapped;
	}

}
