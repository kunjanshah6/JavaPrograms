
public class forLoopPattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=4;
		for(int i=1; i<=num; i++)//for row 
			{
			for(int j=num;j>=i ;j--) //for col
				{
				System.out.print("* ");
			}
			System.out.println("");
		}

	}

}
