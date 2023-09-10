package newProject;

import java.util.Scanner;

public class Fib {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("enter a  number: ");
		int i = scan.nextInt();
		System.out.println(Fibonacci(i-1) + Fibonacci(i-2));

	}
	public static int Fibonacci (int i) {
		if (i==0)
			return 0;
		if (i==1)
			return 1;
		else 
			return Fibonacci(i-1) + Fibonacci(i-2);
	}

}
