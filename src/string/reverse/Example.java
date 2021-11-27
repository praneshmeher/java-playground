package string.reverse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Example {

	public static void main(String[] args) {
		
		String str="Geeksforgeeks", ans="";
		
//		for(int i=0;i<str.length();i++)
//			ans=str.charAt(i)+ans;
//		System.out.println(ans);
		
		
//		StringBuilder str1 = new StringBuilder(str);
//		str1.reverse();
//		System.out.println(str1);

		
		
//		StringBuffer str1 = new StringBuffer(str);
//		str1.reverse();
//		System.out.println(str1);
		
		
//		char ch[] = str.toCharArray();
//		for(int i=ch.length-1; i>=0;i--)
//			System.out.print(ch[i]);
		
		
		
//		char strArray[]=str.toCharArray();
//		int start=0, end=str.length()-1;
//		while(start<end) {
//			char temp = strArray[start];
//			strArray[start]=strArray[end];
//			strArray[end]=temp;
//			start++;
//			end--;
//		}
//		System.out.println(strArray);
		
		
		
		List<Character> list = new ArrayList<Character>();
		for(char ch:str.toCharArray())
			list.add(ch);
		Collections.reverse(list);
		for(Character ch:list)
			System.out.print(ch);
		ListIterator li = list.listIterator();
		while(li.hasNext())
			System.out.print(li.next());
	}

}
