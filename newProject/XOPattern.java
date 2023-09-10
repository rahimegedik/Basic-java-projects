package newProject;

import java.util.Scanner;

public class XOPattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int i, j, n;
		System.out.println("Please enter a positive number: ");
		n=scan.nextInt();
		
		for (i=0; i<n; i++) {
			for (j=0; j<n; j++) {
				if (i==j || i+j==(n-1))
					System.out.print('X');
				else
					System.out.print('O');

			}
			System.out.println("");
		}
		
	}

}
