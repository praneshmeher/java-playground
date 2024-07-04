package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import utility.Employee;

public class Filter {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		
		for(int i=10;i>0;i--) {
			list.add(new Employee(i,"Employee"+i));
		}
		System.out.println(list);
		
		List<Employee> listWithOddId = list.stream().filter(e->e.getId()%2==0).collect(Collectors.toList());
		System.out.println(listWithOddId);
		
		Employee emp = list.stream().filter(e->e.getId()==10).findFirst().get();
		System.out.println(emp);
		
	}

}
