package InterviewQuestions;

import java.util.Scanner;

public class FindMyPosition {

	public static void main(String[] args) {
		// To find position of the given English alphabet
		// ASCII 97->a,65->A
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Ener a character:");
		char givenChar=scanner.next().charAt(0);
		givenChar=Character.toLowerCase(givenChar);//givenChar=Charater.toUpperCase(givenChar);
		
		int asciiValue=(int)givenChar;
		System.out.println(asciiValue);
		
		int position=asciiValue-96;//int position=asciiValue-64;
		System.out.println(position);
	}
}
