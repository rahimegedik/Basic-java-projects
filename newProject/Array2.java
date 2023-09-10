package newProject;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("isminizi giriniz: ");
		String name = scan.nextLine();
		String name1 = name.toUpperCase();

		char[] array = new char[name1.length()];
		for (int i = 0; i < name1.length(); i++) {
			array[i] = name1.charAt(i);
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}

	}

}
