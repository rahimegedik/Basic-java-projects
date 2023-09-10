package newProject;

import java.util.Scanner;

public class HelloStringName {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter your name:");
		
		if (scan.hasNextDouble()) {
			String name = scan.next();
			System.out.println("invalid data");
			}
		else if (scan.hasNextInt()) {
			String name = scan.next();
			System.out.println("invalid data");
		}
		else if (scan.hasNextFloat()) {
			String name = scan.next();
			System.out.println("invalid data");
		}
		else if (scan.hasNextLong()) {
			String name = scan.next();
			System.out.println("invalid data");
		}
		else if (scan.hasNext()) {
			String name = scan.next();
			System.out.println("Hello " + name);
		}
		}

}
