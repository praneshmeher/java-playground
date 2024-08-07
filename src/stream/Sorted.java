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
		
		List<Employee> listWithNameSort = list.stream().sorted((e1,e2)->e1.getName().compareTo(e2.getName())).collect(Collectors.toList());
		System.out.println(listWithNameSort);
		
	}

}
