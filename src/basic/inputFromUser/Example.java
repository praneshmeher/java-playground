package basic.inputFromUser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Example {
	
	public static void main(String args[]) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String name = reader.readLine();
		System.out.println(name);
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println("string: "+ s);
		int i = sc.nextInt();
		System.out.println("int "+ i);
		float f = sc.nextFloat();
		System.out.println("float " + f);
		
	}

}
