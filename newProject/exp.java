package newProject;

import java.util.Scanner;

public class exp {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("enter x value: ");
		int x = scan.nextInt();
		int count = 0;
		int sum = 0;
		int fact = 1;
		
		while (count>=1) {
			fact=fact*count;
			
			count--;
			
		}
		
		for (count=0; count>=0; count++) {
			int values = x^(count/fact);
		    sum= sum*values;
		}
		
		System.out.println(sum);
		
	}

}
