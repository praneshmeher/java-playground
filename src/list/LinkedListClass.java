package list;


import java.util.LinkedList;
import java.util.List;

import utility.Employee;

public class LinkedListClass {

	public static void main(String[] args) {
		
		List<Employee> list = new LinkedList<>();
		
		for(int i=1;i<10;i++) {
			list.add(new Employee(i,"Employee"+i));
		}
		System.out.println(list);
	}

}
