
public class ConditionsIfElse {
	public static void main(String args[])
	{
		long principleAmount=1600000L; int noOfYears=2;
		float rate=1.2f;
		double simpleInterest;
		
		//calculating Simple Interest
		simpleInterest=(principleAmount*rate*noOfYears)/100;
		
		//checking conditions
		if(simpleInterest>5000)
		{
			System.out.println("Continue FD");
		}
		else {
			System.out.println("withdraw Money");
		}
	}

}



