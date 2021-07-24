package lecture9;

import java.util.Scanner;

public class Backtracking {
	static int count = 0;

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// int m = scn.nextInt();
		int n = scn.nextInt();

		// boolean[] board= new boolean[n];
		// boolean[][] board = new boolean[m][n];
		boolean[][] board = new boolean[n][n];
		// QueenCombinationBoxRespect(board,0,0,2,"");
		// System.out.println(CountNQueens(board,0));
		// PrintNQueens(board, 0, "");
		// CoinChangeCoinRespect(new int[] {2,3,5,6}, 0, 10, "");
		// QueenCombinationBoxRespect2D(new boolean[2][2],0,0,0,2,"");
		// QueenCombinationBoxRespect2DRecCall(new boolean[2][2],0,0,0,2,"");
		 //QueenCombinationBoxRespect2DKill(board,0,0,0,3,"");
		// NQueen(board,0,0,0,board.length,"");
		// NQueen2ndApproach(board,0,0,0,board.length,"");
		//NKnights(board, 0, 0, 0, board.length, "");
	}

	public static void QueenCombinationBoxRespect(boolean[] board, int col, int qpsf, int tq, String ans) {

		// Positive basecase
		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}
		// Negative base case
		if (col == board.length) {
			return;
		}
		board[col] = true;
		// PLACE
		QueenCombinationBoxRespect(board, col + 1, qpsf + 1, tq, ans + "b" + col);
		// UNDO
		board[col] = false;
		// NOT PLACE
		QueenCombinationBoxRespect(board, col + 1, qpsf, tq, ans);

	}

	/*
	 * public static void CoinChangeCoinRespect(int[] denom, int vidx, int amt,
	 * String ans) { // Positive base case if (amt == 0) { System.out.println(ans);
	 * return; } if (amt < 0 || vidx == denom.length) { return; }
	 * 
	 * // Contribute CoinChangeCoinRespect(denom, vidx, amt - denom[vidx], ans); //
	 * Do not Contriute CoinChangeCoinRespect(denom, vidx + 1, amt, ans); }
	 */

	public static void PrintNQueens(boolean[][] board, int row, String result) {
		// Base case
		if (row == board.length) {
			System.out.println(result);
			return;
		}
		for (int col = 0; col < board[row].length; col++) {
			if (isItSafe(board, row, col)) {
				board[row][col] = true;
				PrintNQueens(board, row + 1, result + "{" + (row + 1) + "-" + (col + 1) + "}" + ";");

				board[row][col] = false;
			}
		}
	}

	public static int CountNQueens(boolean[][] board, int row) {
		if (row == board.length) {
			return 1;

		}
		int count = 0;
		for (int col = 0; col < board[row].length; col++) {
			if (isItSafe(board, row, col)) {
				board[row][col] = true;
				count = count + CountNQueens(board, row + 1);
				board[row][col] = false;

			}
		}
		return count;

	}

	private static boolean isItSafe(boolean[][] board, int row, int col) {

		for (int i = row; i >= 0; i--) {
			if (board[i][col]) {
				return false;
			}
		}
		for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j]) {
				return false;
			}

		}
		for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
			if (board[i][j]) {
				return false;
			}

		}
		return true;

	}

	public static void QueenCombinationBoxRespect2D(boolean[][] board, int row, int col, int qpsf, int tq, String ans) {

		// Positive basecase
		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}
		// Manually Variable Change
		if (col == board[0].length) {
			row++;
			col = 0;
		}
		// Negative base case
		if (row == board.length) {
			return;
		}
		board[row][col] = true;
		// PLACE
		QueenCombinationBoxRespect2D(board, row, col + 1, qpsf + 1, tq, ans + "{" + row + "-" + col + "}");
		// UNDO
		board[row][col] = false;
		// NOT PLACE
		QueenCombinationBoxRespect2D(board, row, col + 1, qpsf, tq, ans);

	}

	public static void QueenCombinationBoxRespect2DRecCall(boolean[][] board, int row, int col, int qpsf, int tq,
			String ans) {

		// Positive basecase
		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}
		// Manually Variable Change
		if (col == board[0].length) {
			QueenCombinationBoxRespect2DRecCall(board, row + 1, 0, qpsf, tq, ans);
			return;

		}
		// Negative base case
		if (row == board.length) {
			return;
		}
		board[row][col] = true;
		// PLACE
		QueenCombinationBoxRespect2DRecCall(board, row, col + 1, qpsf + 1, tq, ans + "{" + row + "-" + col + "}");
		// UNDO
		board[row][col] = false;
		// NOT PLACE
		QueenCombinationBoxRespect2DRecCall(board, row, col + 1, qpsf, tq, ans);

	}

	public static void QueenCombinationBoxRespect2DKill(boolean[][] board, int row, int col, int qpsf, int tq,
			String ans) {

		// Positive basecase
		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}
		// Manually Variable Change
		if (col == board[0].length) {
			row++;
			col = 0;
		}
		// Negative base case
		if (row == board.length) {
			return;
		}
		if (isItSafeToPlaceTheQueen(board, row, col)) {
			board[row][col] = true;
			// PLACE
			QueenCombinationBoxRespect2DKill(board, row, col + 1, qpsf+1, tq, ans + "{" + row + "-" + col + "}");
			// UNDO
			board[row][col] = false;

		}

		// NOT PLACE
		QueenCombinationBoxRespect2DKill(board, row, col + 1, qpsf, tq, ans);
	}

	public static boolean isItSafeToPlaceTheQueen(boolean[][] board, int row, int col) {
		// Vertically Upward
		int r = row - 1;
		int c = col;
		while (r >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
		}
		// Horizontally Left
		r = row;
		c = col - 1;
		while (c >= 0) {
			if (board[r][c]) {
				return false;
			}
			c--;
		}
		// Diagonally Left
		r = row - 1;
		c = col - 1;
		while (r >= 0 && c >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c--;
		}
		// Diagonally Right
		r = row - 1;
		c = col + 1;
		while (r >= 0 && c < board[0].length) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c++;
		}
		return true;
	}

	public static void NQueen(boolean[][] board, int row, int col, int qpsf, int tq, String ans) {

		// Positive basecase
		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}
		// Manually Variable Change
		if (col == board[0].length) {
			row++;
			col = 0;
		}
		// Negative base case
		if (row == board.length) {
			return;
		}
		if (isItSafeToPlaceTheQueen(board, row, col)) {
			board[row][col] = true;
			// PLACE
			NQueen(board, row, col + 1, qpsf + 1, tq, ans + "{" + row + "-" + col + "}");
			// UNDO
			board[row][col] = false;

		}

		// NOT PLACE
		NQueen(board, row, col + 1, qpsf, tq, ans);
	}

	public static void NQueen2ndApproach(boolean[][] board, int row, int col, int qpsf, int tq, String ans) {

		// Positive basecase
		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}
		// Manually Variable Change
		if (col == board[0].length) {
			row++;
			col = 0;
		}
		// Negative base case
		if (row == board.length) {
			return;
		}
		if (isItSafeToPlaceTheQueen(board, row, col)) {
			board[row][col] = true;
			// PLACE
			NQueen2ndApproach(board, row + 1, 0, qpsf + 1, tq, ans + "{" + row + "-" + col + "}");
			// UNDO
			board[row][col] = false;

		}

		// NOT PLACE
		NQueen2ndApproach(board, row, col + 1, qpsf, tq, ans);
	}
	/* public static void NQueenCount(boolean[][] board, int row, int col, int qpsf, int tq, String ans) {
       int Count =0;
			// Positive basecase
			if (qpsf == tq) {
				
				System.out.println(Count);
				count++;
			}
			// Manually Variable Change
			if (col == board[0].length) {
				row++;
				col = 0;
			}
			// Negative base case
			if (row == board.length) {
				return 1;
			}
			if (isItSafeToPlaceTheQueen(board, row, col)) {
				board[row][col] = true;
				// PLACE
				Count= Count +NQueenCount(board, row, col + 1, qpsf + 1, tq, ans + "{" + row + "-" + col + "}");
				// UNDO
				board[row][col] = false;

			}
	        

			// NOT PLACE
			NQueenCount(board, row, col + 1, qpsf, tq, ans);
			
		}*/

	public static void NKnights(boolean[][] board, int row, int col, int kpsf, int tk, String ans) {

		// Positive basecase
		if (kpsf == tk) {
			System.out.println(ans);
			return;
		}
		// Manually Variable Change
		if (col == board[0].length) {
			row++;
			col = 0;
		}
		// Negative base case
		if (row == board.length) {
			return;
		}
		if (isItSafeToPlaceTheKnight(board, row, col)) {
			board[row][col] = true;
			// PLACE
			NKnights(board, row, col + 1, kpsf + 1, tk, ans + "{" + row + "-" + col + "}");
			// UNDO
			board[row][col] = false;

		}

		// NOT PLACE
		NKnights(board, row, col + 1, kpsf, tk, ans);
	}

	public static boolean isItSafeToPlaceTheKnight(boolean[][] board, int row, int col) {
		int[] rowArr = { -1, -2, -2, -1 };
		int[] colArr = { 2, 1, -1, -2 };
		for (int i = 0; i < 4; i++) {
			int r = row + rowArr[i];
			int c = col + colArr[i];
			if (r >= 0 && r < board.length && c >= 0 && c < board[0].length) {
				if (board[r][c]) {
					return false;
				}

			}

		}
		return true;
	}
}
