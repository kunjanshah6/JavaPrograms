
public class switchCase {
		public static void main(String args[])
		{
			printNum(-1);
			
		
	}
		public static void printNum(int number) {
			
		
		switch(number)
		{
		
		case -1:
			System.out.print("number is negative");
			break;
		case 2:
			System.out.print("number is positive");
			break;
		default:
			System.out.print("number is zero");
			break;
		}
		}

}