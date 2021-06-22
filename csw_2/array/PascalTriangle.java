package array;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no. of rows");
		int rows = sc.nextInt();
		int[][] pascaltri = new int[rows][rows];
		fillindices(pascaltri);
		sc.close();
	}

	private static void fillindices(int[][] pascaltri) {
		for (int i = 0; i < pascaltri.length; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					pascaltri[i][j] = 1;
				} else {
					pascaltri[i][j] = pascaltri[i - 1][j - 1] + pascaltri[i - 1][j];
				}
			}
		}
		print(pascaltri);
	}

	private static void print(int[][] pascaltri) {
		System.out.println("Triangle:");
		for (int i = 0; i < pascaltri.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(pascaltri[i][j] + " ");
			}
			System.out.println();
		}

	}

}
