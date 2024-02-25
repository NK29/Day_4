package InterviewQuestions;

import java.util.Scanner;

public class PrintFloydTriangle {

	public static void main(String[] args) {
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number of lines:");
		int numberoflines = scanner.nextInt();
		int row=0,column=0;
		for(row=0;row<numberoflines;row++) { 
			for(column=0;column<=row;column++) {
				System.out.print("*");
			}
			System.out.println();
		}
     */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a row:");
		
		int startingNum=0;
		int limit;
		limit = scanner.nextInt();
		int row, column;
		
		for(row=0;row<limit;row++) { 
			for(column=0;column<=row;column++) {
				System.out.print(startingNum+"");
				startingNum=startingNum+1;
			}
			System.out.println();
		}
	}
}
