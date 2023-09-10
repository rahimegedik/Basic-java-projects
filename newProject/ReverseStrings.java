package newProject;

import java.util.Scanner;

public class ReverseStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("reverse yapmak istediðin kelimeyi gir"); 
		Scanner girdi=new Scanner(System.in); 
		String kelime=girdi.next(); 
		String boþ=""; 
		for(int i =kelime.length()-1;i>=0;i--){ 
		boþ+=kelime.charAt(i); 
		} 
		System.out.println(boþ); 

	}

}
