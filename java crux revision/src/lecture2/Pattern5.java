package lecture2;    

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		 int nst =n;
		 int nsp =0;
		 int row = 1;
		  while(row<=n) {
			  
			  
			  
			  for(int csp = 1;csp<=nsp; csp++) {
				  System.out.print(" ");
		  }
			  for(int cst=1;cst<=nst;cst++) {
				  System.out.print("*");
			  }
			  
				  System.out.println(); 
				  row = row + 1;
				  nsp =nsp+1;
				  nst = nst - 1;
				  
				  
			  }
		  }
				
	}


