package string.replaceChar;

public class Example {

	public static void main(String[] args) {
		String str = "Geeksforgeeks";
		
		str = str.substring(0, 3) + "F" +str.substring(3+1);
		System.out.println(str);
		
		StringBuilder str1 = new StringBuilder(str);
		str1.setCharAt(3, 'P');
		System.out.println(str1);
		
		StringBuffer str2 = new StringBuffer(str);
		str2.setCharAt(3, 'M');
		System.out.println(str2);
	}

}
