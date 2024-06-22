package playground;

class Phone{
	private String name;
	private int ram;
	private int price;
	public Phone(String name, int ram, int price) {
		this.name = name;
		this.ram = ram;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Phone [name=" + name + ", ram=" + ram + ", price=" + price + "]";
	}
}

class PhoneBuilder{
	private String name;
	private int ram;
	private int price;
	
	public PhoneBuilder setName(String name) {
		this.name = name;
		return this;
	}
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBuilder setPrice(int price) {
		this.price = price;
		return this;
	}
	public Phone getPhone() {
		return new Phone(name, ram, price);
	} 
}

public class Builder {
	
	public static void main(String[] args) {
		Phone s = new PhoneBuilder().setName("Samsung").setPrice(1000).setRam(4).getPhone();
		System.out.println(s);
	}

}
