package InterviewQuestions;

public class RemoveLeadingAndTrailingSpaces {

	public static void main(String[] args) {
		String input=" Naveen Kumar ";
		
		System.out.println(input.trim()); //both start and end space in words
		
		System.out.println(input.replaceAll("^[ \t]+[ \t]+$", "")); //both start and end space in words //regex
		System.out.println(input.replaceAll("^[ \t]", "")); //start space in words //regex
		System.out.println(input.replaceAll("[ \t]+$", "")); //end space in words //regex
		
		System.out.println(input.strip()); //both start and end space in words
		System.out.println(input.stripLeading()); //start space in words
		System.out.println(input.stripTrailing()); //end space in words
	}
}
