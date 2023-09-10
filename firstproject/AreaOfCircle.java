package firstproject;

import java.util.Scanner;

public class  AreaOfCircle{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter radius of a circle:");
		double radius = scan.nextDouble();
		double area = Math.PI*radius*radius;
		
		System.out.println("Area="+area);

	}

}
