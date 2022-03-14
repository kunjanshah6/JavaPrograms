//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
//The sum of these multiples is 23.
//Find the sum of all the multiples of 3 or 5 below 1000.
package projectEuler;

public class problem1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getSum(1000);
	}
	
	static void getSum (int num) {
		int sum=0;
		
		for(int i=1;i<num;i++) {
			if(i%3==0 || i%5==0) {
				//System.out.println(i);
				
				sum=sum+i;
				
			}
			
		}
		System.out.println(sum);
	}

}
