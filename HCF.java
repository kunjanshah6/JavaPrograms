
public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getHCF(105,5);

	}
	
	static void getHCF(int num1,int num2) {
		
		while(num1!=num2) {
			if(num1>num2) {
				num1=num1-num2;
			}
			else {
				num2=num2-num1;
			}
		}
		System.out.println(num1);
	}

}
