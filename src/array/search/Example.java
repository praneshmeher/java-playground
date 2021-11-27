package array.search;

import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8};
		
		for(int ele:arr) {
			if(ele==3) {
				System.out.println(ele);
			}
		}
		
		Arrays.sort(arr);
		int res = Arrays.binarySearch(arr, 60);
		System.out.println(res);
		
		Integer arr1[] = {1,2,3,4,5,6,7,8};
		boolean ans = Arrays.asList(arr1).contains(7);
		System.out.println(ans);
		
		boolean test = Arrays.stream(arr).anyMatch(e->e==5);
		System.out.println(test);
	}

}
