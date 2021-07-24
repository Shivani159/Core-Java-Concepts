package lecture2;

import java.util.Scanner;

public class Pattern25 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = 1;
		int nsp = n - 1;
		int val = 1;
		for (int row = 1; row <= n; row++) {

			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("\t");
			}
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(val + "\t");
				val++;

			}
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" \t");
			}
			System.out.println();
			nst = nst + 2;
			nsp = nsp - 1;
		}
	}
}

