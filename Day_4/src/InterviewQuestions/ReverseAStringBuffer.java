package InterviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseAStringBuffer{
	/*
public void usingBuffer() {
String given = "Naveen";
StringBuffer buffer = new StringBuffer();
buffer.append(given);
System.out.println(buffer.reverse());
}

public void usinglogic() {
String given = "Naveen";
char [] characterArray = given.toCharArray();
String reversed = "";
for (int i = characterArray.length-1;i>=0;i--) {
	reversed = reversed + characterArray[i];
}
System.out.println(reversed);  
}*/

public void usingCollections() {
	String given = "Naveen";
	  char[]array = given.toCharArray();
	 List<Character> list = new ArrayList<Character>();
	  for(Character character : array) {
		  list.add(character);
	  }
	  Collections.reverse(list);
	  ListIterator iterator = list.listIterator();
	  while(iterator.hasNext()) {
	  System.out.println(iterator.next());
}
}
	public static void main(String[] args) {
		ReverseAStringBuffer aString = new ReverseAStringBuffer();
		aString.usingCollections();
}
}
