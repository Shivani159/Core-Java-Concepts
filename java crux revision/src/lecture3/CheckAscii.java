package lecture3;

import java.util.Scanner;

public class CheckAscii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		char ch= scn.next().charAt(0);
		//System.out.println(c);
		if(ch>=97&&ch<=122) {
			System.out.println("Lowercase");
		}else if(ch>=65&&ch<=90) {
			System.out.println("Uppercase");
			
		}else {
			System.out.println("Invalid character");
		}
		

	}

}
