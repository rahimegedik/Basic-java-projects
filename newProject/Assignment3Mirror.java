package newProject;

import java.util.Scanner;

public class Assignment3Mirror {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();

		Mirror(num);

	}

	public static void Mirror(int n) {
		if (n == 1) {
			System.out.print("1, ");
			return;

		}
		if (n == -1) {
			System.out.print("-1, ");
			return;

		}
		if (n >= 1 || n <= -1) {
			System.out.print(n + ", ");
			Mirror(n / 2);
			System.out.print(n + ", ");

		}

	}
}
