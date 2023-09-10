package newProject;

import java.util.Scanner;

public class NumberofEvenDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int num = scan.nextInt();

		System.out.println(NumberofEvenDigits(num));

	}

	public static int NumberofEvenDigits(int num) {
		if (num / 10 == 0) {
			if (num % 2 == 0)
				return 1;
			else
				return 0;
		}
		if (num % 10 % 2 == 0)
			return 1 + NumberofEvenDigits(num / 10);
		else
			return 0 + NumberofEvenDigits(num / 10);

	}

}
