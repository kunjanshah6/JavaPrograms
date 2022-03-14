
public class findMaxMinFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,9,8,0};
		findMinMax(arr);

	}
	
	static void findMinMax(int arr[]) {
		int max=0;
		int min=0;
		for(int i=0;i<arr.length; i++) {
			
			if (arr[i]>max) {
				max=arr[i];
			}
			else if(arr[i]<min)
			{
				min=arr[i];
			}
			
		}
		System.out.println(max);
		System.out.println(min);
	}

}
