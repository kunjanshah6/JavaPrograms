
public class AppendAllZeroesToEndInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,0,4,0,6,0};
		
		//check every element in array whether zero or not
		//delete zero
		//when delete zero ,count number of zeros
		//add zeros to the original array
		for(int i=0;i<array.length;i++) {
			if(array[i]==0) {
				array = deleteZero(array,i); 
			}
		}
		for(int i=0;i<array.length;i++) {
		System.out.println(array[i]);
		}

	}
	
	static int[] deleteZero(int[] array,int index) {
		//make new array with size-1
		//insert all element in new array except index element
		//return newarray
		int newArrayIndex=0;
		int[] newArray=new int[array.length-1];
		for(int i=0;i<array.length;i++) {
			if(i==index) {
				continue;
			}
			else {
				newArray[newArrayIndex]=array[i];
				newArrayIndex++;
			}
				
		}
		return newArray;
	}
	
	

}
