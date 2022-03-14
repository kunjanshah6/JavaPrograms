package hackerrank;

public class hackerRankIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		result(26);

	}
	
	static void result(int num) {
		
		if(num%2 == 0) {
			if(num>=2 && num<=5) {
				System.out.println(num + "not weird");
			}else if (num>=6 && num<=20) {
			System.out.println(num + " weird");
			}else if(num>=21) {
				System.out.println(num + "not weird");
			}
		}
		else {
			System.out.println(num + " weird");
			
		}
		
	}

}
