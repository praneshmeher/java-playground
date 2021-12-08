package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		List<Integer> squares = numbers.stream().map(x->x*2).collect(Collectors.toList());
		System.out.println(squares);
		
		List<Integer> numbers1 = Arrays.asList(1,2,3,4,5,6);
		int ans = numbers1.stream().reduce(0,(sum,i)->sum+i);
		System.out.println(ans);
		
		List<String> names = Arrays.asList("Pranesh", "Ganesh");
		List<String> result = names.stream().filter(name->name.startsWith("P")).collect(Collectors.toList());
		System.out.println(result);
		
		List<String> names1 = Arrays.asList("Pranesh", "Ganesh");
		List<String> result1 = names1.stream().sorted().collect(Collectors.toList());
		System.out.println(result1);
		
		names1.stream().forEach(System.out::println);

	}

}
