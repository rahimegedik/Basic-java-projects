package newJava;

import java.util.Scanner;

public class FindTheLargestAmongThreeNumbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter 3 number: ");
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();

		if (x > y && x > z) {
			System.out.println(x + " is the largest.");
		} else if (y > z && y > x) {
			System.out.println(y + " is the largest.");
		} else if (z > y && z > x) {
			System.out.println(z + " is the largest.");
		}
	}

}
