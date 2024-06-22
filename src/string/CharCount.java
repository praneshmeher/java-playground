package string;

import java.util.HashMap;
import java.util.Map;

public class CharCount {
	
	public static void main(String args[]) {
		String s = "Geeksforgeeks";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0;i<s.length();i++) {
			if(map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}else {
				map.put(s.charAt(i), 1);
			}
		}
		System.out.println(map);
	}
}
