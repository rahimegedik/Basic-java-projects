package newProject;

import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) {
		
		Scanner scan  = new Scanner (System.in);
		
		System.out.println("Enter the hidden word: ");
		String word = scan.nextLine();
		
		int count = 5 ;
		int length = word.length();
		String hiddenWord = "" ;
		
		for (int i=0; i<length; i++)
			hiddenWord += '*';
		while (count>0) {
			
			System.out.println("guess a letter:");
			char guess = scan.next().charAt(0);
			int location = word.indexOf(guess);
			
			for (; location>=0; location=word.indexOf(guess, location+1)) 
				hiddenWord=hiddenWord.substring(0, location) + guess + hiddenWord.substring(location+1);
			System.out.println(hiddenWord +" number of guess left: " + count);
			count--;
			
			if (hiddenWord.equals(word)) {
				System.out.println("You win!");
			break; }
		}
			if (!hiddenWord.equals(word)) 
				System.out.println("You lost! ");
			
	}
		
}


