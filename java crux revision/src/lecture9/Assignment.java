package lecture9;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
			int n= scn.nextInt();
			String str= scn.nextLine();
			
			PrintBoardPath(0,n,"");
			int c=PrintBoardPathCount(0,n);
			System.out.println(c);
			
			
	        
	    }

	    public static void PrintBoardPath(int curr,int end,String ans) {
			// +ve base case
			if(curr==end) {
				System.out.println(ans); 
				return;
			}
			//  -ve base case
			if(curr>end) {
				
				return;
			}
		for(int dice =1;dice<=6;dice++) {
			PrintBoardPath( curr+dice, end, ans+dice);
			
		}
			
		}
		public static int PrintBoardPathCount(int curr,int end) {
			// +ve base case
			if(curr==end) {
				 
				return 1;
			}
			//  -ve base case
			if(curr>end) {
				
				return 0;
			}
			int count =0;
			for(int dice =1;dice<=6;dice++) {
			count= count+PrintBoardPathCount(curr+dice,end)	;
				
			}
			return count;
	}

}
