package lecture2;

import java.util.Scanner;

public class Pattern24 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = 1;
		int nsp = n - 1;
		int val;
		for (int row = 1; row <= n; row++) {
			val = row;
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(val);

			}
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}
			System.out.println();
			nst = nst + 2;
			nsp = nsp - 1;
		}
	}

}
