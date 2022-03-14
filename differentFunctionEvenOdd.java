
public class differentFunctionEvenOdd {
	
	static boolean isMyNumberEven(int number) {
		if(number%2==0) {
			return true;
		}else {
			return false;
		}
	  	
	}
public static void main(String args[])
{
	
	boolean isNumberEven= isMyNumberEven(10);
	if(isNumberEven) {
		System.out.println("Even number");
		
	}
	else {
		System.out.println("Odd number");
	}
}
}

