
public class reverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getReverse(123456789);

	}
	
	static void getReverse(int num) {
		int revNum = 0;
		
		//123 -321
		while(num>0) {
		revNum= revNum*10 + num%10;  //0*10 + 123 %10 = 3 ,3*10+12%10= 30+2 =32 , 32*10 + 1%10 =320 +1 =321
		//System.out.println(revNum);
		num=num/10;   //123/10 =12 , 12/10= 1 , 1/10 = 0
		//System.out.println(num);
		}
		System.out.println(revNum);
	}

}
