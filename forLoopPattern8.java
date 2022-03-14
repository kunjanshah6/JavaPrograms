
public class forLoopPattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=4;
		for(int i=1;i<=num;i++) {
			//for space
			for(int j=num;j>i;j--) { 
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k);
				}
				
			System.out.println("");
			
		}

	}

}
