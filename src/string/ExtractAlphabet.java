package string;

public class ExtractAlphabet {

	public static void main(String[] args) {
		
		String str = "jhVG%&R%^$$&*&*544E%$EYF&T";

		String result = str.replaceAll("[^A-Za-z]", "");
		System.out.println(result);
		
		for(int i=0; i<str.length(); i++) {
			if(Character.isAlphabetic(str.charAt(i))) {
				System.out.print(str.charAt(i));
			}
		}
	}

}
