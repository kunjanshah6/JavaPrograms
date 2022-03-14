
public class SimpleInterest {
	public static void main(String args[])
	{
		long principleAmount; int noOfYears;
		float rate;
		double simpleInterest;
		principleAmount=1600000L;
		noOfYears=2;
		rate= 1.2f;
		simpleInterest=(principleAmount*rate*noOfYears)/100;
		
		System.out.println("Simple interest is :" +simpleInterest);
		
	}
	

}



/*nana ne mota ma nakhi sake
mota ne nani ma bucket ma na nakhi sake

int(nanu) ,long (motu)decimal 
float(nanu),double(motu) fraction,decimal

type conversion 
string to int - no
cannot convert directly

int to string - can do by function
java automatically converts backend ma */