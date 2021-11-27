package string.removeZero;

public class Example {

	public static void main(String[] args) {
		String str = "000012345000";
		String str1="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!='0')
				str1=str1+str.charAt(i);
		}
		System.out.println(str1);
	}

}
