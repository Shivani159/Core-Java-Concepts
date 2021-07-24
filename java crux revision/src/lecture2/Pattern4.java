package lecture2;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter value for n");
		int n = scn.nextInt();
		int nst = 1;
		int nsp = n - 1;
		int row = 1;
		while (row <= n) {
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}

			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}

			System.out.println();
			row = row + 1;
			nst = nst + 1;
			nsp = nsp - 1;

		}
	}
				

	}



