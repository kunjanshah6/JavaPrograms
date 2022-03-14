import java.util.*;
public class reverseString {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		
		String original, reverse = "";
	    Scanner in = new Scanner(System.in);

	    System.out.println("Enter a string to reverse");
	    original = in.nextLine();

	    int length = original.length();

	    for (int i = length-1 ; i >= 0 ; i--)
	      reverse = reverse + original.charAt(i);

	    System.out.println("Reverse of the string: " + reverse);
	  }

	}
	
// The charAt method is used to get individual characters from the string, and we append them in reverse order.
//Unfortunately, there is no built-in method in the "String" class for string reversal, but it's quite easy to create one.


