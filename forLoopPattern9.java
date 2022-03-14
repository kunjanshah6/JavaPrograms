
public class forLoopPattern9 {
	public static void main(String[] args) {
		
		int num=4;
		for(int i=1;i<=num;i++) {
			
			for(int j=num;j>i;j--) {
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			
			for(int l=1; l<i;l++) {
				System.out.print("*");
			}
			
			System.out.println("");
		}
		
		
	}

}
