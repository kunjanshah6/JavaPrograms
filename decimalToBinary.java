
public class decimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getBinary(10);

	}
	
	static void getBinary(int num) {
		
		 int[] binaryNum = new int[1000];
		   
	        // counter for binary array
	        int i = 0;
	        while (num > 0) 
	        {
	            // storing remainder in binary array
	            binaryNum[i] = num % 2;
	            num = num / 2;
	            i++;
	        }
	   
	        // printing binary array in reverse order
	        for (int j = i - 1; j >= 0; j--)
	            System.out.print(binaryNum[j]);
	}

}
