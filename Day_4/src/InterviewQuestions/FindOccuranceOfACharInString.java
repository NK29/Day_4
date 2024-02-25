package InterviewQuestions;

public class FindOccuranceOfACharInString {

	public static void main(String[] args) {
		/*//Using iteration
		String input = "NaveenKumar";
		char toFind = 'a';
		int occurence=0;
		
		input=input.toLowerCase();
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)==toFind) {
				occurence=occurence+1;
			}
		}
System.out.println(toFind + " is present " + occurence + " number of times");
*/
	// without iteration
	
	String input = "NaveenKumar";
	char toFind = 'a';
	
	input=input.toUpperCase();
	String chartoFind = Character.toString(toFind).toUpperCase();
	
	int actualLength = input.length();
	System.out.println(actualLength);
	
	input=input.replace(chartoFind,"");
	
	int lengthAfterReplacing = input.length();
	System.out.println(lengthAfterReplacing);
	
	System.out.println(actualLength-lengthAfterReplacing);

	}
}

	