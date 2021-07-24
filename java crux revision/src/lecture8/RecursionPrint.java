package lecture8;

import java.util.Scanner;

public class RecursionPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		String str = scn.nextLine();
		// PrintSS(str,"");
		// PrintPermutation(str,"");

		// PrintBoardPath(0,n,"");
		// int c=PrintBoardPathCount(0,n);
		// System.out.println(c);
		// PrintMazePath(0, n, 0, n, "");
		// System.out.println(CountMazePath(0,n,0,n));
		// PrintMazePathD(0, n, 0, n, "");
		// System.out.println(CountMazePathD(0,n,0,n));

	}

	public static void PrintSS(String str, String result) {
		// Base case
		if (str.length() == 0) {
			System.out.println(result);
			return;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		PrintSS(ros, result);
		PrintSS(ros, result + ch);

	}

	public static void PrintPermutation(String ques, String ans) {
		// Base case
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			String roq = ques.substring(0, i) + ques.substring(i + 1);

			PrintPermutation(roq, ans + ch);
		}

	}

	public static void PrintBoardPath(int curr, int end, String ans) {
		// +ve base case
		if (curr == end) {
			System.out.println(ans);
			return;
		}
		// -ve base case
		if (curr > end) {

			return;
		}
		for (int dice = 1; dice <= 6; dice++) {
			PrintBoardPath(curr + dice, end, ans + dice);

		}

	}

	public static int PrintBoardPathCount(int curr, int end) {
		// +ve base case
		if (curr == end) {

			return 1;
		}
		// -ve base case
		if (curr > end) {

			return 0;
		}
		int count = 0;
		for (int dice = 1; dice <= 6; dice++) {
			count = count + PrintBoardPathCount(curr + dice, end);

		}
		return count;

	}

	public static void PrintMazePath(int cr, int er, int cc, int ec, String ans) {
		// +ve Base case
		if (cr == er && cc == ec) {
			System.out.println(ans);
			return;
		}
		// -ve Base case
		if (cr > er || cc > ec) {
			return;
		}
		PrintMazePath(cr, er, cc + 1, ec, ans + "H");
		PrintMazePath(cr + 1, er, cc, ec, ans + "V");

	}

	public static int CountMazePath(int cr, int er, int cc, int ec) {
		// +ve Base case
		if (cr == er && cc == ec) {

			return 1;
		}
		// -ve Base case
		if (cr > er || cc > ec) {
			return 0;
		}
		int ch = CountMazePath(cr, er, cc + 1, ec);
		int cv = CountMazePath(cr + 1, er, cc, ec);

		return ch + cv;

	}

	public static void PrintMazePathD(int cr, int er, int cc, int ec, String ans) {
		// +ve Base case
		if (cr == er && cc == ec) {
			System.out.println(ans);
			return;
		}
		// -ve Base case
		if (cr > er || cc > ec) {
			return;
		}
		PrintMazePathD(cr, er, cc + 1, ec, ans + "H");
		PrintMazePathD(cr + 1, er, cc, ec, ans + "V");
		PrintMazePathD(cr + 1, er, cc + 1, ec, ans + "D");

	}

	public static int CountMazePathD(int cr, int er, int cc, int ec) {
		// +ve Base case
		if (cr == er && cc == ec) {

			return 1;
		}
		// -ve Base case
		if (cr > er || cc > ec) {
			return 0;
		}
		int ch = CountMazePathD(cr, er, cc + 1, ec);
		int cv = CountMazePathD(cr + 1, er, cc, ec);
		int cd = CountMazePathD(cr + 1, er, cc + 1, ec);

		return ch + cv + cd;

	}

}
