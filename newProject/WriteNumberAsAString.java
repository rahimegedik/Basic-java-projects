package newProject;

import java.util.*;

public class WriteNumberAsAString {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the number (3-digit number): ");
		int num = scan.nextInt();
		
		if (num<100 || num>999 )
			System.out.println("Wrong input");
		else
		{ 
			int digit1=num%10;
			num = num/10;
			int digit2=num%10;
			num = num/10;
			int digit3=num%10;
			
			
		switch (digit3)
		{
		case 1: System.out.print("y�z ");break;
		case 2: System.out.print("iki y�z "); break;
		case 3: System.out.print("�� y�z "); break;
		case 4: System.out.print("d�rt y�z "); break;
		case 5: System.out.print("be� y�z "); break;
		case 6: System.out.print("alt� y�z "); break;
		case 7: System.out.print("yedi y�z "); break;
		case 8: System.out.print("sekiz y�z "); break;
		case 9: System.out.print("dokuz y�z"); break;
		}
		switch (digit2)
		{
		case 1: System.out.print("on ");break;
		case 2: System.out.print("yirmi "); break;
		case 3: System.out.print("otuz "); break;
		case 4: System.out.print("k�rk "); break;
		case 5: System.out.print("elli "); break;
		case 6: System.out.print("altm�� "); break;
		case 7: System.out.print("yetmi� "); break;
		case 8: System.out.print("seksen "); break;
		case 9: System.out.print("doksan "); break;
		case 0: System.out.print(" "); break;
		}
		switch (digit1)
		{
		case 1: System.out.print("bir ");break;
		case 2: System.out.print("iki "); break;
		case 3: System.out.print("�� "); break;
		case 4: System.out.print("d�rt "); break;
		case 5: System.out.print("be� "); break;
		case 6: System.out.print("alt� "); break;
		case 7: System.out.print("yedi "); break;
		case 8: System.out.print("sekiz "); break;
		case 9: System.out.print("dokuz "); break;
		case 0: System.out.print(""); break;
		}
		
		}

	}

}
