package lecture4;

import java.util.Scanner;

public class AnybaseToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		int sn= scn.nextInt();
		int sb= scn.nextInt();
		
		int res =AnybasetoDecimal(sn,sb);
		System.out.println(res);
		}
	public static int AnybasetoDecimal(int sn,int sb) {
		int ans=0;
		int multiplyer=1;
		while(sn!=0) {
			int rem = sn%10;
		 ans= ans + rem*multiplyer;
		 multiplyer  = multiplyer * sb;
		 sn=sn/10;
		 
			
			
		}
		return ans;
	}

}
