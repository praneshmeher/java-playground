package methods.forEach;

import java.util.Hashtable;
import java.util.Map;

public class Example {

	public static void main(String[] args) {
		Map<String, Integer> table = new Hashtable<String, Integer>();
		
		table.put("Pen", 10);
		table.put("Book", 20);
		table.put("Mobile", 30);
//		table.put("Clothes", null);
//		table.put(null, 40);
		
		table.forEach((k, v)->{
			System.out.println(k+" "+v);
		});
		

	}

}
