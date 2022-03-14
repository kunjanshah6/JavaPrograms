
public class checkPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palindrome(1221);

	}
	
	static void palindrome(int num) {
		int reverseNumber=0;
		int originalNumber= num;

		while(num!=0) {
			reverseNumber= reverseNumber*10 + num%10;
			num=num/10;
			
		}
		//System.out.println(reverseNumber);
		if(originalNumber == reverseNumber) {
			System.out.println("palindrome " );
		}
		else {
			System.out.println("not a palindrome "  );
		}
	}

}

