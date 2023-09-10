package newProject;

import java.util.Scanner;

public class computingGCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two integers: ");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();

		System.out.println("the GCD of " + n1 + " and " + n2 + " is " + gcd(n1, n2));

	}

	public static int gcd(int n1, int n2) {
		if (n1 % n2 == 0) {
			return n2;
		}
		return gcd(n2, n1 % n2);

	}

}
