package playground;

import java.util.function.Function;

class Person{
	private String firstname;
	private String lastname;
	private String middlename;
	public Person(String firstname, String lastname, String middlename) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.middlename = middlename;
	}
}

public class Currying {
	
	public static void main(String[] args) {
		
		Function<String, Function<String, Function<String, Person>>> person 
		= firstname -> lastname -> middlename -> new Person(firstname, lastname, middlename );
		person.apply("Pranesh").apply("Meher").apply("Meher");
		
	}

}
