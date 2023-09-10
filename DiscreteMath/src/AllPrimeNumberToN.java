import java.util.Scanner;

public class AllPrimeNumberToN {

	static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	static void printPrime(int n) {
		for (int i = 2; i <= n; i++) {
			if (isPrime(i))
				System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("enter a number: ");
		int n = scan.nextInt();
		printPrime(n);

	}

}
