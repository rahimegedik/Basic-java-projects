package newProject;

import java.util.Scanner;

public class CalculatePositeveAndNegativeNumbers{

	public static void main(String[] args) {
		int p=0,n=0,z=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("please enter a number:");
		int number=scan.nextInt();
		for(int i=0;i<number;i++)
		{
		System.out.printf("please enter %d. number:",i+1);
		int a=scan.nextInt();
		if(a<0)
		n++;
		else if(a>0)
		p++;
		else
		z++;
		}
		System.out.printf("number of positives=%d\nnumber of negatives=%d\nnumber of zeros=%d",p,n,z);
	}

}
