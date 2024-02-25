package InterviewQuestions;

public class ReplaceVowelsWithDollars {

	public static void main(String[] args) {
		String givenText="I miss raja";
		char []charArray = givenText.toCharArray();
		for (int i=0;i<givenText.length();i++) {
			if(givenText.charAt(i)=='A'||givenText.charAt(i)=='E'||givenText.charAt(i)=='I'||givenText.charAt(i)=='O'||givenText.charAt(i)=='U'||givenText.charAt(i)=='a'||givenText.charAt(i)=='e'||givenText.charAt(i)=='i'||givenText.charAt(i)=='o'||givenText.charAt(i)=='u')
			charArray[i]= '*';
		}
for (int i=0;i<givenText.length();i++)
	System.out.print(charArray[i]);
	}
		
	/* String replacedText = givenText.replaceAll("[AEIOUaeiou]", "*");
	 * String replacedText = givenText.replaceAll("[AEIOUaeiou]", "\\$");
		System.out.print(replacedText); 
	*/
}
