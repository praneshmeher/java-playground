package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import utility.Employee;

public class Sorted {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		
		for(int i=10;i>0;i--) {
			list.add(new Employee(i,"Employee"+i));
		}
		System.out.println(list);
		
		List<Employee> listWithIdSort = list.stream().sorted().collect(Collectors.toList());
		System.out.println(listWithIdSort);
		
		List<Employee> listWithOddId = list.stream().filter(e->(e.getId()%2)!=0).collect(Collectors.toList());
		System.out.println(listWithOddId);
		
		List<Integer> listWithIds = list.stream().map(e->e.getId()).collect(Collectors.toList());
		System.out.println(listWithIds);
		
		Optional<Integer> listWithIdAvg = list.stream().map(e->e.getId()).reduce((sum, id)->sum=sum+id);
		System.out.println(listWithIdAvg.get());
		
		List<Employee> listWithNameSort = list.stream().sorted(new Comparator<Employee>() {
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
		}).collect(Collectors.toList());
		System.out.println(listWithNameSort);

	}

}
