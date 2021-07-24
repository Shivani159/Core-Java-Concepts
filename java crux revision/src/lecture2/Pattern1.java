package lecture2;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for(int row=1;row<=n;row++) {
			for(int col = 1;col<=n ;col++) {
				System.out.print("*");
			
			}
			System.out.println();
		}
	}

}
