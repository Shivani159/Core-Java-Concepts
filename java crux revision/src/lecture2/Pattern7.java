package lecture2;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nsp = 0;
		int nst = n;

		for (int csp = 1; csp <= nsp; csp++) {

			for (int cst = 1; cst <= nst; cst++) {

				if (cst == 1 || csp == 1 || cst == n || csp == n) {

					System.out.print("*");
				} else {

					System.out.print("   ");

				}
				System.out.println();

			}

		}
	}
}
