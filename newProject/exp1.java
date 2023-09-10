package newProject;

import java.util.Scanner;

public class exp1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter x value for e^x: ");
		int x = scan.nextInt();
		double ans = 1;
		double temp = 1;
		 
		for (int i=1; i>0; i++) {
			temp=(temp*x)/i;
			ans = ans+temp;
			
		}
		System.out.println(ans);

	}

}
