package array.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Student{
	
	int no;
	String name;
	
	public Student(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	
}

public class Example {
	
	public static void main(String[] args) {
		
		int arr[] = {5,2,6,7,1,4,3,9,8};
		
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		
//		Arrays.sort(arr,1,5);
//		System.out.println(Arrays.toString(arr));
		
//		Integer arr1[] = {5,2,6,7,1,4,3,9,8};
//		Arrays.sort(arr1, Collections.reverseOrder());
//		System.out.println(Arrays.toString(arr1));
		
//		String str[] = { "practice.geeksforgeeks.org",
//                "quiz.geeksforgeeks.org",
//                "code.geeksforgeeks.org" };
//		Arrays.sort(str);
//		System.out.println(Arrays.toString(str));
//		Arrays.sort(str, Collections.reverseOrder());
//		System.out.println(Arrays.toString(str));
		
		Student std[] = { 
				new Student(2, "Pranesh"),
				new Student(1, "Ganesh"),
				new Student(3, "Alok")
		};
		Arrays.sort(std, new Comparator<Student>() {
			public int compare(Student o1, Student o2) {
				return o1.no - o2.no;
			}
		});
		for(Student s:std) {
			System.out.println(s.name);
		}
	}

}
