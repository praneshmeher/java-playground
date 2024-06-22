package set;

import java.util.LinkedHashSet;
import java.util.Set;

import utility.Employee;

public class LinkedHashSetClass {

	public static void main(String[] args) {
		
		Set<Employee> set = new LinkedHashSet<>();
		
		Employee e1 = new Employee(1,"Pranesh");
		Employee e2 = new Employee(2,"Ravindra");
		
		set.add(e2);
		set.add(e1);
		System.out.println(set);

	}

}
