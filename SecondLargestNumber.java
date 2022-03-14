
public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {3,2,5,6,1};
		int max=array[0];
		int secondMax=array[1];
		for(int i=1;i<array.length;i++) {
			if(array[i]>max) {
				secondMax=max;  
				max=array[i];
			}
			else if(secondMax < array[i]){
				secondMax= array[i];
			}
		}
		System.out.println(max);
		System.out.println(secondMax);

	}

}
