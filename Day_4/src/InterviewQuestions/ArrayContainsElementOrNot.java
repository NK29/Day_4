package InterviewQuestions;

import java.util.stream.IntStream;

public class ArrayContainsElementOrNot {

	int []array = {1,2,3,4,5};
	int numberToFind=3;
	boolean found = false;
	
	/*public void presentOrNot() {
		for (int number : array) {
			if (number==numberToFind) {
				found=true;
				break;
			}
		}
		
			if (found) {
				System.out.println("number present");
			}else {
				System.out.println("number not present");
			}
		}*/

	//Using InStrem
	
	public void usingInStream() {
		
		boolean found = IntStream.of(array).anyMatch(element->element==numberToFind);
		
		if (found) {
			System.out.println("number present");
		}else {
			System.out.println("number not present");
		}
	}
	
	public static void main(String[] args) {
		
		ArrayContainsElementOrNot arrayContainsElementOrNot = new ArrayContainsElementOrNot();
		//arrayContainsElementOrNot.presentOrNot();
		arrayContainsElementOrNot.usingInStream();
	}
}
