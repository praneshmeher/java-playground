package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import utility.Employee;

public class Reduce {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		
		for(int i=10;i>0;i--) {
			list.add(new Employee(i,"Employee"+i));
		}
		System.out.println(list);
		
		int ans = list.stream().map(e->e.getId()).reduce(10,(sum, id)->sum=sum+id);
		System.out.println(ans);

	}

}
