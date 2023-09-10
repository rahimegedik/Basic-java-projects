import java.util.Scanner;

public class FibonacciRecursive {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		for (int i = 0; i < num; i++) {

			System.out.print(fibonacci(i, 0, 1) + ",");
		}

	}

	public static int fibonacci(int n, int cur, int prev) {

		if (n == 0)
			return cur;

		if (n == 1)
			return prev;

		return fibonacci(n - 1, prev, cur + prev);

	}

}
