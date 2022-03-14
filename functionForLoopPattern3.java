
public class functionForLoopPattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getSum(3);
		getSum(10);
		getSum(45);

	}
	
	static void getSum(int num) {
		
		int sum=0;
		for(int i=1; i<=num ;i++) //num times loop farse
		{
			sum=sum+i;
			
		}
		System.out.println("the sum is: " + sum);

	}

}
