package array.max;

import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8};
		
		int max= arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i])
				max=arr[i];
		}
		System.out.println(max);
		
		int max1= Arrays.stream(arr).max().getAsInt();
		System.out.println(max1);
		
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]);
		
		
	}

}
