package test;

import java.util.Scanner;

public class ElseIfDemo {

	public static void main(String[] args) {
		Scanner	scn = new Scanner(System.in);
		
		 		int marks = 60;
				int pack = 15 ;

				if (marks >= 80 || pack >= 10) {
					System.out.println("V. Good");
				} else if (marks >= 50 && pack >= 7) {
					System.out.println("Good");
				} else if (marks >= 30 && pack >= 5) {
					System.out.println("Avg");
				} else {
					System.out.println("Bad");
				}

				if (marks >= 50 || pack >= 9) {
					System.out.println("Nice");
				}else {
					System.out.println("Ok");
				}

				System.out.println("Bye");

			}
		


	}
	


