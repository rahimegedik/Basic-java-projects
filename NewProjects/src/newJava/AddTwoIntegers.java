package newJava;

import java.util.Scanner;

public class AddTwoIntegers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter two number: ");
		int first = scan.nextInt();
		int second = scan.nextInt();

		System.out.println("sum of this number : " + (first + second));

	}

}
