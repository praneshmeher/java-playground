package string;

public class ExtractNumber {
	
	public static void main(String[] args) {
		String str = "$1^9#9*4&";
		
		String result = str.replaceAll("[^0-9]", "");
		System.out.println(result);
		
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				System.out.print(str.charAt(i));
			}
		}
	}

}
