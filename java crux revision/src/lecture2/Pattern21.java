package lecture2;

import java.util.Scanner;

public class Pattern21 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = 1;
		int nsp = 2 * n - 3;
		for (int row = 1; row <= n; row++) {
			//STARS
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}
			//SPACES
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}
			//STARS
			int cst = 1;
			if(row==n) {
				cst=2;
			}
			for (; cst <= nst; cst++) {
				System.out.print("*");
			}
			//PREP
			System.out.println();
			nst = nst + 1;
			nsp = nsp - 2;

		}

	}
}
