package InterviewQuestions;

public class SwapTwoNumbers {
	
	/*public void withThirdVariable(){
		int mySalary =20;
		int superiorSalary =50;
		System.out.println("Before swapping"+" Mine"+mySalary+",superiorsalary:"+superiorSalary);
		int temp  = mySalary;
		mySalary = superiorSalary;
		superiorSalary = temp;
		System.out.println("After swapping"+" Mine"+mySalary+",superiorsalary:"+superiorSalary);
	}*/

	public void withOutThirdVariable(){
		/*
		 * first=first-second, second=first+second, first=second-first(add and sub)
		 * first=first*secnd, second=first/second, first=first/second(multi and div)  provide non-zero values
		 */
		int first=20;
		int second=50;
		System.out.println("Before swapping"+" first:"+first+" Second:"+second);
		first=first*second;
		second=first/second;
		first=first/second;
		System.out.println("After swapping"+" first:"+first+" Second:"+second);
	}
	
	public static void main(String[] args) {
		SwapTwoNumbers numbers = new SwapTwoNumbers();
		numbers.withOutThirdVariable();
}
}