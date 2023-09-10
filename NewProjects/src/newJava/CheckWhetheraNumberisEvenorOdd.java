package newJava;

import java.util.Scanner;

public class CheckWhetheraNumberisEvenorOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("enter a number: ");
		int x = scan.nextInt();

		if (x % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}

	}

}
