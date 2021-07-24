package lecture2;

import java.util.Scanner;

public class Pattern32 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nr = 2 * n - 1;
		int nst = 1;
		int val;
		for (int row = 1; row <= nr; row++) {
			if(row<=nr/2+1) 
				val=row;
			else
				val=nr-row+1;
			
			for (int cst = 1; cst <= nst; cst++) {
				if(cst%2==0) {
				System.out.print("*");
				}else {
					System.out.print(val);
				}
				
				
			}
			System.out.println();
			if (row <= nr / 2) {
				nst = nst + 2;
			} else {
				nst = nst - 2;
			}

		}
	}

}
