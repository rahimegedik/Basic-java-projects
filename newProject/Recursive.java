package newProject;

import java.util.Scanner;

public class Recursive {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("sayý gir: ");
		int num = scan.nextInt();
		System.out.println(toplama(num));

	}

	public static int toplama(int num) {
		if (num == 1)
			return 1;

		return toplama(num - 1) + (num);

	}

}
