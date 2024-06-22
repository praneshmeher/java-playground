package map;

import java.util.LinkedHashMap;
import java.util.Map;

import utility.Employee;

public class LinkedHashMapClass {
	
	public static void main(String[] args) {
		
		Map<Employee, String> map = new LinkedHashMap<>();
		Employee e1 = new Employee(1,"Pranesh");
		Employee e2 = new Employee(2,"Ravindra");
		
		map.put(e2, "Barclays");
		map.put(e1, "Barclays");
		System.out.println(map);
		
		
	}

}
