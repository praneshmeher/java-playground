package stream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class EntrySet {
	
	public static void main(String args[]) {
		
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 10);
		map.put(2, 20);
		map.put(3, 30);
		map.put(4, 40);
		map.put(5, 50);
		List<Entry<Integer, Integer>> list = map.entrySet().stream().sorted((v1,v2)->v2.getValue()-v1.getValue()).collect(Collectors.toList());
		System.out.println(list);
		
		for(int i=0; i<3;i++) {
			System.out.println(list.get(i).getKey());
		}
	}

}
