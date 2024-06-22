package string;

import java.util.HashMap;
import java.util.Map;

public class WordCount {

	public static void main(String[] args) {
		String s = "My name is Pranesh My father's name is Subhash My suname is Meher";
		String[] words = s.split(" ");
		Map<String, Integer> map = new HashMap<>();
		
		for(String w:words) {
			if(map.containsKey(w)) {
				map.put(w, map.get(w)+1);
			}else {
				map.put(w, 1);
			}
		}
		System.out.println(map);
	}
}
