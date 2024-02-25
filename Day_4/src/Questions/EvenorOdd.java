package Questions;
import java.util.Scanner;
public class EvenorOdd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter a number: ");
		int number = scanner.nextInt();
		if(number % 2 == 0) {
			System.out.print(number+ " is an even number.");
		}else {
			System.out.print(number+ " is an odd number.");
		}
		scanner.close();
	}

}
