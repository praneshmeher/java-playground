package playground;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import design.Builder;
import utility.Employee;

public class Playground   {
		
	public static void main(String args[]) {
		
//		String s1="s1";
//		String s2="s2";
//		s1.concat(s2);
//		System.out.println(s1);
		
//		Consumer c = (s)->System.out.println(s);
//		c.accept("Hello");
		
//		Supplier<String> s = ()->"Hello World";
//		System.out.println(s.get());
		
//		Predicate p = (s)->s=="Hello";
//		System.out.println(p.test("World"));
		
//		Function f = (i)->(int)i+5;
//		System.out.println(f.apply(5));
		
//		String str="Knowledge";
//		String s=str;
//		str=str.concat(" Base");
//		System.out.println(str);
		
//		String s = "Pranesh";
//		System.out.println(s.substring(0, s.length()-1));
		
//		String s = "Pranesh";
//		long ch = s.chars().filter(c->c=='P').count();
//		System.out.println(ch);
		
//		int arr[] = {1,2,3,5};
//		int arr1[] = Arrays.copyOf(arr, arr.length);
//		System.out.println(arr1[0]);
		
//		List<Integer> list = Arrays.asList(1,2,3,4);
//		System.out.println(list);
		
		TimerTask task = new TimerTask() {
	        public void run() {
	            System.out.println("Task performed on: " + new Date() + "n" +
	              "Thread's name: " + Thread.currentThread().getName());
	        }
	    };
	    Timer timer = new Timer("Timer");
	    
	    long delay = 1000L;
	    timer.schedule(task, delay);
		
	}
	
}

