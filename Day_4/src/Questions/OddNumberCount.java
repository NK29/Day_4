package Questions;
public class OddNumberCount {
	public static void main(String[] args) {
		int oddCount = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
            	oddCount++;
            }
        }
        System.out.println("Count of odd numbers from 1 to 100: " + oddCount);
    }
}
