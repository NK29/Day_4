package Questions;
public class EvenNumberCount {
	public static void main(String[] args) {
        int evenCount = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Count of even numbers from 1 to 100: " + evenCount);
    }
}
