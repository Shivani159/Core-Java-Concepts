package lecture4;

import java.util.Scanner;

public class DecimaltoAnybase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int sn = scn.nextInt();
		int db = scn.nextInt();

		int res = DecimalToAnybase(sn, db);
		System.out.println(res);
	}

	public static int DecimalToAnybase(int sn, int db) {
		int ans = 0;
		int multiplyer = 1;
		while (sn != 0) {
			int rem = sn % db;
			ans = ans + rem * multiplyer;
			multiplyer = multiplyer * 10;
			sn = sn / db;

		}
		return ans;

	}

}
