package lecture3;

import java.util.Scanner;

public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Part 1
		byte by = 10;
		short sh = 20;
		int in = 30;
		long ln = 40;

		// by= sh;
		// by = in;
		// by =ln;
		sh = by;
		// sh=in;
		// sh=ln;
		in = by;
		in = sh;
		// in =ln;
		ln = by;
		ln = sh;

		ln = in;

		// Part 2

		by = 10; // compiler will check that literal lies in range or not.
		byte b = 10;

		// Part 3

		b = 10;
		b = 127;
		// typecasting.....
		b = (byte) 128;
		System.out.println(b);

		// Part 4

		in = 1000000000;
		// in =10000000000;
		System.out.println(in);

		// part 5

		// float f =5.5;
		float f = 5.5f;
		System.out.println(f);
		double db = 6.5;

		// part 6

		// in = f;

		in = (int) f;// compiler remove decimal part and print no.

		System.out.println(in);
		f = in; // both are of 4 byte
		System.out.println(f);

		// Part 7
		boolean bn = true;
		if (bn) {
			System.out.println("hello");
		} else {
			System.out.println("bye");

		}
		if (in > 0) {
			System.out.println("Greater");
		} else {
			System.out.println("lesser or equal");
		}

		// Part 8

		char ch = 'a';
		ch = 99;
		System.out.println(ch);
		// ch= 64000;
		// System.out.println(ch);
		// ch=ch+2;

		ch = (char) (ch + 2);
		System.out.println(ch);

		in = ch;
		System.out.println(in);

		ch = (char) 68000;
		System.out.println(ch);

		// Part 9

		System.out.println(10 + 20 + "hello" + 10 + 20);
		System.out.println(3 + " " + 9);
		System.out.println(2 + " " + 5);
		System.out.println("Hello" + "\t" + "World");
		System.out.println("Hello" + '\t' + "World");

		// Part 10

		int fmin = 0;
		int fmax = 300;
		int fstep = 20;
		int fcurrent = fmin;
		while (fcurrent <= fmax) {
			int celsius = (int) ((5.0 / 9) * (fcurrent - 32));
			System.out.println(fcurrent + "\t" + celsius);
			fcurrent = fcurrent + fstep;

		}

		// Part 11

		Scanner scn = new Scanner(System.in);

		// System.out.println(c);
		if (ch >= 97 && ch <= 122) {
			System.out.println("Lowercase");
		} else if (ch >= 65 && ch <= 90) {
			System.out.println("Uppercase");

		} else {
			System.out.println("Invalid character");
		}

	}

}
