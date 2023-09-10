package newProject;

import java.util.Scanner;

public class FindGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter your exam score: ");
		int score = scan.nextInt();
		
		if (score>100)
			System.out.println("Score should be between 0-100");
		else if (score>=90)
			System.out.println("Your grade is: A");
		else if (score>=70)
			System.out.println("Your grade is: B");
		else if (score>=60)
			System.out.println("Your grade is: C");
		else if (score>=40)
			System.out.println("Your grade is: D");
		else if (score<40)
			System.out.println("Your grade is: F");
		}

}
