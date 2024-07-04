package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import utility.Employee;

public class MapFunction {
	
	public static void main(String args[]) {
		
		List<Employee> list = new ArrayList<>();
		
		for(int i=10;i>0;i--) {
			list.add(new Employee(i,"Employee"+i));
		}
		System.out.println(list);
		
		List<Integer> listWithIds = list.stream().map(e->e.getId()).collect(Collectors.toList());
		System.out.println(listWithIds);

	}

}
