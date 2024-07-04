package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted1 {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		
		List<Integer> sortedList = list.stream().sorted(new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return 0;
			}
		}).collect(Collectors.toList());
		
		System.out.println(sortedList);
	}

}
