package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import utility.Employee;

public class Distinct {
	
public static void main(String args[]) {
		
		List<Employee> list = new ArrayList<>();
		
		for(int i=10;i>0;i--) {
			list.add(new Employee(i,"Employee"+i));
		}
		for(int i=0;i<10;i++) {
			list.add(new Employee(i,"Employee"+i));
		}
		System.out.println(list);
		
		List<Integer> listWithIds = list.stream().map(e->e.getId()).distinct().collect(Collectors.toList());
		System.out.println(listWithIds);
		
	}

}
