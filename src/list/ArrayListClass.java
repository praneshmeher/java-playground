package list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import utility.Employee;

public class ArrayListClass {
	
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		
		for(int i=1;i<10;i++) {
			list.add(new Employee(i,"Employee"+i));
		}
		System.out.println(list);	
	}

}
