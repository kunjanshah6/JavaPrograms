
public class DataTypes {
	public static void main(String args[])
	{
		//float to int conversion
		int value = (int) 3.15f;
		System.out.println(value);
		
		//int to float
		int i=33;
		float f;
		f=i;
		System.out.println(f);
		
		//double to int
		int v1 = (int) 44.555555d;
		System.out.println(v1);
		
		//long to int
		int value2 = (int) 1234567L;
		System.out.println(value2);
		
		int value3 = (int) -12L;
		System.out.println(value3);
		
		Long x = 1234567890L;
		int y = x.intValue();
		System.out.println(y);
	}

}
