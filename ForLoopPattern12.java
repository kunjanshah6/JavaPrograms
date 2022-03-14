
public class ForLoopPattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		for(int i=1;i<=num;i++) {
			for(int j=num;j>i;j--) {
				System.out.print("  ");
			}
			for(int k=1; k<i;k++) {
				System.out.print(k + " ");
			}
			
			for(int k=i; k>=1 ;k--) {
				System.out.print(k + " ");
			}
			
			System.out.println("");
		}

	}

}
