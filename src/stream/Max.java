package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import utility.Employee;

public class Max {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		
		for(int i=10;i>0;i--) {
			list.add(new Employee(i,"Employee"+i));
		}
		System.out.println(list);
		
		int maxId = list.stream().max((e1,e2)->e1.getId()-e2.getId()).get().getId();
		System.out.println(maxId);
		
	}

}
