package test;

import java.util.Scanner;

public class PrintNnumbers {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		int counter = 1;
		while(counter<=n) {
			System.out.println(counter);
			counter= counter+1;
		}
	}

}
