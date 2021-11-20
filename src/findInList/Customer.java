package findInList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Customer {
	
	private int id;
	private String name;
	
	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	public static void main(String args[]) {
		List<Customer> list = new ArrayList<Customer>();
		list.add(new Customer(1, "Jack"));
		list.add(new Customer(2, "Ryan"));
		list.add(new Customer(3, "Jason"));
		list.add(new Customer(4, "Statham"));
		
		Customer jack = new Customer(1, "Jack");
		if(list.contains(jack)) 
			System.out.println("jack");
		
		if(list.indexOf(jack) != -1) 
			System.out.println(list.indexOf(jack));
		
		for(Customer cust:list) {
			if(cust.getName().equals(jack.getName()))
				System.out.println("true");
		}
		
		Iterator<Customer> itr = list.iterator();
		while(itr.hasNext()) {
			Customer cust = itr.next();
			if(cust.getName().equals("Jason"))
				System.out.println("Jason");
		}
		
		Customer jason = list.stream()
				.filter(cust->cust.getName().equals("Jason"))
				.findAny()
				.orElse(null);
		System.out.println(jason.getId());
		
	}

}
