package newProject;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		System.out.println(factorial(num));

	}

	public static int factorial(int n) {
		if (n == 0)
			return 1;
		return n * factorial(n - 1);

	}

}
