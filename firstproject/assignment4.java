package firstproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class assignment4 {

	public static int calcpoint (String input) {
		input=input.toUpperCase();
		int sum = 0;
		for (int j = 0; j<input.length(); j++) {
			switch (input.charAt(j)) {
				case 'A':
					sum += 1;
					break;
				case 'B':
					sum += 2;
					break;
				case 'C':
					sum += 3;
					break;
				case 'Ç':
					sum += 4;
					break;
				case 'D':
					sum += 5;
					break;
				case 'E':
					sum += 6;
					break;
				case 'F':
					sum += 7;
					break;
				case 'G':
					sum += 8;
					break;
				case 'Ð':
					sum += 9;
					break;
				case 'H':
					sum += 10;
					break;
				case 'I':
					sum += 11;
					break;
				case 'Ý':
					sum += 12;
					break;
				case 'J':
					sum += 13;
					break;
				case 'K':
				    sum += 14;
					break;
				case 'L':
					sum += 15;
					break;
				case 'M':
					sum += 16;
					break;
				case 'N':
					sum += 17;
					break;
				case 'O':
					sum += 18;
					break;
				case 'Ö':
					sum += 19;
					break;
				case 'P':
					sum += 20;
					break;
				case 'R':
					sum += 21;
					break;
				case 'S':
					sum += 22;
					break;
				case 'Þ':
					sum += 23;
					break;
				case 'T':
					sum += 24;
					break;
				case 'U':
					sum += 25;
					break;
				case 'Ü':
					sum += 26;
					break;
				case 'V':
					sum += 27;
					break;
				case 'Y':
				    sum += 28;
					break;
				case 'Z':
					sum += 29;
					break;
					
					default:
						throw new IllegalArgumentException("Unexcepted value: " + j);
			}
		}
		
		return sum*input.length();
		
	}
	public static void main (String[] args) {
		File file = new File("C:\\Users\31313\\Desktop\\input.txt");
		try {
			Scanner scan = new Scanner (file);
			String data = scan.nextLine();
			String [] shuffledword = data.split(":");
			String [] possibleword = shuffledword[1].split(",");
			ArrayList<String>AOPW=new ArrayList<String>();
			for (int i = 0; i<possibleword.length; i++) {
				AOPW.add(possibleword[i]);
			}
			scan.close();
			System.out.println(shuffledword[0] + "guess a word with use these characters ");
			Scanner scan2 = new Scanner (System.in);
			int sum = 0;
			for (int logcounter = 0; logcounter<3; logcounter++) {
				String guess = scan2.next();
				guess = guess.toUpperCase();
				for (int k = 0; k<AOPW.size(); k++) {
					if (guess.equals(AOPW.get(k))) {
						sum += calcpoint(guess);
						System.out.println("correct");
						AOPW.set(k, "");
					}
				}
			}
			System.out.println("game over");
			System.out.println("total point" + sum);
			scan2.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
