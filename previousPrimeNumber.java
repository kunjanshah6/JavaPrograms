
public class previousPrimeNumber {
	public static void main(String[] args) {
		printAllPrimeNumbers(9);
		
	}
	static boolean isNumberPrime(int num) {
		boolean isPrime= true;
		
		
		for(int i =2; i<=num-1; i++) 
		{
			if(num%i == 0)
			{
				isPrime = false;
				break;
			}
		}
		
		
		return isPrime;
	}
	static void printAllPrimeNumbers(int num) {
		for(int i=2 ; i<=num;i++) {
			if(isNumberPrime(i)) {
				System.out.println(i);
			}
			
		}
	}

}
