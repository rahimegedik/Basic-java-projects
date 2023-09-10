package newProject;

import java.util.Scanner;

public class FibonacciRecursive {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		System.out.println(fibonacci(num, 0, 1));
		/* number taken by user 
        current and previous define as 0 and 1 */
		
	}
	public static int fibonacci (int n, int cur , int prev) {
	// declare three variable as number, current, and previous. 
		if (n==0) 
			return cur;
		// when number equal to 0 it will return current 
		if (n==1)
			return prev;
		// when number equal to 1 it will return previous
		return fibonacci (n-1, prev, cur + prev);
		/* when we use this recursive method it will better and for memory efficiency 
		maximum amount of stack space used at any time during compilation is less.
		*/
		
	}
	
}


