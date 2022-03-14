
public class rerverseUsingForLoop {
	public static void main(String[] args) {
		getReverse(123);
		
	}
	static void getReverse(int num) {
		int revNum=0;
		
		for( ;num >0;) {
			revNum= revNum*10 + num%10;
			num=num/10;
			
			
		}
		System.out.println(revNum);
		
	}

}
//for -interval fixed then use for
// while - ketli var loop fervanai loop khbr nthi 