package newProject;

import java.util.Scanner;

public class PrimeNumberTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number: ");
		int n = scan.nextInt();

		Boolean isPrime = isPrimeNumber(n, 2);

		if (isPrime == true)
			System.out.printf("%d is prime number\n", n);
		else
			System.out.printf("%d is not prime number\n", n);

	}

	public static boolean isPrimeNumber(int n, int possibleDivisor) {
		if (n == 2)
			return true;
		else if (n % possibleDivisor == 0)
			return false;
		else if (Math.pow(possibleDivisor, 2) > n)
			return true;
		else
			return isPrimeNumber(n, possibleDivisor + 1);

	}

}
