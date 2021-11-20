package duplicateFromList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
	
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,4));
		List<Integer> unique = new ArrayList<Integer>(new HashSet<Integer>(list));
		System.out.println(unique);
		
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,2,3,2,4,5));
		List<Integer> unique1 = new ArrayList<Integer>(new LinkedHashSet<Integer>(list1));
		System.out.println(unique1);
		
		List<Integer> list3 = new ArrayList<Integer>(Arrays.asList(1,2,3,2,4,5,3));
		List<Integer> unique3 = list3.stream()
				.distinct()
				.collect(Collectors.toList());
		System.out.println(unique3);
		
	}

}
