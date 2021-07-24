package test;

import java.util.Scanner;

public class LoopDemo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		int counter=1;
		while(counter<=n) {
			System.out.println("Hello  World");
			counter= counter+1; 
		}

	}

}
