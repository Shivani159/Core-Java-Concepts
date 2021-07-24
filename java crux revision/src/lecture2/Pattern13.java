package lecture2;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nr = 2*n-1;
		int nst = 1;

		for (int row = 1; row <= nr; row++) {
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("*"+" ");
			}
			System.out.println();
			if (row <= nr / 2) {
				nst = nst + 1;
			} else {
				nst = nst - 1;
			}

		}

	}

}
