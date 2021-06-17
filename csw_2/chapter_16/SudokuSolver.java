package chapter_16;

public class SudokuSolver {

	public static void main(String[] args) {
		int[][] board = new int[][] { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 8, 7, 0, 0, 0, 0, 3, 1 }, { 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
				{ 0, 5, 0, 0, 9, 0, 6, 0, 0 }, { 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
				{ 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
		int n = board.length;
		if (solve(board, n)) {
			printBoard(board);
		} 
		 else { 
			 System.out.println("unsolvable"); 
			}
			

	}

	private static boolean issafe(int[][] board, int r, int c, int n) {
		for (int i = 0; i < board.length; i++) {
			if (board[i][c] == n) {
				return false;
			}
		}

		for (int i = 0; i < board.length; i++) {
			if (board[r][i] == n) {
				return false;
			}
		}
		int sqrt = (int) Math.sqrt(board.length);
		int sr = r - r % board.length;
		int sc = c - c % board.length;
		for (int i = sr; i < sr + sqrt; i++) {
			for (int j = sc; j < sc + sqrt; j++) {
				if (board[i][j] == n) {
					return false;
				}
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

	private static boolean solve(int[][] board, int n) {
		int row = -1;
		int col = -1;
		boolean isEmpty = true;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (board[i][j] == 0) {
					row = i;
					col = j;
					isEmpty = false;
					break;
				}
			}
			if (!isEmpty) {
				break;
			}
		}
		if (isEmpty) {
			printBoard(board);
		}
		for (int i = 1; i <= n; i++) {
			if (issafe(board, row, col, i)) {
				board[row][col] = i;
				if (solve(board, n)) {
					return true;
				} else {
					board[row][col] = 0;
				}
			}
		}
		printBoard(board);
		System.out.println("---------------------------");
		return false;
	}

}
