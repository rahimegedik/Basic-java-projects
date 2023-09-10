package newProject;

import java.util.Scanner;

public class Fibonacci1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		
		 double i = 1, firstTerm1 = 0, secondTerm1 = 1;
		 System.out.println("Fibonacci Series till " + num + " terms:");
		 
		 while (i <= num) {
			 System.out.print(firstTerm1 + ", ");
			 
			 double nextTerm = firstTerm1 + secondTerm1;
	         firstTerm1 = secondTerm1;
	         secondTerm1 = nextTerm;
	         
	         i++;

		 }

	}

}
