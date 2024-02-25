package InterviewQuestions;

public class CountTheVowelsInYourName {

	public static void main(String[] args) {
		String input = "Naveenkumar";
		int vowelsCount=0;
		input=input.toLowerCase();
		int length=input.length();
		for(int i=0;i<length;i++) {
			if(input.charAt(i)=='a'||input.charAt(i)=='i'||input.charAt(i)=='e'||input.charAt(i)=='o'||input.charAt(i)=='u') {
				vowelsCount++;
			}
		}
		System.out.println(" your name has " + vowelsCount + " vowel(s) ");
	}
}
