package string.getCharacter;

public class Example {

	public static void main(String[] args) {
		
		String str = "Geeksforgeeks";
		
		System.out.println(str.charAt(3));
		System.out.println(str.toCharArray()[3]);
		System.out.println(str.chars().mapToObj(ch->(char)ch).toArray(Character[]::new)[3]);
		System.out.println((char)str.codePointAt(3));

	}

}
