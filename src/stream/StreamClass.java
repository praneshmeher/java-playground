package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import utility.Employee;

public class StreamClass {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		List<Employee> emplist = Arrays.asList(
				new Employee(1, "Pranesh"),
				new Employee(2, "Ravindra"),
				new Employee(3, "Akshay")
		);
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 10);
		map.put(2, 20);
		map.put(3, 30);
		map.put(4, 40);
		map.put(5, 50);
		
		
		List<Integer> sortedList = list.stream().sorted(new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return 0;
			}
		}).collect(Collectors.toList());
		System.out.println(sortedList);
		
		List<Employee> listWithIdSort = emplist.stream().sorted().collect(Collectors.toList());
		System.out.println(listWithIdSort);
		
		List<Integer> sorted = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sorted);
		
		List<Employee> listWithNameSort = emplist.stream().sorted((e1,e2)->e1.getName().compareTo(e2.getName())).collect(Collectors.toList());
		System.out.println(listWithNameSort);
		
		List<Employee> list1 = emplist.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
		System.out.println(list1);
		
		List<Employee> list2 = emplist.stream().sorted(Collections.reverseOrder(Comparator.comparing(Employee::getId))).collect(Collectors.toList());
		System.out.println(list2);
		
		Map<Integer, List<Employee>> list3 = emplist.stream().collect(Collectors.groupingBy(Employee::getId));
		System.out.println(list3);
		
		List<Integer> listWithIds = emplist.stream().map(e->e.getId()).collect(Collectors.toList());
		System.out.println(listWithIds);
		
		int ans = emplist.stream().map(e->e.getId()).reduce(10,(sum, id)->sum=sum+id);
		System.out.println(ans);
		
		List<Employee> listWithOddId = emplist.stream().filter(e->e.getId()%2==0).collect(Collectors.toList());
		System.out.println(listWithOddId);
		
		Employee emp = emplist.stream().filter(e->e.getId()==1).findFirst().get();
		System.out.println(emp);
		
		int maxId = emplist.stream().max((e1,e2)->e1.getId()-e2.getId()).get().getId();
		System.out.println(maxId);
		
		List<Entry<Integer, Integer>> list11 = map.entrySet().stream().sorted((v1,v2)->v2.getValue()-v1.getValue()).collect(Collectors.toList());
		System.out.println(list11);
		
		List<Integer> listWithIds1 = emplist.stream().map(e->e.getId()).distinct().collect(Collectors.toList());
		System.out.println(listWithIds1);
		
		List<Employee> emp1 = emplist.stream().distinct().collect(Collectors.toList());
		System.out.println(emp1);
		
		List<Integer> list4 = Stream.concat(list.stream(), list.stream()).collect(Collectors.toList());
		System.out.println(list4);
		
		Map<Integer, String> map1 = emplist.stream().collect(Collectors.toMap(e->e.getId(), e->e.getName()));
		System.out.println(map1);

	}

}
