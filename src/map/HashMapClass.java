package map;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;

import utility.Employee;

public class HashMapClass {
	
	public static void main(String[] args) {
		
		Map<Employee, String> map = new HashMap<>();
		Employee e1 = new Employee(1,"Pranesh");
		
		map.put(e1, "Barclays");
		System.out.println(map.get(e1));
		
		e1.setName("Ganesh");
		System.out.println(map.get(e1));
		
	}

}
