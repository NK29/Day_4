package InterviewQuestions;

public class largestNumberInArray {

	int givenArray []= {2,1,3,5,4};
	
	public void findlargest() {
		
		int largest=Integer.MIN_VALUE;
		for(int i=0;i<givenArray.length;i++) {
			if(givenArray[i]>largest) {
				largest=givenArray[i];
			}
		}
		System.out.println("largest number is:"+largest);
	}
	
	public static void main(String[] args) {
		largestNumberInArray array = new largestNumberInArray();
		array.findlargest();
	}
}
