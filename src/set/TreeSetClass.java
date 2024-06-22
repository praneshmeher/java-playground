package set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import utility.Employee;

public class TreeSetClass {

	public static void main(String[] args) {
		Set<Employee> set = new TreeSet<>();
		
		Employee e1 = new Employee(1,"Pranesh");
		Employee e2 = new Employee(2,"Ravindra");
		
		set.add(e2);
		set.add(e1);
		System.out.println(set);

	}

}
