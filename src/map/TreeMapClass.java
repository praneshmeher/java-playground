package map;

import java.util.Map;
import java.util.Map.Entry;

import utility.Employee;

import java.util.TreeMap;

public class TreeMapClass {

	public static void main(String[] args) {
		
		Map<Employee, String> map = new TreeMap<>();
		Employee e1 = new Employee(1,"Pranesh");
		Employee e2 = new Employee(2,"Ravindra");
		
		map.put(e2, "Barclays");
		map.put(e1, "Barclays");
		System.out.println(map);
	
	}
}
