
public class forLoopPattern2 {

	public static void main(String[] args) {
		int n=3;
		// i loop 1 var farse toh j loop n stars print karse so enter after 1 line print 
		
		for(int i = 1; i<=n ;i++) {
			for(int j=1; j<=n; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
