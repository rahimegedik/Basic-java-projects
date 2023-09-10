package newProject;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("enter a number: ");
		int n = scan.nextInt();

		System.out.println(sumOfDigits(n));

	}

	public static int sumOfDigits(int num) {
		if (num == 0)
			return 0;
		return num % 10 + sumOfDigits(num / 10);
	}

}
