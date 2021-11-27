package basic.swapNumbers;

public class Example {

	static void swap(int m, int n) {
		int temp = m;
		m=n;
		n=temp;
		System.out.println(m+" "+n);				
	}
	
	public static void main(String[] args) {
		int m=10, n=20;
		swap(m,n);
		m= m+n;
		n =m-n;
		m=m-n;
		System.out.println(m+" " +n);
	}

}
