package chapter_6;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Spiral {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		int length = sc.nextInt();
		int arr[][] = new int[length][length];
		System.out.println("Input elements");
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		makeSpiralList(arr);
		sc.close();
	}

	private static void makeSpiralList(int[][] arr) {
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
		int ROWS = 0;
		int COLS = 0;
		int size = arr.length;
		int bounds = 0;
		int row = 0;
		int col = 0;
		for (bounds = 0; bounds <= (size / 2) + 1; bounds++) {
			for (col = bounds; col < size - bounds; col++) {
				hs.add(arr[ROWS][col]);
				if (hs.size() >= size * size)
					break;
			}
			COLS = col - 1;
			for (row = bounds; row < size - bounds; row++) {
				hs.add(arr[row][COLS]);
				if (hs.size() >= size * size)
					break;
			}
			ROWS = row - 1;
			for (col = size - 1 - bounds; col >= bounds; col--) {
				hs.add(arr[ROWS][col]);
				if (hs.size() >= size * size)
					break;
			}
			COLS = col + 1;
			for (row = size - 1 - bounds; row >= bounds; row--) {
				hs.add(arr[row][COLS]);
				if (hs.size() >= size * size)
					break;
			}
			ROWS = row + 1;
		}
		System.out.println(hs);
	}

}
