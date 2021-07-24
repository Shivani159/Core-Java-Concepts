package lecture4;

import java.util.Scanner;

public class AnybaseToAnybase {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int sn = scn.nextInt();
		int sb = scn.nextInt();
		int db = scn.nextInt();
		int answer = AnybaseToAnybase( sn, sb, db);
		System.out.println(answer);
	}

			

		public  static int AnybaseToAnybase(int sn,int sb,int db) {
		int res = AnybasetoDecimal(sn, sb);
		int con = DecimalToAnybase(res, db);
	
		return con;
		
	
	}

	public static int AnybasetoDecimal(int sn, int sb) {
		int ans = 0;
		int multiplyer = 1;
		while (sn > 0) {
			int rem = sn % 10;
			ans = ans + rem * multiplyer;
			multiplyer = multiplyer * sb;
			sn = sn / 10;

		}
		return ans;

	}

	public static int DecimalToAnybase(int res, int db) {
		int ans = 0;
		int multiplyer = 1;
		while (res > 0) {
			int rem = res% db;
			ans = ans + rem * multiplyer;
			multiplyer = multiplyer * 10;
			res = res / db;

		}
		return ans;

	}

}
