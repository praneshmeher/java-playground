package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Nexon");
		list.add("Ferrari");
		list.add("Toyota");
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
	}

}
