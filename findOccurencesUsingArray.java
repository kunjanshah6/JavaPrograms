
public class findOccurencesUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,0,2,0,3,0};
		countZeroes(arr);
		

	}
	
	static void countZeroes(int arr[]) {
		int counter=0;
		for(int i=0; i<arr.length ;i++) {
			//System.out.println(arr[i]);
			if(arr[i]==0) {
				counter++;
			}
			
		}
		System.out.println("number of zeroes are " + counter);
		

	}

}
