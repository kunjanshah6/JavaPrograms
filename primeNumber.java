
public class primeNumber {
	public static void main(String[] args) {
		checkPrime(3);
		checkPrime(4);
		checkPrime(37);
		checkPrime(9);
		
	}
	static void checkPrime(int num) {
		boolean isPrime= true;
		int i;
		for(i =2; i<=num-1; i++) 
		{
			if(num%i == 0)
			{
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			System.out.println(num + " prime" );
		}
		else {
			System.out.println(num + " not prime" );
		}
	}

}
//i<num and i<=num-1 same . my mistake i wrote i<num-1 2 thi start nd <num-1 so e loop j nai fare for num=3