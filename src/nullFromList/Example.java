package nullFromList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Example {
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(null,1,null));
		while(list.remove(null));
		System.out.println(list);
		
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(null,1,null));
		list1.removeAll(Collections.singleton(null));
		System.out.println(list1);
		
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(null,1,null));
		List<Integer> list2null = list2.stream()
				.filter(Objects::nonNull)
				.collect(Collectors.toList());
		System.out.println(list2null);
		
		List<Integer> list3 = new ArrayList<Integer>(Arrays.asList(null,1,null));
		List<Integer> list3null = list3.parallelStream()
				.filter(Objects::nonNull)
				.collect(Collectors.toList());
		System.out.println(list3null);
		
		List<Integer> list4 = new ArrayList<Integer>(Arrays.asList(null,1,null));
		list4.removeIf(Objects::isNull);
		System.out.println(list4);
	}

}
