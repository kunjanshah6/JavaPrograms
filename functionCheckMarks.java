
public class functionCheckMarks {
	static void checkMarks(int marks) {
		if(marks>=80)
		{
			System.out.println("Excellent!! Passed with A grade");
		}
		else if(marks>=60 && marks<80)
		{
			System.out.println("Well done!!! Passed with B grade");
		}
		else if(marks>=40 && marks<60)
		{
			System.out.println("Good!! Passed with C grade");
		}
		else
		{
			System.out.println("Try hard next time!! Passed with D grade");
		}
	}
 
	public static void main(String args[])
	{
		checkMarks(50);
	}
}
