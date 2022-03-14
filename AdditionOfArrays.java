
public class AdditionOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1 = {1,2,3,4};
		int[] array2 = {1,2,3,4};

		int[] result=additionArray(array1,array2);

		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}

	}

	static int[] additionArray(int[] array1, int[] array2) {
		int[] result=new int[array1.length];

		if (array1.length!=array2.length) {
			System.out.print("Array length mismatch!");
		}
		else {

			for(int i=0;i<result.length;i++) {
				result[i]=array1[i]+array2[i];
				//System.out.print(result[i]+" ");

			}

		}
		return result;

	}

}

