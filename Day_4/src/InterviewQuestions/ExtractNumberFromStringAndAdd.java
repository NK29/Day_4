package InterviewQuestions;

public class ExtractNumberFromStringAndAdd {

	public static void main(String[] args) {
		String input="Naveenkumar29";
		int total=0;
		int length=input.length();
		for(int i=0;i<length;i++) {
			char character=input.charAt(i);	
			if(Character.isDigit(character)) {
				total=total+Character.getNumericValue(character);
			}
		}
System.out.println(total);
	}
}
