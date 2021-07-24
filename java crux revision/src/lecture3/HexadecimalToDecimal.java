package lecture3;

import java.util.Scanner;

public class HexadecimalToDecimal {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int ans = 0;
		int multiplyer = 1;
		while (n > 0) {
			int rem = n % 10;
			ans = ans + rem * multiplyer;
			n = n / 10;
			multiplyer = multiplyer * 16;
		}
		System.out.println(ans);
	}

}
