package newProject;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("enter a number:");
	    int n = scan.nextInt();
		
		//int i ;
		//for (i = 0; i<=10; i++); 
		System.out.println(fib (n));
		
		
	}
	public static int fib (int n) {
		if (n==0)
			return 0;
		if (n==1)
			return 1;
		
		int result =( n + (n-1));
		
		return result;
	}

}
