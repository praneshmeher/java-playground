package playground;

final class Immutable {
	
	private final String name;
	private final int rollno;
	
	public Immutable(String name, int rollno) {
		this.name=name;
		this.rollno=rollno;
	}

	public String getName() {
		return name;
	}

	public int getRollno() {
		return rollno;
	}
	
	public static void main(String[] args) {
		Immutable im = new Immutable("Pranesh", 1);
		System.out.println(im.getName()+" "+im.getRollno());
	} 

}
