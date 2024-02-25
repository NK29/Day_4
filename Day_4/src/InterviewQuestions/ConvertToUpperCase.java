package InterviewQuestions;

public class ConvertToUpperCase {

    public static void main(String[] args) {
        String input = "hello, i am naveen kumar";
        char[] charArray = input.toCharArray();

        for (int i = 0; i < input.length(); i++) {
            if (charArray[i] >= 97 && charArray[i] <= 122) {
                charArray[i] = (char) (charArray[i] - 32);
            }
        }

        for (int i = 0; i < input.length(); i++) {
            System.out.print(charArray[i]);
        }
    }
}

