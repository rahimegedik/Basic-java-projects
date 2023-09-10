package newProject;

import java.util.Scanner;

public class AvarageAnnualGrowth {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter your annual growth. when you done entering numbers, please enter '0' to end the process.");
		int count = 0;
		double total = 1;
		double average, annual;
		annual = scan.nextInt();
		
		while (annual != 0) {
			annual = ((double)(annual/100)+1);
			total=annual*total;
			count++;
			annual = scan.nextDouble();
		}
		if (annual==0) {
			average= (((double)Math.pow(total, 1.0/count)-1.0)*100.0);
			System.out.println("The average annual growth is= %" + average);
		}
		
	}

}
