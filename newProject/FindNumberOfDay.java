package newProject;

import java.util.Scanner;

public class FindNumberOfDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the number of the day:");
		int day = scan.nextInt();
		
		if  (day==1)
			System.out.println("Monday");
		else if (day==2)
			System.out.println("Tuesday");
		else if (day==3)
			System.out.println("Wednesday");
		else if (day==4)
			System.out.println("Tuesday");
		else if (day==5)
			System.out.println("Friday");
		else if (day==6)
			System.out.println("Saturday");
		else if (day==7)
			System.out.println("Sunday");
		else if (day>7)
			System.out.println("Invalid day");
		
		}

}
