
public class ocuurencesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Nisshh";
		findCount(str);
		

	}
	
	static void findCount(String str) {
		int counter=0;
		
		for(int i=0; i<str.length(); i++) {
			if('s'==str.charAt(i)) {
				counter++;
			}
			
		}
		
		System.out.println(counter);
		
	
	}

}
