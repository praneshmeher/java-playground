package string;

public class AsciiValue {

	public static void main(String[] args) {
		
		String str = "az$1^9#9*4&";
		
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i) + " " + Integer.valueOf(str.charAt(i)));
		}
	
	}

}
