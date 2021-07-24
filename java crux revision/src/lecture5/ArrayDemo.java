package lecture5;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		Scanner scn=  new Scanner(System.in);
		
		// Declaration of Array
		int[] arr = null;
		System.out.println(arr);
		
		
		// Allocate Space 
		
		  arr = new int[5];
		  System.out.println(arr);//return address of memory allocated
		
		  
		 // Get Value

		  System.out.println(arr[0]);
		  System.out.println(arr[1]);
		  System.out.println(arr[2]);
		  System.out.println(arr[3]);
		  System.out.println(arr[4]);
		  
		  // Set value
		  arr[0]=10;
		  arr[1]=20;
		  arr[2]=30;
		  arr[3]=40;
		  arr[4]=50;
		  // Get Value
		  System.out.println(arr[0]);
		  
		  System.out.println(arr[1]);
		  
		  System.out.println(arr[2]);
		  
		  System.out.println(arr[3]);
		  
		  System.out.println(arr[4]);
		  
		  // Print Array
		  
		  for(int i= 0;i<arr.length;i++){
			  System.out.println(arr[i]);
		  }
		  
		  
		  //Enhanced FOR Loop
		  for( int val:arr){
			  System.out.println(val);
		  }
		  
		  
		  
		  
	}

}
