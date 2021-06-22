package recursion;

import java.util.Scanner;

public class NQueens {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the chess board");
		int n = sc.nextInt();
		int[][] board = new int[n][n];
		// Arrays.fill(board, 0);
		if (findNQueensTill(board, n, 0)) {
			printBoard(board);
		} else {
			System.out.println("No solution exists");
		}
		sc.close();
	}

	private static boolean findNQueensTill(int[][] board, int n, int col) {
		if (col >= n) {
			return true;
		}
		for (int row = 0; row < n; row++) {
			if (isSafe(board, row, col)) {
				board[row][col] = 1;
				if (findNQueensTill(board, n, col + 1)) {
					return true;
				}
				board[row][col] = 0;
			}
		}
		return false;
	}

	private static boolean isSafe(int[][] board, int row, int col) {

		// row
		for (int i = 0; i < col; i++) {
			if (board[row][i] == 1) {
				return false;
			}
		}

		// upper diagonal on left side diagonal
		int i, j;
		for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j] == 1) {
				return false;
			}
		}
		// lower diagonal on left side
		for (i = row, j = col; i < board.length && j >= 0; i++, j--) {
			if (board[i][j] == 1) {
				return false;
			}
		}
		return true;
	}

	private static void printBoard(int[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

}
