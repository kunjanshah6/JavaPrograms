
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2};   
		int[] arr1= arr;
		for(int i=0;i<arr1.length;i++) {   
			System.out.print(arr1[i]);
		}
		System.out.println(" ");
		
		 
		arr=twoDigitPossibilities(arr); 
		
		for (int i = 0; i < arr.length; i++) 
			System.out.print(arr[i]);  

	}
	
	static int[] twoDigitPossibilities(int[] arr) {
		
		for(int i=0;i<=arr.length;i++ ) {
			int temp= arr[0];
			arr[0]=arr[1];
			arr[1]=temp;
			
		}
		return arr;
	}

}
